package com.string;

/**
 * StringBuilder ��ͬ�������̲߳���ȫЧ�ʸߣ������ڵ��߳������ַ����������д������������
 * @author Administrator
 *
 */
public class StringBuilderDemo {
	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder();
		sb.append("hello");
		change(sb);//���ݵ������ã�����ֵ�ı���
		System.out.println(sb);
	}

	private static void change(StringBuilder sb) {
		sb.append("world");
	}
}
