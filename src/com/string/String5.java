package com.string;
/*
 * 字符串其他功能
 */
public class String5 {
	public static void main(String[] args) {
		String name="xyg,sll,sjl";
		
		//替换功能
		String newName = name.replace(",", "||");//替换所有
		System.out.println(newName);
		System.out.println(name.replaceAll(",", " "));// 替换所有
		System.out.println(name.replaceFirst(",", " "));// 替换第一个
		
		//切割功能
		String nameSz[] = name.split(",");// 根据分隔符分隔字符串
		System.out.println(nameSz[0].toString());

		String address = "  Anhui,Suzhou  ";
		System.out.println(address.trim());// 去首尾空格
		
		//比较字符串
		String s1 = "abc";
		String s2 = "abC";
		System.out.println(s1.compareTo(s2));//比较字符串，不同字符相减操作
		System.out.println(s1.compareToIgnoreCase(s2));//同上不区分大小写

	}
}
