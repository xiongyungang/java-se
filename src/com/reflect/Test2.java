package com.reflect;

import java.lang.reflect.Method;
import java.util.ArrayList;

/*
 * ���÷���Խ�����ͼ��
 * 
 * ��ArrayList<Interge>�����д洢�ַ���
 */
public class Test2 {
	public static void main(String[] args) throws Exception{
		ArrayList<Integer> list = new ArrayList<>();
		list.add(24);
		list.add(432);
//		list.add("fdjsl");ERROR
		Class c = list.getClass();
		Method m = c.getDeclaredMethod("add", Object.class);//����Ҫ����Object���ֽ���
		m.invoke(list, "hello");
		m.invoke(list, "world");
		System.out.println(list);
	}
}
