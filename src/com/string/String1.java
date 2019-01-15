package com.string;

/*
 * 字符串常量池：存放字符数组的内存空间（堆）
 * 
 */
public class String1 {
	public static void main(String[] args) {
		//------字符串一旦初始化就不可被改变：字符串常量池里面的值不可改变，并非字符串字符串的引用
		String s1 = "hello";// 加入常量池
		s1 += "world";// 加入常量池，s1指向新生成的字符串，并且hello还在常量池中
		System.out.println(s1);
		String s2 = "hello";// 并不加入常量池即可直接引用
	}
}
