package com.map;

import java.util.Collection;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

import com.core_java_volume.Employee;
import com.core_java_volume.Student;

/*
 * Map:��ֵ�ԣ�˫�м���
 * Collection:���м���
 */
public class Mapdemo {
	public static void main(String arg[]) {
		// hashMap();

		treeMap();
	}

	private static void hashMap() {
		Map<String, String> staff = new HashMap<>();
		staff.put("001", "xyg");
		staff.put("002", "xyg");
		staff.put("003", "sjz");
		staff.put("003", "nnn");// ����sjz
		staff.put("004", "xjs");
		staff.put("005", "jl");

		System.out.println(staff.remove("004"));// ����ɾ��ֵ
		System.out.println(staff.remove("0045"));
		System.out.println(staff.remove("005", "jl"));// true

		staff.containsKey("001");
		staff.containsValue("xyg");
		staff.isEmpty();

		staff.size();// Key size

		// ��ȡ������
		Set<String> key = staff.keySet();
		for (String e : key)
			System.out.println(e);

		// ��ȡֵ����
		Collection<String> value = staff.values();
		for (String e : value)
			System.out.println(e);

		// staff.get(Key)ͨ������ֵ
		for (String e : key)
			System.out.println("Key:" + e + " Value:" + staff.get(e));

		// �������1
		student();

		// �������2
		employee();

		// �������3
		teacher();
	}

	private static void treeMap() {
		// ȥ�ظ���������
		// �Զ���������ʵ������ӿ�
		TreeMap<Teacher, String> staff = new TreeMap<>(new Comparator<Teacher>() {
			@Override
			public int compare(Teacher o1, Teacher o2) {
				int temp = o1.getAge() - o2.getAge();
				int temp2 = (temp == 0) ? o1.getName().compareTo(o2.getName()) : temp;
				return temp2;
			}

		});
		Teacher t1 = new Teacher("xyg", 22);
		Teacher t2 = new Teacher("xyg", 23);
		Teacher t3 = new Teacher("xyg", 26);
		staff.put(t1, "001");
		staff.put(t2, "002");
		staff.put(t3, "003");
		System.out.println("" + staff);
	}

	private static void teacher() {
		HashMap<Teacher, Integer> staff = new HashMap<Teacher, Integer>();
		Teacher t1 = new Teacher("xyg", 22);
		Teacher t2 = new Teacher("xyg", 22);
		Teacher t3 = new Teacher("xyg", 22);
		System.out.println(t1.equals(t2));
		staff.put(t1, 1001);
		staff.put(t2, 1001);
		staff.put(t3, 1003);
		Set<Teacher> key = staff.keySet();
		for (Teacher e : key)
			System.out.println("ID:" + staff.get(e) + " " + e);
		;

	}

	private static void employee() {
		Employee emp[] = { new Employee("xyg", "emp", 5000), new Employee("xjl", "man", 8000),
				new Employee("lss", "emp", 5000), new Employee("szz", "emp", 3000) };
		HashMap<String, String> staff = new HashMap<>();
		for (Employee e : emp)
			staff.put(e.getName(), e.getDescription());

		// ��ֵ�Զ���
		Set<Map.Entry<String, String>> set = staff.entrySet();
		for (Map.Entry<String, String> e : set)
			System.out.println("NAME:" + e.getKey() + " DEC: " + e.getValue());
		;
	}

	private static void student() {
		Student s[] = { new Student("xyg", 001), new Student("xyg", 002), new Student("xyg", 003),
				new Student("xyg", 004), new Student("xyg", 005) };
		HashMap<Integer, String> stuMap = new HashMap<>();
		for (Student e : s)
			stuMap.put(e.getId(), e.getName());
		// ͨ������ֵ
		Set<Integer> Key = stuMap.keySet();
		for (Integer e : Key)
			System.out.println("ID:" + e + " NAME:" + stuMap.get(e));

	}
}

class Teacher {
	String name;
	int age;

	public Teacher(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public String toString() {
		return "name:" + name + " age:" + age;
	}

	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Teacher other = (Teacher) obj;
		if (age != other.age)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}
}
