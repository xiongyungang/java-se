package com.core_java_volume;
//抽象类
public abstract class Person {//abstract关键字位置
	private String name;

	public Person(){};
	public Person(String name){
		this.name=name;
	}
	public String getName(){
		return name;
	}

	public void setName(String name){
		this.name=name;
	}
	public String toString(){
		return getClass().getName()+"[name="+name;
	}
	public abstract String getDescription();//抽象方法,子类必须重写
}
