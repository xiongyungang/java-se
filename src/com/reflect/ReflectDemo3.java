package com.reflect;

import java.lang.reflect.Constructor;

/*
 * ͨ���ֽ�����󣬻�ȡ���ι���������������ʵ�ֲ�������������
 */
public class ReflectDemo3{
	public static void main(String[] args) throws Exception {
		//1.��ȡ�ֽ������
		Class c = Class.forName("com.reflect.Person");
		//2.��ȡ����������
		//���ι��췽�� ���ݲ������ֽ������
		Constructor con = c.getConstructor(String.class,int.class);
		//3.��������
		Object obj = con.newInstance("xyg",15);
		
		System.out.println(obj);
	}
}
