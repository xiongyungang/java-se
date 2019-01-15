package com.reflect;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

/*
 * ͨ�������ȡ��ĳ�Ա����
 */
public class ReflectDemo5 {
	public static void main(String[] args) throws Exception{
		//��ȡclass
		Class c = Class.forName("com.reflect.Person");
		
		//�õ�����
		Constructor con = c.getConstructor();
		Object obj = con.newInstance();
		
		//��ȡ����
		Method[] methods = c.getMethods();//��ȡ���й����������������෽��
		for(Method m:methods){
			System.out.println(m);
		}
		System.out.println("-----");
		methods = c.getDeclaredMethods();//��ȡ��������з��������������ࣩ
		for(Method m:methods){
			System.out.println(m);
		}
		Method m1 = c.getMethod("show", null);//��ȡ�����޲η���
		m1.invoke(obj, null);//�޲δ���null
		Method m2 = c.getMethod("function", String.class);//��ȡ�����вη���
		m2.invoke(obj, "xyg");
		Method m3 = c.getMethod("returnValue", String.class,int.class);//��ȡ����з���ֵ
		System.out.println(m3.invoke(obj, "����ϼ",38));
		Method m4 = c.getDeclaredMethod("hello",null);//��ȡ˽�з���
		m4.setAccessible(true);
		m4.invoke(obj, null);
		
	}
}
