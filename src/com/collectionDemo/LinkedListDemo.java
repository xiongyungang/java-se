package com.collectionDemo;

import java.util.Iterator;
import java.util.LinkedList;

/**
 * linkedList
 * 		
 * 		�ײ�˫������һ���������ɾ����arraylist�죬��ѯ����
 * 
 * @author xyg
 *
 */
public class LinkedListDemo {

	public static void main(String[] args) {
		LinkedList<String> linklist = new LinkedList<>();
		linklist.add("hello");
		linklist.addLast("world");//ͬadd()���ײ����ͬһ������
		linklist.addFirst("��һ");
		Iterator<String> iterator = linklist.iterator();
		while(iterator.hasNext()){
			String string = iterator.next();
			System.out.println(string);
		}
	}

}
