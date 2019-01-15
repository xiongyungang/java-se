package com.string;

/*
 * StringBuffer的功能
 */
public class StringBufferDemo2 {
	public static void main(String[] args) {
		StringBuffer sb1 = new StringBuffer();
		
		//追加，插入
		sb1.append("hello");
		sb1.append(3.34).append(true).append(30);//任意基本类型追加为String
		System.out.println(sb1);
		
		sb1.insert(5, "world");//指定位置插入
		System.out.println(sb1);
		
		//删除
		sb1.deleteCharAt(0);//删除指定位置字符
		System.out.println(sb1);
		
		sb1.delete(0, 4);//指定开始结束位置删除，左闭右开
		System.out.println(sb1);
		
		//反转
		sb1.reverse();
		System.out.println(sb1);
	}
}
