package com.reflect;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

/*
 * 通过反射获取类的成员方法
 */
public class ReflectDemo5 {
	public static void main(String[] args) throws Exception{
		//获取class
		Class c = Class.forName("com.reflect.Person");
		
		//拿到对象
		Constructor con = c.getConstructor();
		Object obj = con.newInstance();
		
		//获取方法
		Method[] methods = c.getMethods();//获取所有公共方法，包括父类方法
		for(Method m:methods){
			System.out.println(m);
		}
		System.out.println("-----");
		methods = c.getDeclaredMethods();//获取本类的所有方法（不包括父类）
		for(Method m:methods){
			System.out.println(m);
		}
		Method m1 = c.getMethod("show", null);//获取单个无参方法
		m1.invoke(obj, null);//无参传递null
		Method m2 = c.getMethod("function", String.class);//获取单个有参方法
		m2.invoke(obj, "xyg");
		Method m3 = c.getMethod("returnValue", String.class,int.class);//夺取多参有返回值
		System.out.println(m3.invoke(obj, "林青霞",38));
		Method m4 = c.getDeclaredMethod("hello",null);//获取私有方法
		m4.setAccessible(true);
		m4.invoke(obj, null);
		
	}
}
