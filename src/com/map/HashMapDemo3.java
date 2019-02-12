package com.map;

import java.util.TreeMap;

/**
 * 由字符串"affdabfdafd"得到a(3)b(1)d(3)f(4)
 *
 */
public class HashMapDemo3 {
	public static void main(String[] args) {
		TreeMap<Character, Integer> treeMap = new TreeMap<Character,Integer>();
		String str = "affdabfdafd";
		char[] charArray = str.toCharArray();
		for(char c:charArray){
			//根据键找值
			Integer i = treeMap.get(c);
			if(i==null){
				//键不存在，初始化
				treeMap.put(c, 1);
			}else{
				//键存在，值加1
				i++;
				treeMap.put(c,i);
			}
		}
		System.out.println(treeMap);
	}
}
