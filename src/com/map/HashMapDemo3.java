package com.map;

import java.util.TreeMap;

/**
 * ���ַ���"affdabfdafd"�õ�a(3)b(1)d(3)f(4)
 *
 */
public class HashMapDemo3 {
	public static void main(String[] args) {
		TreeMap<Character, Integer> treeMap = new TreeMap<Character,Integer>();
		String str = "affdabfdafd";
		char[] charArray = str.toCharArray();
		for(char c:charArray){
			//���ݼ���ֵ
			Integer i = treeMap.get(c);
			if(i==null){
				//�������ڣ���ʼ��
				treeMap.put(c, 1);
			}else{
				//�����ڣ�ֵ��1
				i++;
				treeMap.put(c,i);
			}
		}
		System.out.println(treeMap);
	}
}
