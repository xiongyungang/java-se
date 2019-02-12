package com.map;

import java.util.HashMap;
import java.util.Set;
/**
 * HashMap去重复，重写元素对象的hashCode()和equals()
 *
 */
public class HashMapRemoval {
	public static void main(String[] args) {
		HashMap<Student,String> hashMap = new HashMap<Student,String>();
		
		hashMap.put(new Student("zhangsan",12), "001");
		hashMap.put(new Student("huangrong",12), "002");
		hashMap.put(new Student("zhangsan",12), "003");
		hashMap.put(new Student("lisi",12), "005");
		
		Set<Student> set = hashMap.keySet();
		for(Student s:set){
			String value = hashMap.get(s);
			System.out.println(s.getName()+s.getAge()+"==="+value);
		}
		
	}
}

class Student{
	private String name;
	private int age;
	
	public Student(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + age;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
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