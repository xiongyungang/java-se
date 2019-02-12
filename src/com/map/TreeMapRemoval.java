package com.map;

import java.util.Comparator;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

/**
 * TreeMap实现排序+去重
 *
 */
public class TreeMapRemoval {
	public static void main(String[] args) {
		TreeMap<Star, String> treeMap = new TreeMap<Star,String>(new Comparator<Star>() {
			@Override
			public int compare(Star o1, Star o2) {
				return o1.getAge()==o2.getAge()?o1.getName().compareTo(o2.getName()):o1.getAge()-o2.getAge();
			}
		});
		
		treeMap.put(new Star("yangmi",28), "china");
		treeMap.put(new Star("zengyike",28), "china");
		treeMap.put(new Star("zhaowei",28), "china");
		treeMap.put(new Star("yangmi",27), "china");
		treeMap.put(new Star("yangmi",28), "china");
		
		Set<Entry<Star, String>> entrySet = treeMap.entrySet();
		for(Entry<Star, String> entry:entrySet){
			System.out.println(entry.getKey().getName()+"=="+entry.getKey().getAge());
		}
	}
}

class Star {
	private String name;
	private int age;

	public Star(String name, int age) {
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

}