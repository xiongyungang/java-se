package com.collectionDemo;

import java.util.Iterator;
import java.util.LinkedList;

/**
 * linkedList
 * 		
 * 		底层双向链表，一般情况增加删除比arraylist快，查询较慢
 * 
 * @author xyg
 *
 */
public class LinkedListDemo {

	public static void main(String[] args) {
		LinkedList<String> linklist = new LinkedList<>();
		linklist.add("hello");
		linklist.addLast("world");//同add()，底层调用同一个方法
		linklist.addFirst("第一");
		Iterator<String> iterator = linklist.iterator();
		while(iterator.hasNext()){
			String string = iterator.next();
			System.out.println(string);
		}
	}

}
