package com.string;
/*
 * �ַ�����������
 */
public class String5 {
	public static void main(String[] args) {
		String name="xyg,sll,sjl";
		
		//�滻����
		String newName = name.replace(",", "||");//�滻����
		System.out.println(newName);
		System.out.println(name.replaceAll(",", " "));// �滻����
		System.out.println(name.replaceFirst(",", " "));// �滻��һ��
		
		//�и��
		String nameSz[] = name.split(",");// ���ݷָ����ָ��ַ���
		System.out.println(nameSz[0].toString());

		String address = "  Anhui,Suzhou  ";
		System.out.println(address.trim());// ȥ��β�ո�
		
		//�Ƚ��ַ���
		String s1 = "abc";
		String s2 = "abC";
		System.out.println(s1.compareTo(s2));//�Ƚ��ַ�������ͬ�ַ��������
		System.out.println(s1.compareToIgnoreCase(s2));//ͬ�ϲ����ִ�Сд

	}
}
