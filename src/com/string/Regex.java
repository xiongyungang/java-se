package com.string;

import java.util.Scanner;

/**
 * 正则表达式的判断
 * 
 * @author Administrator
 *
 */
public class Regex {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String phone = sc.nextLine();
		String qq = sc.nextLine();
		String emall = sc.nextLine();

		// 定义手机号规则
		String regex = "[1][5387]\\d{9}";
		// qq假设7位7开头
		String qqRegex = "[7]\\d{8}";
		// 定义邮箱规则
		//String emallRegex = "[A-Za-z_0-9]+@[A-Za-z_0-9]{1,}\\.[A-Za-z_0-9]{2,3}";
		String emallRegex = "\\w+@\\w\\.\\w{2,3}";

		// Stirng.matches() boolean
		System.out.println(phone.matches(regex));
		System.out.println(qq.matches(qqRegex));
		System.out.println(emall.matches(emallRegex));
	}
}
