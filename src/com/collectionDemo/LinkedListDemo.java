package com.collectionDemo;

import java.util.Iterator;
import java.util.LinkedList;

/**
 * linkedList
 * 		
 * 		底层双向链表，查询慢，增删慢
 * 
 * 		特有方法：
 * 		addLast()
 * 		addFirst()
 * 		removeFirst()
 * 		removeLast()
 * 		getLast()
 * 		getFirst()
 *
 */
public class LinkedListDemo {

	public static void main(String[] args) {
		LinkedList<String> linklist = new LinkedList<>();
		linklist.add("hello");
		linklist.add(",world");
		
		//【addLast()】尾部添加，一般无意义
		linklist.addLast("!");//同add()，底层调用同一个方法
		
		//【addFirst()】头部添加，可以利用此方法实现先进后出
		linklist.addFirst("java,");
		
		//获取首尾
		linklist.getFirst();
		linklist.getLast();
		
		
		Iterator<String> iterator = linklist.iterator();
		while(iterator.hasNext()){
			String string = iterator.next();
			System.out.print(string);
		}
	}

}
