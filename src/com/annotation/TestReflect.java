package com.annotation;

import com.reflect.Person;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

@ClassInfo(classname = "com.reflect.Person", methodname = "show")
public class TestReflect {

    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
        //获取当前类字节码
        Class<TestReflect> testReflectClass = TestReflect.class;
        //通过字节码获取当前类的注解对象

        // 这里的 annotation 是实现了ClassInfo接口的子类，故可以调用方法获取返回值（返回定义的值）
        ClassInfo annotation = testReflectClass.getAnnotation(ClassInfo.class);

        // 使用反射拿到配置中类和方法
        Class aClass = Class.forName(annotation.classname());
        Constructor constructor = aClass.getConstructor();
        Person person = (Person) constructor.newInstance();
        person.function("xyg");

    }
}
