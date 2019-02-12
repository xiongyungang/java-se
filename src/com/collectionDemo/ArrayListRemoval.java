package com.collectionDemo;

import java.util.ArrayList;

/**
 * ArrayList的对象元素去重
 * 
 * contains内部调用equals方法，自定义对象不重写equals方法默认比较地址
 *
 */
public class ArrayListRemoval{
	public static void main(String[] args) {
		ArrayList<Student> list = new ArrayList<Student>();
		Student[] students = new Student[5];
		students[0] = new Student(1,"xyg",1001);
		students[1] = new Student(1,"xyg",1001);
		students[2] = new Student(1,"xyg",1001);
		students[3] = new Student(1,"xyg",1001);
		students[4] = new Student(1,"xyg",1001);
		
		for(int i=0;i<students.length;i++){
			if(list.contains(students[i])){
				continue;
			}
			list.add(students[i]);
		}
		
		System.out.println(list);
	}
}

class Student{
	private Integer age;
	private String name;
	private Integer id;
	
	public Student() {
		super();
	}

	public Student(Integer age, String name, Integer id) {
		super();
		this.age = age;
		this.name = name;
		this.id = id;
	}

	@Override
	public String toString() {
		return "Student [age=" + age + ", name=" + name + ", id=" + id + "]";
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		if (age == null) {
			if (other.age != null)
				return false;
		} else if (!age.equals(other.age))
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}
	
	
	
	
}
