package com.thread.communication;

import java.io.IOException;
import java.io.PipedInputStream;
import java.io.PipedOutputStream;

/**
 * 线程间，管道通信
 * PipedOutputStream可以向管道中写入数据，
 * PipedIntputStream可以读取PipedOutputStream向管道中写入的数据，这两个类主要用来完成线程之间的通信
 *
 * PipedInputStream中，有一个buffer字节数组，默认大小为1024，作为缓冲区
 */
public class PipedDemo {
    public static void main(String[] args) throws IOException, InterruptedException {
        PipedInputStream pipedInputStream = new PipedInputStream();
        PipedOutputStream pipedOutputStream = new PipedOutputStream();

        //pipedInputStream.connect(pipedOutputStream);  // 效果相同
        pipedOutputStream.connect(pipedInputStream);

        new Thread(new WriteThread(pipedOutputStream)).start();
        Thread.sleep(1000);
        new Thread(new ReadThread(pipedInputStream)).start();
    }
}

// 写线程
class WriteThread implements Runnable {
    PipedOutputStream pipedOutputStream;

    public WriteThread(PipedOutputStream pipedOutputStream) {
        this.pipedOutputStream = pipedOutputStream;
    }

    @Override
    public void run() {
        System.out.println("write:");
        try {
            for (int i = 0; i < 30; i++) {
                System.out.print(i);
                byte[] bytes = Integer.toString(i).getBytes();
                pipedOutputStream.write(bytes);
            }
            pipedOutputStream.close();
            System.out.println();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

// 读线程
class ReadThread implements Runnable {
    PipedInputStream pipedInputStream;

    public ReadThread(PipedInputStream pipedInputStream) {
        this.pipedInputStream = pipedInputStream;
    }

    @Override
    public void run() {
        byte[] bytes = new byte[20];
        try {
            int length = pipedInputStream.read(bytes);
            System.out.println("read:");
            // -1 表示读取完了
            while (-1 != length) {
                String s = new String(bytes, 0, length);
                System.out.print(s);
                length = pipedInputStream.read(bytes);
            }
            pipedInputStream.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

/**
 * output:
 *
     write:
     01234567891011121314151617181920212223242526272829
     read:
     01234567891011121314151617181920212223242526272829
 *
 */
