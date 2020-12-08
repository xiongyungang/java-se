package com.core_java_volume;

public class Student extends Person implements Comparable<Student>{
	private int id;
	public Student(String name,int id){
		super(name);
		this.id=id;
	}
	public String getName(){
		return super.getName();
	}
	public int getId(){
		return id;
	}
	public String toSting(){
		return "name:"+super.getName()+" id:"+id;
	}
	public boolean equals(Object obj){
		if(this==obj)
			return true;
		if(!(obj instanceof Student))
			return false;
		Student temp = (Student)obj;
		return super.getName().equals(temp.getName()) && this.id==temp.id;
	}
	@Override
	public int compareTo(Student o) {
		int temp1 = getName().length()-o.getName().length();
		int temp2 = (temp1==0)?(this.getName().compareTo(o.getName())):temp1;
		int temp3 = temp2==0?(this.id-o.id):temp2;
		return temp3;
	}
	@Override
	public String getDescription() {
		return null;
	}
	
}
