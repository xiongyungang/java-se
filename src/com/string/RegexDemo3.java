package com.string;
/**
 * 正则表达式的替换功能
 * @author Administrator
 *
 */
public class RegexDemo3 {
	public static void main(String[] args) {
		String str = "fdjdfj2343242jlj2342jljljlljjl";
		String result = str.replaceAll("\\d", "*");
		System.out.println(result);
	}
}
