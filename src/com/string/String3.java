package com.string;
/*
 * �ַ�����ȡ����
 */
public class String3 {
	public static void main(String[] args) {
		String str = "�������heloworld";
		
		System.out.println(str.charAt(0));//�����ַ������������ַ�
		
		System.out.println(str.indexOf("l"));//�����ַ�����һ�γ��ָ����ַ���λ�ã������ڷ���-1
		System.out.println(str.indexOf("l",(str.indexOf("l")+1)));//ͬ��ָ����ʼλ�ã���ͷ��
		System.out.println(str.lastIndexOf("l"));//�����ַ������һ�γ��ָ����ַ���λ��
		
		System.out.println(str.substring(4));//�ַ�����ȡ����ͷ
		System.out.println(str.substring(4, 8));//��ͷ����β
	}
}
