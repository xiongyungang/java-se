package com.collectionDemo;

/*
 *collection: 	List	 
 *				set
 *List:
 *	ArrayList ����ʵ�ֲ�ѯ����ɾ��
 *	Vector	����ʵ��
 *	LinkedList ����ʵ����ɾ��
 *set:
 *	HashSet
 *	TreeSet
 *
 */
import java.time.LocalDate;
import java.util.*;

import com.core_java_volume.Employee;
import com.core_java_volume.Student;

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
		// ȥ�ظ���������Ĭ����Ȼ����
		// ��Ȼ����ʵ��comparable�ӿڣ��޲ι���
		// �Ƚ����ӿ� comparator,���ι���
		TreeSet<Student> staff = new TreeSet<>();
		staff.add(new Student("xyg", 123));
		staff.add(new Student("xyg", 456));
		staff.add(new Student("xygd", 456));
		staff.add(new Student("jlzfd", 456));
		staff.add(new Student("jlzdfd", 325));
		for (Student e : staff)
			System.out.println(e.toSting());

	}

	// HashSet����ȥ�ظ�
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

	// Collection�ӿ�
	public static void collention() {
		Collection staff = new ArrayList();
		staff.add("hello");
		staff.add("world");
		staff.add("my name is lilei!");
		System.out.println("size:" + staff.size() + "  " + staff);

		// �ж�
		System.out.println("contains:" + staff.contains("hello"));
		// containsAll()����ȫ������Ԫ�ط�����
		// isEmpty()

		// ɾ��
		staff.remove("world");
		System.out.println("size:" + staff.size() + "  " + staff);
		// staff.clear();
		// System.out.println("isEmpty:"+staff.isEmpty());

		// ��Ӽ���
		Collection temp = new ArrayList();
		temp.add("age");
		temp.add("fifteen");
		staff.addAll(temp);
		System.out.println("addAll:" + staff);
		staff.removeAll(temp);// ɾ����������Ԫ��
		System.out.println("removeAll:" + staff);
		;
	}

	// ������
	public static void iteratorDemo() {
		Collection staff = new ArrayList();
		staff.add("hello");
		staff.add("world");
		staff.add("java");

		// ת����
		Object[] obj = staff.toArray();
		String[] str = new String[3];
		for (int i = 0; i < staff.size(); i++)
			str[i] = (String) obj[i];
		System.out.println(Arrays.toString(str));

		// ������
		// ͨ�����϶����ȡ����������
		Iterator it = staff.iterator();// iterator()����Iterator�������
		// Object next()��ȡԪ�ز��ƶ�����һ�����϶���
		System.out.println(it.next());
		// boolean hasNext() �������Ԫ��
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
		// ������
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

		// �б���������ص�
		// ��������������ʱ��ֱ�Ӳ���ԭ���ϻ���������޸��쳣
		// �����б��������ȫ�����ϲ���
		ListIterator iterator = list.listIterator();
		// lit.add("java");//ͷ����ӣ�ָ��ƫ��
		while (iterator.hasNext()) {
			System.out.println((String) iterator.next());
		}
		// ���������Ҫָ����β��
//		while (lit.hasPrevious())// �������
//			System.out.print((String) lit.previous());
	}
}
