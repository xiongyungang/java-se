package com.reflect;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/*
 * �����ȡ���췽����ʹ��
 * 
 * ���췽��	Constructor
 * ��Ա����	Field
 * ��Ա���� 	Method
 */
public class ReflectDemo2 {
	public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, SecurityException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		//��ȡ�ֽ����ļ�����
		Class c = Class.forName("com.reflect.Person");
		//��ȡ����������
//		Constructor[] cons = c.getConstructors();//���ع������췽��
//		for(Constructor con:cons){
//			System.out.println(con);
//		}
//		
//		cons = c.getDeclaredConstructors();//�������й��췽��������˽�У�
//		for(Constructor con:cons){
//			System.out.println(con);
//		}
		
		Constructor con = c.getConstructor();//�ɱ�������˴���ȡ�޲ι��췽��
		System.out.println(con);
		
		//ͨ�����������󴴽�����
		Object obj = con.newInstance();
		System.out.println(obj);
		
	}
}
