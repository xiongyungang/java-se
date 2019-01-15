package com.pattern.sigleten;


public class Person {
	private Person(){}
	
	private String name;
	
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

	private int age;
	
	private static Person person = null;
	
	public static synchronized Person getPerson(){
		if(person==null){
			person = new Person();
		}
		return person;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + "]";
	}
	
}
