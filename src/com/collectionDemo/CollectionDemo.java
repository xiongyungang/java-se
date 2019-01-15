package com.collectionDemo;

/*
 *collection: 	List	 
 *				set
 *List:
 *	ArrayList 数组实现查询快增删慢
 *	Vector	数组实现
 *	LinkedList 链表实现增删快
 *set:
 *	HashSet
 *	TreeSet
 *
 */
import java.time.LocalDate;
import java.util.*;

import org.junit.Test;

import com.Employee;
import com.Student;

public class CollectionDemo {
	public static void main(String a[]) {
		// collention();
		// iteratorDemo();
		list();
		// arraylist();
		// vectorTest();
		// hashSetTest();
		// treeSetTest();

	}

	// TreeSet
	public static void treeSetTest() {
		// 去重复，可排序，默认自然排序
		// 自然排序实现comparable接口，无参构造
		// 比较器接口 comparator,带参构造
		TreeSet<Student> staff = new TreeSet<>();
		staff.add(new Student("xyg", 123));
		staff.add(new Student("xyg", 456));
		staff.add(new Student("xygd", 456));
		staff.add(new Student("jlzfd", 456));
		staff.add(new Student("jlzdfd", 325));
		for (Student e : staff)
			System.out.println(e.toSting());

	}

	// HashSet对象去重复
	public static void hashSetTest() {
		HashSet<Employee> staff = new HashSet<Employee>();
		staff.add(new Employee("xygj", "emp", 5000));
		staff.add(new Employee("xygf", "mag", 6000));
		staff.add(new Employee("lsxdf", "emp", 5000));
		staff.add(new Employee("xygdfsf", "emp", 5000));

		// for(Employee s:staff)
		// System.out.println(s.toString());
		//
		Iterator<Employee> it = staff.iterator();
		while (it.hasNext())
			System.out.println(it.next().toString());
	}

	// Collection接口
	public static void collention() {
		Collection staff = new ArrayList();
		staff.add("hello");
		staff.add("world");
		staff.add("my name is lilei!");
		System.out.println("size:" + staff.size() + "  " + staff);

		// 判断
		System.out.println("contains:" + staff.contains("hello"));
		// containsAll()包含全部集合元素返回真
		// isEmpty()

		// 删除
		staff.remove("world");
		System.out.println("size:" + staff.size() + "  " + staff);
		// staff.clear();
		// System.out.println("isEmpty:"+staff.isEmpty());

		// 添加集合
		Collection temp = new ArrayList();
		temp.add("age");
		temp.add("fifteen");
		staff.addAll(temp);
		System.out.println("addAll:" + staff);
		staff.removeAll(temp);// 删除整个集合元素
		System.out.println("removeAll:" + staff);
		;
	}

	// 迭代器
	public static void iteratorDemo() {
		Collection staff = new ArrayList();
		staff.add("hello");
		staff.add("world");
		staff.add("java");

		// 转数组
		Object[] obj = staff.toArray();
		String[] str = new String[3];
		for (int i = 0; i < staff.size(); i++)
			str[i] = (String) obj[i];
		System.out.println(Arrays.toString(str));

		// 迭代器
		// 通过集合对象获取迭代器对象
		Iterator it = staff.iterator();// iterator()返回Iterator子类对象
		// Object next()获取元素并移动到下一个集合对象
		System.out.println(it.next());
		// boolean hasNext() 如果还有元素
		while (it.hasNext()) {
			System.out.println(it.next());
		}
	}

	public static void arraylist() {
		ArrayList array = new ArrayList();

		Student s1 = new Student("xyg", 10);
		Student s2 = new Student("jla", 05);
		Student s3 = new Student("lq", 12);
		Student s4 = new Student("xzy", 16);
		Student s5 = new Student("wfc", 6);
		Student s6 = new Student("xyg", 10);

		array.add(s1);
		array.add(s2);
		array.add(s3);
		array.add(s4);
		array.add(s5);
		array.add(s6);

		ArrayList array2 = new ArrayList();

		Iterator it = array.iterator();
		while (it.hasNext()) {
			Student s = (Student) it.next();
			if (!array2.contains(s)) {
				array2.add(s);
			}
		}
		for (int x = 0; x < array2.size(); x++) {
			Student s = (Student) array2.get(x);
			System.out.println(s.toSting());
		}
	}

	public static void vectorTest() {
		Vector<LocalDate> staff = new Vector<>();
		LocalDate[] birthday = { LocalDate.of(1997, 8, 7), LocalDate.of(1996, 6, 5), LocalDate.of(1988, 5, 30) };
		// add
		staff.addElement(birthday[0]);
		staff.addElement(birthday[1]);
		staff.addElement(birthday[2]);
		// get
		for (int i = 0; i < staff.size(); i++) {
			System.out.println(staff.elementAt(i).toString());
		}
		// 迭代器
		// hasnext() next()
		Enumeration<LocalDate> en = staff.elements();
		while (en.hasMoreElements()) {
			LocalDate s = (LocalDate) en.nextElement();
			System.out.println(s);
		}
	}

	public static void list() {
		List<String> list = new ArrayList<>();
		list.add(0, "java");
		list.add(0, "hello");
		list.add(0,"xyg");
		list.add(1, "world");
		System.out.println("List:" + list);

		// 列表迭代器，特点
		// 迭代器遍历集合时，直接操作原集合会产生并发修改异常
		// 采用列表迭代器或全部集合操作
		ListIterator iterator = list.listIterator();
		// lit.add("java");//头部添加，指针偏移
		while (iterator.hasNext()) {
			System.out.println((String) iterator.next());
		}
		// 逆向遍历需要指针在尾部
//		while (lit.hasPrevious())// 逆向遍历
//			System.out.print((String) lit.previous());
	}
}
