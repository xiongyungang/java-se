package com.string;

import java.util.ArrayList;
import java.util.List;

/**
 * ������ʽ�ķָ��
 * 
 * @author Administrator
 *
 */
public class RegexDemo2 {
	public static void main(String[] args) {
		String str1 = "ab.cd.ef";
		String str2 = "ab   cd         ef";
		String str3 = "f:\\software\\java";

		// .���������ַ�����ת��
		String[] str4 = str1.split("\\.");
		for (int i = 0; i < str4.length; i++)
			System.out.println(str4[i]);

		String[] str5 = str2.split(" +");
		for (int i = 0; i < str5.length; i++)
			System.out.println(str5[i]);

		// window�̷�Ϊ˫��б�ܣ�ʹ�������ʾΪ�ĸ���б��
		String[] str6 = str3.split("\\\\");
		for (int i = 0; i < str6.length; i++)
			System.out.println(str6[i]);
		
		
		/////////////////////////////
		String string = "91            27              46  38 50";
		String[] strArray = string.split(" +");
		List<Integer> list = new ArrayList<>();
		for(String s :strArray){
			list.add(Integer.parseInt(s));
		}
		list.sort(null);
		System.out.println(list.toString());
	}
}
