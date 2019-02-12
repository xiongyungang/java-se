package com.collectionDemo;

import java.util.ArrayList;

/**
 * 
 * ArrayList的一些语法细节
 * 默认长度10
 * 底层是使用了Object数组实现
 * 查询快，增删慢，线程不安全
 *
 */
public class ArrayListDemo {
	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(null);
		//【add null】添加null后，集合非空
		System.out.println(list.isEmpty());
		
		//交集
		//list2.retainAll(list)方法:list中包含list2的元素生成新的list2，返回值为list2内容有无改变
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		ArrayList<Integer> list2 = new ArrayList<Integer>();
		//list2.add(4);
		list2.add(1);
		list2.add(3);
		list2.add(2);
		System.out.println(list2.retainAll(list));
		System.out.println("list2:"+list2);
	}
}
