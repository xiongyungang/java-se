package com.collectionDemo;

import com.Employee;
import com.Person;

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

		TreeSet<TestNoCompa> employees = new TreeSet<>();
		//employees.add(new TestNoCompa());  //java.lang.ClassCastException

		//�Ƚ������򣬹��촫��Ƚ�������
		TreeSet<Integer> treeSetDemo = new TreeSet<Integer>(new MyComparator());
		treeSetDemo.add(3);
		treeSetDemo.add(3);
		treeSetDemo.add(4);
		treeSetDemo.add(2);
		treeSetDemo.add(1);
		System.out.println("treeSetDemo = " + treeSetDemo); // treeSetDemo = [1, 2, 3, 4]

		//�Ƚ�������ʹ�ñȽ������������ڲ��ڷ�ʽ
		TreeSet<Integer> treeSet = new TreeSet<Integer>(new Comparator<Integer>() {

			@Override
			public int compare(Integer o1, Integer o2) {
				return o2-o1;
			}
		});
		treeSet.add(5);
		treeSet.add(2);
		treeSet.add(3);
		treeSet.add(4);
		treeSet.add(1);
		treeSet.add(5);
		System.out.println("treeSet = " + treeSet);  //  treeSet = [5, 4, 3, 2, 1]
	}
}

class MyComparator implements Comparator<Integer>{

	@Override
	public int compare(Integer o1, Integer o2) {
		return o1 - o2;
	}
}

class TestNoCompa
{
	int ele;
}
