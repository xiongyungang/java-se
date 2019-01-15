package com;
import java.util.ArrayList;
import java.text.DateFormat.Field;
import java.util.*;

/*
 *静态绑定
 *动态绑定
 *final类，不允许扩展，不可覆盖方法，final类中的方法为final方法（成员变量不包括）
 *抽象类 abstract
 *Object 所以类的超类
 *Object类的toString方法
 *泛型数组列表 
 *反射
 */
public class Fifth extends Employee{
	// 仅对本类可见————private
	// 对所有类可见————public
	// 对本包和所有子类可见————protected（默认）
	private double bouns;
	public double setBonus(double tBouns){
		return bouns+=tBouns;
	}
	public Fifth(String n,String des ,double s){
		super(n,des,s);
		bouns = 0;
	}
	public double getSalary(){
		double baseSalary = super.getSalary();
		return baseSalary + bouns;
	}
	public boolean equals(Object otherObject){
		if(this==otherObject)
			return true;
		return true;
	}
	public String toString(){
		return getClass().getName()
				+"[name="+super.getName()
				+",salary="+super.getSalary()
				+"]";
	}
	public static void main(String arg[]){
		//inherit();
		abstractClass();
		//genericArray();
		//wrapper();	
		//varible(3.5,5,-3.5);
		//object();
		try{
			reflection();
		}catch(Exception e){
			//这里，利用Throwable类的 printStackTrace方法打印出栈的轨迹。 
			//Throwable 是 Exception 类的超类
			e.printStackTrace();
		}
	}
	
	//反射
	public static void reflection() throws InstantiationException, IllegalAccessException, ClassNotFoundException, NoSuchFieldException, SecurityException{
		//能否分析类能力的程序称为反射
		Employee employee = new Employee();
		Class cl = employee.getClass();
		System.out.println(cl.getName());
		//一个class对象表示一种类型
		Class cl1 = int.class;//int.class是一个class类型的对象
		System.out.println(Double[].class.getName());//[Ljava.lang.Double
		
		//动态创建一个类的实例，调用默认构造
		String s = "java.util.Random";
		Object obj = Class.forName(s).newInstance();
		
		Employee harry = new Employee("xyg","manger",56);
		Class cl2 = harry.getClass();
		java.lang.reflect.Field f = cl2.getDeclaredField("description");
		f.setAccessible(true);//访问控制,默认false
		//Field.get()返回ojbect对象
		System.out.println(f.get(harry));//得到description的值
		f = cl2.getDeclaredField("salary");
		f.setAccessible(true);//访问控制
		System.out.println(f.getDouble(harry));//返回基本类型
		
	}

	public static void object(){
		//Object类可以应用任意类型
		Object obj1 = new Employee("xyg","employee",30000);
		Object obj2 = "hello";
		//需要知道具体类型，才能进行具体操作
		String str1 = (String)obj2;
		Employee xyg = (Employee)obj1;
		str1.equals(xyg);
		Fifth per= new Fifth("sf","dkl",56);
		System.out.print(per.toString());//Fifth的toString方法
	}
	
	//可变参数方法
	public static void varible(double ...values){
		//参数为Object[]数组，其中保存所有参数
		double largest = Double.NEGATIVE_INFINITY;
		for (double v:values)
			if(v > largest)
				largest = v;
		System.out.print(largest);
	}
	
	//包装器和自动装箱
	public static void wrapper(){
		//包装器：Integer,Long,Float,Double,Short,Byte派生于超类Number
		//character,Void,Boolean
		ArrayList<Integer> list = new ArrayList<>();//这里使用包装器;
		list.add(2);//list.add(Integer.valueOf(3))自动装箱
		int n = list.get(0);//int n = list.get(0).Integer()自动拆箱
		ArrayList<Character> str = new ArrayList<>();
		str.add('5');
		System.out.print(Integer.parseInt("123"));//包装器方法
		
		
	}
	
	//泛型数组列表
	public static void genericArray(){
		ArrayList<Employee> staff = new ArrayList<>(10);//import java.util.ArrayList;
		System.out.println(staff.size());//staff.size is 0
		staff.add(new Employee("xyg","manager",80000));//尾加
		System.out.println(staff.size());//staff.size is 1
		staff.add(0, new Employee("xyg2","manager",80000));//插入
		System.out.println(staff.get(1).getDescription());//获取
		for(Employee a:staff){
			System.out.println(a.getName());
		}
		staff.remove(0);//删除
		
	}
	
	//抽象类
	public static void abstractClass(){
		//包含一个或多个抽象方法的类必须声明为抽象类
		//抽象类的非抽象方法为了子类继承
		//抽象类的抽象方法为了子类实现
		//抽象类的抽象方法必须在子类全部实现
//		Person p("jl");抽象类不能被实例化
		Person p;//但可以引用非抽象子类对象
		Employee per = new Employee("xyg","manager",80000);
		per.setName("zzy");
		System.out.println(per.getName());//可以调用抽象类非抽象方法
	}
	
	//继承操作
	public static void inherit(){
		Fifth boss = new Fifth("XiongYunGang","maneger", 80000);
		boss.setBonus(5000);
	    Employee[] staff = new Employee[4];
	    staff[0] = new Employee("Carl Cracker","employee", 75000);
	    staff[1] = new Employee("Harry Hacker","employee", 50000);
	    staff[2] = new Employee("Tony Tester","employee", 40000);
	    if (staff[1] instanceof Fifth){ //false
	    	Fifth test = (Fifth)staff[1];//ClassCastExceptiong异常,超类引用赋给子类
	    }
	    staff[3] = boss;
	      
	      
//	      for (Employee e : staff)
//	         e.raiseSalary(10);
	      
	      //System.out.println(staff[0].getSalary());

	    for (Employee e : staff)
	    	System.out.println("name=" + e.getName() +"   "+e.getDescription()+ ",salary=" + e.getSalary());
		}
	
}
