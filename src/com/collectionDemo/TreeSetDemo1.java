package com.collectionDemo;

import java.util.Comparator;
import java.util.HashSet;
import java.util.TreeSet;

/**
 * TreeSet:�ܹ���Ԫ�ذ���ĳ�ֹ��ɽ�������,comparator
 * ����ʽ��
 * A:��Ȼ������Ԫ����������ʵ����Ȼ����comparable�ӿ�
 * B:�Ƚ��������ü��ϵĹ��췽������һ���Ƚ����ӿڵ��������Comparator
 *
 */
public class TreeSetDemo1 {
	public static void main(String[] args) {
		//ʹ���޲ι��죬Ĭ����Ȼ����
		//TreeSet<Integer> treeSet = new TreeSet<Integer>();
		
		//ʹ�ñȽ�������
		//TreeSet<Integer> treeSet = new TreeSet<Integer>(new MyComparator());
		
		//ʹ�ñȽ������������ڲ���
		TreeSet<Integer> treeSet = new TreeSet<Integer>(new Comparator<Integer>() {

			@Override
			public int compare(Integer o1, Integer o2) {
				return o2-o1;
			}
		});
		
		//��Ȼ����+ȥ��
		treeSet.add(5);
		treeSet.add(2);
		treeSet.add(3);
		treeSet.add(4);
		treeSet.add(1);
		treeSet.add(5);
		
		System.out.println(treeSet);
	}
}

class MyComparator implements Comparator<Integer>{

	@Override
	public int compare(Integer o1, Integer o2) {
		return o2-o1;
	}
}
