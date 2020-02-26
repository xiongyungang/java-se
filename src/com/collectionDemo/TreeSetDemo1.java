package com.collectionDemo;

import com.Employee;
import com.Person;

import java.util.Comparator;
import java.util.HashSet;
import java.util.TreeSet;

/**
 * TreeSet:能够对元素按照某种规律进行排序,comparator
 * 排序方式：
 * A:自然排序，让元素所属的类实现自然排序comparable接口
 * B:比较器排序：让集合的构造方法接收一个比较器接口的子类对象Comparator
 *
 */
public class TreeSetDemo1 {
	public static void main(String[] args) {
		//使用无参构造，默认自然排序
		//TreeSet<Integer> treeSet = new TreeSet<Integer>();

		TreeSet<TestNoCompa> employees = new TreeSet<>();
		//employees.add(new TestNoCompa());  //java.lang.ClassCastException

		//比较器排序，构造传入比较器对象
		TreeSet<Integer> treeSetDemo = new TreeSet<Integer>(new MyComparator());
		treeSetDemo.add(3);
		treeSetDemo.add(3);
		treeSetDemo.add(4);
		treeSetDemo.add(2);
		treeSetDemo.add(1);
		System.out.println("treeSetDemo = " + treeSetDemo); // treeSetDemo = [1, 2, 3, 4]

		//比较器排序，使用比较器对象，匿名内部内方式
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
