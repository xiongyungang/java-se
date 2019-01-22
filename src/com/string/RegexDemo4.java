package com.string;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * 正则表达式的获取
 * 
 * @author Administrator
 *
 */
public class RegexDemo4 {
	public static void main(String[] args) {
		String str = "zhangsan lisi wanger mazi";
		String regex = "\\b\\w{4}\\b";//b代表字符临界，不能出现字符
		
		//正则表达式的编译表示
		Pattern pattern = Pattern.compile(regex);
		//对字符串进行编译解释的引擎
		Matcher matcher = pattern.matcher(str);
		
		while(matcher.find()){
			//matcher.group(0)
			System.out.println(matcher.group(0));
		}
	}
}
