package com.core_java_volume;
//������
public abstract class Person {//abstract�ؼ���λ��
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
	public abstract String getDescription();//���󷽷�,���������д
}
