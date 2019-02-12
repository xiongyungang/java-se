package com.collectionDemo;

import java.util.HashSet;

/**
 * HashSetµÄÈ¥ÖØ¸´ÅÐ¶Ï£ºhashcode()+equals()
 * @author Administrator
 *
 */
public class HashSetRemoval extends Object{
	public static void main(String[] args) {
		HashSet<Student2> set = new HashSet<Student2>();
		set.add(new Student2("xyg",23));
		set.add(new Student2("xyg",23));
		System.out.println(set.size());
	}
}

class Student2{
	private String name;
	private int age;
	
	public Student2(String name, int age) {
		super();
		this.name = name;
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
		Student2 other = (Student2) obj;
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
