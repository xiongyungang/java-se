package com.string;
/*
 * �ַ����жϹ���
 */
public class String2 {
	public static void main(String[] args) {
		String s1 = "hello world";
		s1.equals("hello world");//���ִ�Сд
		s1.equalsIgnoreCase("HELLO WORLD");//�����ִ�Сд
		s1.contains("hello");//����
		s1.startsWith("hello");
		s1.endsWith("world");
		s1.isEmpty();//�ж��Ƿ��ǿմ�,
	}
}
