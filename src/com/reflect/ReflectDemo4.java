package com.reflect;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;

/*
 * 通过反射，获取成员变量并使用
 */
public class ReflectDemo4 {
	public static void main(String[] args) throws Exception{
		//获取字节码对象
		Class c = Class.forName("com.reflect.Person");
		
		//获取成员变量对象
		Field[] fields = c.getFields();//获取Public成员变量
		for(Field f:fields){
			System.out.println(f);
		}
		System.out.println("----");
		fields = c.getDeclaredFields();//获取所有成员变量
		for(Field f:fields){
			System.out.println(f);
		}
		
		Field ageField = c.getField("age");//获取单个成员变量
		
		Field nameField = c.getDeclaredField("name");//获取单个私有成员
		nameField.setAccessible(true);//设置为true才能访问
		
		//通过Field对象设置成员值
		Constructor con = c.getConstructor();
		Object obj = con.newInstance();
		ageField.set(obj, 12);//给obj对象的field字段赋值12
		nameField.set(obj, "xyg");
		
		System.out.println(obj);
		
	}
}
