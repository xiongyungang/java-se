package com.string;

/*
 * �ַ���������
 */
public class Test {
	public static void main(String[] args) {
		String str = "hello";
		change(str);//���ݵ����ַ�������
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
