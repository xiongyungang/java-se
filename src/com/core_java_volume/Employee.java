package com.core_java_volume;

public class Employee extends Person implements Comparable<Employee>,Cloneable{
		//private final String name;//finalʵ���򣬹�����������ʼ���������޸�
	   	//private static int nextId = 1;//��̬�������಻���ڶ������ж�����һ����̬��
	   	private String description;
	   	private double salary;
	   	
	   	
	   	public String getDescription(){
	   		return description;
	   	}
	   	public Employee() {}
	   	public Employee(String n,String des, double s){
	   		super(n);
	   		description = des;
	   		salary = s;
	   	}
	   	public String toString(){
	   		return super.toString()+" salary"+salary+" Description:"+description+"]";
	   	}
	   	public Employee clone() throws CloneNotSupportedException{
	   		Employee copy = (Employee)super.clone();
//	   		copy.salary=this.salary;
	   		return copy;
	   	}
	   	public void setName(String strN){
	   		super.setName(strN);
	   	}
	   	public double getSalary()
	   	{
		   return salary;
	   	}
	   	public void raiseSalary(double byPercent)
	   	{
	      double raise = salary * byPercent / 100;
	      salary += raise;
	   	}
	   	public int compareTo(Employee other){
	   		return Double.compare(salary, other.salary);
	   	}
}
