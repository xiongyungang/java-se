package com.collectionDemo;

import java.util.Iterator;
import java.util.LinkedList;

/**
 * linkedList
 * 		
 * 		�ײ�˫��������ѯ������ɾ��
 * 
 * 		���з�����
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
		
		//��addLast()��β����ӣ�һ��������
		linklist.addLast("!");//ͬadd()���ײ����ͬһ������
		
		//��addFirst()��ͷ����ӣ��������ô˷���ʵ���Ƚ����
		linklist.addFirst("java,");
		
		//��ȡ��β
		linklist.getFirst();
		linklist.getLast();
		
		
		Iterator<String> iterator = linklist.iterator();
		while(iterator.hasNext()){
			String string = iterator.next();
			System.out.print(string);
		}
	}

}
