package com.string;

/*
 * �ַ���ת������
 */
public class String4 {
	public static void main(String[] args) {
		String name = "xyg,ssl,smt";

		byte[] b = name.getBytes();// ���ַ���ת�����ֽ�����
		System.out.println(b);

		char[] chName = name.toCharArray();// ���ַ���ת��Ϊ�ַ�����

		// ���ַ�����ת��Ϊ�ַ����ж��ַ��������죬String��ľ�̬����
		String strName = String.copyValueOf(chName);
		strName = new String(chName);
		strName = String.valueOf(chName);

		// �������������ת��Ϊ�ַ�������
		float f = (float) 3.1415926;
		strName = String.valueOf(f);
		System.out.println(strName);

		System.out.println(name.toLowerCase());// ȫתСд
		System.out.println(name.toUpperCase());// ȫת��д
		
		strName.concat(",xsy");//�ַ���ƴ�ӣ�ͬ��+��
	}
}
