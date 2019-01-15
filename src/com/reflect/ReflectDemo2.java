package com.reflect;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/*
 * 反射获取构造方法并使用
 * 
 * 构造方法	Constructor
 * 成员变量	Field
 * 成员方法 	Method
 */
public class ReflectDemo2 {
	public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, SecurityException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		//获取字节码文件对象
		Class c = Class.forName("com.reflect.Person");
		//获取构造器对象
//		Constructor[] cons = c.getConstructors();//返回公共构造方法
//		for(Constructor con:cons){
//			System.out.println(con);
//		}
//		
//		cons = c.getDeclaredConstructors();//返回所有构造方法（包含私有）
//		for(Constructor con:cons){
//			System.out.println(con);
//		}
		
		Constructor con = c.getConstructor();//可变参数，此处获取无参构造方法
		System.out.println(con);
		
		//通过构造器对象创建对象
		Object obj = con.newInstance();
		System.out.println(obj);
		
	}
}
