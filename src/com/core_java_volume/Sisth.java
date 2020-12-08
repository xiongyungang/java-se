package com.core_java_volume;
/*
 * 	接口implements
 *	Comparable接口
 *	浅拷贝深拷贝 Cloneable
 *	lanbda表达式
 *	内部类
 *
 */

import java.util.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.Timer;



public class Sisth  implements Comparable<Sisth>,Cloneable,Comparator<String>{
	private int id=0;
	private String name;
	
	public Sisth(String name,int id){
		this.id = id;
		this.name = name;
	}
	public int compareTo(Sisth other){//任何实现Comparable接口必须实现此方法
		return Integer.compare(id, other.id);//静态方法返回1 0 -1
	}
	public int compare(String first,String scoend){
		return first.length() - scoend.length();
	}
	public Sisth clone() throws CloneNotSupportedException{//如果一个对象没有定义clone()抛异常
		Sisth cloned =(Sisth)super.clone();
		return cloned;
	}
	public String toString(){
		return getClass().getName()+"[id="
	+id+",name="+name+"]";
	}
	public int getId(){
		return id;
	}
	public void setName(String name){
		this.name=name;
	}
	public static void main(String arg[]){
		interfaceTest();
		arraysSort();
		cloneInfc();
		//lambda();
		innerClass();
	}
	public static void interfaceTest(){
		//interface NAME{}
		//接口方法定义public abstract  
		//域定义public static final,接口只有常量
		//接口可以声明非抽象方法
		//接口没有构造方法
		//接口可以多继承，必须实现所有继承方法
	}
	
	//内部类
	public static void innerClass(){
		//内部类的共有数据域只能被外围类中的方法访问
		//内部类可以访问外围类数据域
		//内部类构造器含有外围类引用参数
		//内部类中声明的所有静态域都必须是 final
		//局部内部类，方法中定义的类，作用域仅在此方法
		
//		TalkingClock clock = new TalkingClock(1000,true);
//		clock.start();
//		// 对话框退出
//		JOptionPane.showMessageDialog(null, "退出程序?");
//		System.exit(0);
		
		//静态内部类 不能访问外围数据域
		double[] value = new double[10];
		for(int i=0;i<value.length;i++)
			value[i]=Math.random()*100;
		ArrayAlg.Pair p = ArrayAlg.minmax(value);
		System.out.println("min = " + p.getMin());
		System.out.println("max = " + p.getMax());
	}
	
	//lanbda表达式
	public static void lambda(){
		//函数式接口：只有一个抽象方法的接口，可以用lambda
		String[] staff = {"abldf","bal","cy"};
		Arrays.sort(staff);
		Arrays.sort(staff,(first,second) -> first.length() - second.length());//////////
		System.out.println(Arrays.toString(staff));
		
//		Timer t = new Timer(1000,event->System.out.println("time:"+new Date()));////////
//		t.start();
//		JOptionPane.showMessageDialog(null, "退出程序?");
//		System.exit(0);
		
		//这里需要提供一个函数式接口
		repeat(10,i -> System.out.println("Countdown: " + (9 - i)));

	}
	public interface IntConsumer{
		void accept(int value);
	}
	public static void repeat(int n, IntConsumer action){
		for(int i=0;i<10;i++)action.accept(i);
	}
	
	//对象排序
	public static void arraysSort(){
		Sisth[] sz = {new Sisth("xyg",56), new Sisth("jsl",59), new Sisth("dss",55)};
		Arrays.sort(sz);//String类型为字典排序
		for(Sisth a: sz)
			System.out.println(a.toString());
		String[] staff = {"abldf","bal","cy"};
		//String 类型长度排序
		Arrays.sort(staff,new Sisth("",0));//这里接受一个实现了Comparator接口的比较器实例
		System.out.println(Arrays.toString(staff));
	}
	
	//对象克隆
	public static void cloneInfc(){
		try{
			Employee original = new Employee("xyg","employee",40000);
			Employee copy = original.clone();
			copy.setName("zss");
			copy.raiseSalary(50);
			System.out.println(original.toString());
			System.out.println(copy.toString());
		}catch(CloneNotSupportedException e)
		{
			e.printStackTrace();
		}	
	}
}

//内部类
class TalkingClock{
	private int interval;
	private boolean beep;
	
	public TalkingClock(int interval,boolean beep){
		this.interval=interval;
		this.beep=beep;
	}
	
	public void start(){
		ActionListener listener = new TimePrinter();
		Timer t = new Timer(interval,listener);
		t.start();
	}
	
	public class TimePrinter implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			System.out.println("At the tone,the time is"+ new Date());
			if(beep)
				Toolkit.getDefaultToolkit().beep();
		}
	}
}
////实现一个匿名内部类
//class TalkingClock2{
//	public void start(int interval,boolean beep){
//		//创建一个实现ActionListenner接口的新对象
//		ActionListener listener = new ActionListenner()
//		{
//			public void actionPerformed(ActionEvent e){
//				System.out.println("At the tone,the time is"+ new Date());
//				if(beep)
//					Toolkit.getDefaultToolkit().beep();
//			}
//		};
//		Timer t = new Timer(interval,listener);
//		t.start();
//	}
//}

//实现一个静态内部类
class ArrayAlg{
	public ArrayAlg(){}
	public static Pair minmax(double[] value){
		double min = Double.POSITIVE_INFINITY;//1.0/0
		double max = Double.NEGATIVE_INFINITY;//-1.0/0
		for(double v:value)
		{
			if(min>v) min = v;
			if(max<v) max = v;
		}
		return new Pair(min,max);
	}
	public static class Pair{
		private double max;
		private double min;
		public Pair(double min2, double max2) {
			max = max2;
			min = min2;
		}
		public double getMax(){
			return max;
		}
		public double getMin(){
			return min;
		}
	}
}