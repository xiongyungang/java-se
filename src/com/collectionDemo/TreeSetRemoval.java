package com.collectionDemo;

import java.util.Comparator;
import java.util.TreeSet;
/**
 * TreeSet存储自定义对象并保证排序和唯一：
 * 
 * 该对象实现Comparable接口即可，该接口同时保证对象的排序和唯一
 *
 */
public class TreeSetRemoval {
	public static void main(String[] args) {
		//使用自然排序
		//TreeSet<Teacher> set = new TreeSet<Teacher>();
		
		//使用比较器
		TreeSet<Teacher> set = new TreeSet<Teacher>(new Comparator<Teacher>() {

			@Override
			public int compare(Teacher o1, Teacher o2) {
				return o1.getAge()==o2.getAge()?o1.getName().compareTo(o2.getName()):o1.getAge()-o2.getAge();
			}
		});
		
		set.add(new Teacher("liuqiang",25));
		set.add(new Teacher("liuqiang",24));
		set.add(new Teacher("liuqiang",23));
		set.add(new Teacher("liuqiang",25));
		set.add(new Teacher("jianguo",25));
		set.add(new Teacher("huorong",25));
		
		for(Teacher t:set){
			System.out.println(t.getName()+t.getAge());
		}
		
	}
}

class Teacher implements Comparable<Teacher>{
	private String name;
	private int age;
	
	public Teacher(String name, int age) {
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
	public int compareTo(Teacher o) {
		return age==o.age?name.compareTo(o.name):age-o.age;
	}
	
	
}