package com.pattern.sigleten;
/*
 * JDK中的单例模式应用：Runtime
 * 
 * 单例模式分类：
 * 				饿汉式：类一加载就创建对象
 * 				懒汉式：调用类方法时创建对象
 */

public class StudentTest {
	public static void main(String[] args) {
		//饿汉式
		Student s1 = Student.getStudent();
		Student s2 = Student.getStudent();
		
		System.out.println(s1==s2);
		
		s1.show();
		s2.show();
		
		//jdk单例
		Runtime r = Runtime.getRuntime();
		
		//懒汉式
		//懒汉式需要加方法锁，保证线程安全
		Teacher t1 = Teacher.getTeacher();
		Teacher t2 = Teacher.getTeacher();
		
		System.out.println(t1==t2);
		
	}
}
