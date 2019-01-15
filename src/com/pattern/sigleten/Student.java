package com.pattern.sigleten;
/*
 * 饿汉式 单列模式
 */
public class Student {
	// 构造私有，外界不能直接创建
	private Student() {
	}

	// 类本身创建一个对象
	//private外界不能干预对象的赋值
	//static静态方法调用静态成员
	private static Student s = new Student();

	// 提供外界访问该对象的方法
	//static静态外界可以直接通过类名访问
	public static Student getStudent() {
		return s;
	}
	
	public void show(){
		System.out.println("hello");
	}

}
