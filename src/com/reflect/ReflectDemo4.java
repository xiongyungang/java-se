package com.reflect;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;

/*
 * ͨ�����䣬��ȡ��Ա������ʹ��
 */
public class ReflectDemo4 {
	public static void main(String[] args) throws Exception{
		//��ȡ�ֽ������
		Class c = Class.forName("com.reflect.Person");
		
		//��ȡ��Ա��������
		Field[] fields = c.getFields();//��ȡPublic��Ա����
		for(Field f:fields){
			System.out.println(f);
		}
		System.out.println("----");
		fields = c.getDeclaredFields();//��ȡ���г�Ա����
		for(Field f:fields){
			System.out.println(f);
		}
		
		Field ageField = c.getField("age");//��ȡ������Ա����
		
		Field nameField = c.getDeclaredField("name");//��ȡ����˽�г�Ա
		nameField.setAccessible(true);//����Ϊtrue���ܷ���
		
		//ͨ��Field�������ó�Աֵ
		Constructor con = c.getConstructor();
		Object obj = con.newInstance();
		ageField.set(obj, 12);//��obj�����field�ֶθ�ֵ12
		nameField.set(obj, "xyg");
		
		System.out.println(obj);
		
	}
}
