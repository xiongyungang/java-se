package com.collectionDemo;

import java.util.HashSet;

/**
 * HashSet�Ļ�������
 * 
 * �ײ���һ��hashMap
 * 
 * �ж��ظ���hashCode()+equals()
 */
public class HashSetDemo {
	public static void main(String[] args) {
		HashSet<String> hashSet = new HashSet<String>();

		hashSet.add("hello");
		hashSet.add("hello");
		hashSet.add("hello");
		hashSet.add("hello");
//		String s = null;
//		s.hashCode();

		System.out.println(hashSet);
	}
}
