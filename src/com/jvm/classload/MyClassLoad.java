package com.jvm.classload;

import java.io.*;
import java.nio.ByteBuffer;
import java.nio.channels.Channels;
import java.nio.channels.FileChannel;
import java.nio.channels.WritableByteChannel;

/**
 * 自定义类加载器
 *
 * 重写findClass：使用双亲委派模式，委托其父类去加载（因此需要删除父加载器工作目录中的class，让自定义加载器加载）
 *
 * 重写loadClass：不使用双亲委派
 */
public class MyClassLoad extends ClassLoader{
    // 字节码存储地址
    private String path;

    public MyClassLoad(String path) {
        this.path = path;
    }



    public MyClassLoad(ClassLoader parent) {
        super(parent);
    }

    @Override
    protected Class<?> findClass(String name) throws ClassNotFoundException {
        File file = new File(path);

        try {
            // 获取字节码文件的字节数组
            byte[] bytes = getClassBytes(file);
            // 将.class的字节数组转化为Class类实例
            Class<?> myclass = this.defineClass(name, bytes, 0, bytes.length);
            return myclass;
        } catch (IOException e) {
            e.printStackTrace();
        }

        return super.findClass(name);
    }

    // 将文件转换为字节数组
    private byte[] getClassBytes(File file) throws IOException {
        // 获取.class 文件的字节流
        FileInputStream fis = new FileInputStream(file);
        FileChannel fc = fis.getChannel();
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        WritableByteChannel wbc = Channels.newChannel(baos);
        ByteBuffer by = ByteBuffer.allocate(1024);

        while (true)
        {
            int i = fc.read(by);
            if (i == 0 || i == -1)
                break;
            by.flip();
            wbc.write(by);
            by.clear();
        }

        fis.close();

        return baos.toByteArray();
    }
}
