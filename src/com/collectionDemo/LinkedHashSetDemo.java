package com.collectionDemo;

import java.util.LinkedHashSet;

/**
 * LinkedHashSet:底层数据结构由哈希表和链表组成。 
 * 哈希表保证元素唯一 
 * 链表保证元素有序（存储和取出是一致）
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
