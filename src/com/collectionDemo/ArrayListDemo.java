package com.collectionDemo;

import java.util.ArrayList;

/**
 * 
 * ArrayList��һЩ�﷨ϸ��
 * Ĭ�ϳ���10
 * �ײ���ʹ����Object����ʵ��
 * ��ѯ�죬��ɾ�����̲߳���ȫ
 *
 */
public class ArrayListDemo {
	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(null);
		//��add null�����null�󣬼��Ϸǿ�
		System.out.println(list.isEmpty());
		
		//����
		//list2.retainAll(list)����:list�а���list2��Ԫ�������µ�list2������ֵΪlist2�������޸ı�
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
