package com.string;

/*
 * 字符串面试题
 */
public class Test {
	public static void main(String[] args) {
		String str = "hello";
		change(str);//传递的是字符串常量
		System.out.println(str);
		
		StringBuffer sb = new StringBuffer(str);
		changeSb(sb);
		System.out.println(sb);
	}

	private static void changeSb(StringBuffer sb) {
		sb.append("world");
	}

	private static void change(String str) {
		str+="world";//str=="helloworld"
	}
}
