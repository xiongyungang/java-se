package com.string;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * ������ʽ�Ļ�ȡ
 * 
 * @author Administrator
 *
 */
public class RegexDemo4 {
	public static void main(String[] args) {
		String str = "zhangsan lisi wanger mazi";
		String regex = "\\b\\w{4}\\b";//b�����ַ��ٽ磬���ܳ����ַ�
		
		//������ʽ�ı����ʾ
		Pattern pattern = Pattern.compile(regex);
		//���ַ������б�����͵�����
		Matcher matcher = pattern.matcher(str);
		
		while(matcher.find()){
			//matcher.group(0)
			System.out.println(matcher.group(0));
		}
	}
}
