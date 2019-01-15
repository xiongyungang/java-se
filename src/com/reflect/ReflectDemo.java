package com.reflect;

/*
 * ���䣺������״̬�£�ͨ��class�ļ�����ȥʹ�ù��췽������Ա��������Ա����
 * 
 * ��ȡclass�ļ����ֽ������
 */
public class ReflectDemo {
	public static void main(String[] args) throws ClassNotFoundException {
		
		//��ʽ1 ͨ��Object���getClass����
		Person p = new Person();
		Class c1 = p.getClass();

		Person p2 = new Person();
		Class c2 = p2.getClass();

		System.out.println(p == p2);
		System.out.println(c1 == c2);//true һ������ֽ������ֻ��һ��
		
		//��ʽ2 �������ľ�̬��class����
		Class c3 = Person.class;
		
		//��ʽ3 ͨ��Class��ľ�̬����forName()
	
		Class c4 = Class.forName("com.reflect.Person");
		System.out.println(c1==c4);
	}
}
