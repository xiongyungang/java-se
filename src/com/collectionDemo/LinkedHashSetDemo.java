package com.collectionDemo;

import java.util.LinkedHashSet;

/**
 * LinkedHashSet:�ײ����ݽṹ�ɹ�ϣ���������ɡ� 
 * ��ϣ��֤Ԫ��Ψһ 
 * ����֤Ԫ�����򣨴洢��ȡ����һ�£�
 *
 */
public class LinkedHashSetDemo {
	public static void main(String[] args) {
		LinkedHashSet<String> set = new LinkedHashSet<String>();
		
		set.add("hello");
		set.add("world");
		set.add("java");
		set.add("hello");
		
		System.out.println(set.toString());
	}
}
