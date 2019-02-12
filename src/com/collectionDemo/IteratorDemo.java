package com.collectionDemo;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/**
 * ���ϵĵ�����
 * Iterator list.iterator()	���ص�ǰ���ϵĵ���������
 * Iterator.hasNext()	�ж�����Ԫ��
 * Iterator.next()���ص�ǰԪ�أ���������
 *
 */
public class IteratorDemo {
	public static void main(String[] args) {
		Collection<Object> list = new ArrayList<>();
		list.add("df");
		list.add(1);
		list.add(true);
		list.add('c');
		
		Iterator<Object> iterator = list.iterator();
		while(iterator.hasNext()){
			Object next = iterator.next();
			//��ConcurrentModificationException��
//			list.add(23);�����в��ܲ���ԭ���϶���
			System.out.println(next);
		}
		
		//ʹ��for�Ż�
		for(Iterator<Object> iterator2 = list.iterator();iterator2.hasNext();){
//			Object next = iterator.next();
//			System.out.println(next);
		}
	}
}
