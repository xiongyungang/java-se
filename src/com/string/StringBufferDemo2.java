package com.string;

/*
 * StringBuffer�Ĺ���
 */
public class StringBufferDemo2 {
	public static void main(String[] args) {
		StringBuffer sb1 = new StringBuffer();
		
		//׷�ӣ�����
		sb1.append("hello");
		sb1.append(3.34).append(true).append(30);//�����������׷��ΪString
		System.out.println(sb1);
		
		sb1.insert(5, "world");//ָ��λ�ò���
		System.out.println(sb1);
		
		//ɾ��
		sb1.deleteCharAt(0);//ɾ��ָ��λ���ַ�
		System.out.println(sb1);
		
		sb1.delete(0, 4);//ָ����ʼ����λ��ɾ��������ҿ�
		System.out.println(sb1);
		
		//��ת
		sb1.reverse();
		System.out.println(sb1);
	}
}
