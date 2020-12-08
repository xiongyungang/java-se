package com.jvm.classload;

public class MyClassLoadTest {
    public static void main(String[] args) throws ClassNotFoundException, IllegalAccessException, InstantiationException {
        MyClassLoad myClassLoad = new MyClassLoad("D:\\Person.class");
        Class<?> aClass = myClassLoad.loadClass("com.reflect.Person");
        System.out.println(aClass.getClassLoader());
        Object o = aClass.newInstance();

    }
}
