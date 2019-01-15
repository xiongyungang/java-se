package com.string;

/*
 * 字符串转换功能
 */
public class String4 {
	public static void main(String[] args) {
		String name = "xyg,ssl,smt";

		byte[] b = name.getBytes();// 将字符串转换成字节数组
		System.out.println(b);

		char[] chName = name.toCharArray();// 将字符串转换为字符数组

		// 将字符数组转换为字符串有多种方法，构造，String类的静态方法
		String strName = String.copyValueOf(chName);
		strName = new String(chName);
		strName = String.valueOf(chName);

		// 将任意基本类型转换为字符串类型
		float f = (float) 3.1415926;
		strName = String.valueOf(f);
		System.out.println(strName);

		System.out.println(name.toLowerCase());// 全转小写
		System.out.println(name.toUpperCase());// 全转大写
		
		strName.concat(",xsy");//字符串拼接，同“+”
	}
}
