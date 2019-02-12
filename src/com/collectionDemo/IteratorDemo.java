package com.collectionDemo;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/**
 * 集合的迭代器
 * Iterator list.iterator()	返回当前集合的迭代器对象
 * Iterator.hasNext()	判断有无元素
 * Iterator.next()返回当前元素，索引后移
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
			//【ConcurrentModificationException】
//			list.add(23);迭代中不能操作原集合对象
			System.out.println(next);
		}
		
		//使用for优化
		for(Iterator<Object> iterator2 = list.iterator();iterator2.hasNext();){
//			Object next = iterator.next();
//			System.out.println(next);
		}
	}
}
