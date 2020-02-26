package com.collectionDemo;

import java.util.HashSet;
import java.util.Iterator;

/**
 * HashSet的基本操作
 * 
 * 底层是一个hashMap
 * 
 * 判断重复：hashCode()+equals()
 */
public class HashSetDemo {
	public static void main(String[] args) {
		HashSet<String> hashSet = new HashSet<String>();

		hashSet.add(null);
		System.out.println("hashSet = " + hashSet.isEmpty()); // false

		hashSet.add("hello");
		hashSet.add("world");
		hashSet.add("!");

		//  支持迭代器和加强for遍历
		for (Object e :
				hashSet) {
			System.out.println("e = " + e);
		}

		Iterator<String> iterator = hashSet.iterator();
		while (iterator.hasNext())
		{
			String next = iterator.next();
			System.out.println("next = " + next);
		}

		System.out.println(hashSet);
	}
}
