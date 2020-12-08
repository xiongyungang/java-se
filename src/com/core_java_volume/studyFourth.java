package com.core_java_volume;
/*
 * case��ǩ������char,byte,short,int,Ҳ������string
 *  ���������û��ʵ�ʰ���һ�����󣬶��Ƕ��������
 *  һ��Դ�ļ�ֻ��һ��public�����࣬�κ�һ������Ծ�̬���ݳ�Ա���޸ģ�����Ӱ����������
 *  ��̬��static int i���������಻���ڶ������ж�����һ����̬��
 *  ��̬����ֻ�ܷ����ྲ̬��
 */


import java.util.ArrayList;
public class studyFourth {
	public static void main(String arg[]){
		// fill the staff array with three Employee objects
	      ArrayList<Employee> staff = new ArrayList<>();

	      staff.add(new Employee("Carl Cracker","employee", 75000));
	      staff.add(new Employee("Harry Hacker","employee", 50000));
	      staff.add(new Employee("Tony Tester","employee", 40000));
	   

	      // raise everyone's salary by 5%
	      for (Employee e : staff)
	         e.raiseSalary(5);

	      // print out information about all Employee objects
	      for (Employee e : staff)
	         System.out.println("name=" + e.getName() + ",salary=" + e.getSalary());
	      
	      
	}
}
//class Employee
//{
//   private final String name;//finalʵ���򣬹�����������ʼ���������޸�
//   private static int nextId = 1;//��̬�������಻���ڶ������ж�����һ����̬��
//   
//   private double salary;
//   //private String hireDay;
//
//   public Employee(String n, double s)
//   {
//      name = n;
//      salary = s;
//      //hireDay = LocalDate.of(year, month, day);
//   }
//
//   public String getName()
//   {
//      return name;
//   }
//
//   public double getSalary()
//   {
//      return salary;
//   }
//
////   public LocalDate getHireDay()
////   {
////      return hireDay;
////   }
//
//   public void raiseSalary(double byPercent)
//   {
//      double raise = salary * byPercent / 100;
//      salary += raise;
//   }
//}

