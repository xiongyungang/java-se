package com.reflect;

import java.lang.reflect.Constructor;

/*
 * 通过字节码对象，获取带参构造器，创建对象，实现不导包创建对象
 */
public class ReflectDemo3{
	public static void main(String[] args) throws Exception {
		//1.获取字节码对象
		Class c = Class.forName("com.reflect.Person");
		//2.获取构造器对象
		//带参构造方法 传递参数的字节码对象
		Constructor con = c.getConstructor(String.class,int.class);
		//3.创建对象
		Object obj = con.newInstance("xyg",15);
		
		System.out.println(obj);
	}
}
