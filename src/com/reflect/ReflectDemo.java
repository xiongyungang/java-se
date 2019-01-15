package com.reflect;

/*
 * 反射：在运行状态下，通过class文件对象，去使用构造方法，成员变量，成员方法
 * 
 * 获取class文件（字节码对象）
 */
public class ReflectDemo {
	public static void main(String[] args) throws ClassNotFoundException {
		
		//方式1 通过Object类的getClass方法
		Person p = new Person();
		Class c1 = p.getClass();

		Person p2 = new Person();
		Class c2 = p2.getClass();

		System.out.println(p == p2);
		System.out.println(c1 == c2);//true 一个类的字节码对象只有一个
		
		//方式2 任意对象的静态的class属性
		Class c3 = Person.class;
		
		//方式3 通过Class类的静态方法forName()
	
		Class c4 = Class.forName("com.reflect.Person");
		System.out.println(c1==c4);
	}
}
