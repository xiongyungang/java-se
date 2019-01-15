package com.string;
/*
 * 字符串判断功能
 */
public class String2 {
	public static void main(String[] args) {
		String s1 = "hello world";
		s1.equals("hello world");//区分大小写
		s1.equalsIgnoreCase("HELLO WORLD");//不区分大小写
		s1.contains("hello");//包含
		s1.startsWith("hello");
		s1.endsWith("world");
		s1.isEmpty();//判断是否是空串,
	}
}
