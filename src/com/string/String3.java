package com.string;
/*
 * 字符串获取功能
 */
public class String3 {
	public static void main(String[] args) {
		String str = "你好世界heloworld";
		
		System.out.println(str.charAt(0));//返回字符串给定索引字符
		
		System.out.println(str.indexOf("l"));//返回字符串第一次出现给定字符的位置，不存在返回-1
		System.out.println(str.indexOf("l",(str.indexOf("l")+1)));//同上指定开始位置（包头）
		System.out.println(str.lastIndexOf("l"));//返回字符串最后一次出现给定字符的位置
		
		System.out.println(str.substring(4));//字符串截取，包头
		System.out.println(str.substring(4, 8));//包头不包尾
	}
}
