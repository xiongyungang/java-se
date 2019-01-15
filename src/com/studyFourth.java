package com;
/*
 * case标签可以是char,byte,short,int,也可以是string
 *  对象变量并没有实际包含一个对象，而是对象的引用
 *  一个源文件只有一个public共有类，任何一个对象对静态数据成员的修改，都会影响其它对象
 *  静态域（static int i），属于类不属于对象，所有对象共享一个静态域
 *  静态方法只能访问类静态域
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
//   private final String name;//final实列域，构建对象必须初始化，不能修改
//   private static int nextId = 1;//静态域，属于类不属于对象，所有对象共享一个静态域
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

