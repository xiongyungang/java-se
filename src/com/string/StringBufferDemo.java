package com.string;

/*
 * StringBuffer:�ַ�����������
 * 				���û��������ƣ���ֵ�ɸı�
 */
public class StringBufferDemo {
	public static void main(String[] args) {
		//��ʽ1
		StringBuffer strBuf = new StringBuffer();
		// strBuf.append("world");//strBuf����ָ��ԭ���Ķ���
		System.out.println(strBuf);
		System.out.println(strBuf.length());// �ַ�����
		System.out.println(strBuf.capacity());// �ַ�����Ĭ��16��ʵ�ʳ���
		
		//��ʽ2
		StringBuffer strBuf2 = new StringBuffer(100);//ָ������
		System.out.println(strBuf2);
		System.out.println(strBuf2.length());
		System.out.println(strBuf2.capacity());
		
		//��ʽ3
		StringBuffer strBuf3 = new StringBuffer("helloworld");
		System.out.println(strBuf3);
		System.out.println(strBuf3.length());
		System.out.println(strBuf3.capacity());
	}
}
