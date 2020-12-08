package com.jvm.classload;

/**
 * 类加载器：
 *
 * AppClassLoader:应用类加载器
 * 负责加载Java的扩展类库,默认加载JAVA_HOME/jre/lib/ext/目录下的所有jar包或者由java.ext.dirs系统属性指定的jar包.放入这个目录下的jar包对AppClassLoader加载器都是可见的(因为ExtClassLoader是AppClassLoader的父加载器,并且Java类加载器采用了委托机制)
 *
 * ExtClassLoader：扩展类加载器
 * 负责加载Java的扩展类库,默认加载JAVA_HOME/jre/lib/ext/目录下的所有jar包或者由java.ext.dirs系统属性指定的jar包.放入这个目录下的jar包对AppClassLoader加载器都是可见的(因为ExtClassLoader是AppClassLoader的父加载器,并且Java类加载器采用了委托机制)
 *
 * BootstrapClassLoader：启动类加载器
 * 负责加载JDK中的核心类库，如：rt.jar、resources.jar、charsets.jar等
 *
 * 双亲委派机制：
 * AppClassLoader =》 ExtClassLoader =》 BootstrapClassLoader
 *
 *
 *
 */
public class ClassLoaderDemo {

    public static void main(String[] args) {
        ClassLoaderDemo myclass = new ClassLoaderDemo();

        Class<? extends ClassLoaderDemo> aClass = myclass.getClass();

        /**
         * 1. 类加载器收到加载请求，加载ClassLoader类
         * 2. AppClassLoader将这个请求委托给父类加载器去完成，一直向上委托，直到BootstrapClassLoader
         * 3. BootstrapClassLoader、ExtClassLoader都未找到ClassLoader
         * 4. 最终由AppClassLoader在用户目录找到该类，并完成加载
         */
        System.out.println(aClass.getClassLoader());  // AppClassLoader

        System.out.println(aClass.getClassLoader().getParent());  // ExtClassLoader

        System.out.println(aClass.getClassLoader().getParent().getParent()); // BootstrapClassLoader，返回null，java不可见
    }
}
