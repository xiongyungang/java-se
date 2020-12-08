package com.core_java_volume;
/*
 * 	�ӿ�implements
 *	Comparable�ӿ�
 *	ǳ������� Cloneable
 *	lanbda���ʽ
 *	�ڲ���
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
	public int compareTo(Sisth other){//�κ�ʵ��Comparable�ӿڱ���ʵ�ִ˷���
		return Integer.compare(id, other.id);//��̬��������1 0 -1
	}
	public int compare(String first,String scoend){
		return first.length() - scoend.length();
	}
	public Sisth clone() throws CloneNotSupportedException{//���һ������û�ж���clone()���쳣
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
		//�ӿڷ�������public abstract  
		//����public static final,�ӿ�ֻ�г���
		//�ӿڿ��������ǳ��󷽷�
		//�ӿ�û�й��췽��
		//�ӿڿ��Զ�̳У�����ʵ�����м̳з���
	}
	
	//�ڲ���
	public static void innerClass(){
		//�ڲ���Ĺ���������ֻ�ܱ���Χ���еķ�������
		//�ڲ�����Է�����Χ��������
		//�ڲ��๹����������Χ�����ò���
		//�ڲ��������������о�̬�򶼱����� final
		//�ֲ��ڲ��࣬�����ж�����࣬��������ڴ˷���
		
//		TalkingClock clock = new TalkingClock(1000,true);
//		clock.start();
//		// �Ի����˳�
//		JOptionPane.showMessageDialog(null, "�˳�����?");
//		System.exit(0);
		
		//��̬�ڲ��� ���ܷ�����Χ������
		double[] value = new double[10];
		for(int i=0;i<value.length;i++)
			value[i]=Math.random()*100;
		ArrayAlg.Pair p = ArrayAlg.minmax(value);
		System.out.println("min = " + p.getMin());
		System.out.println("max = " + p.getMax());
	}
	
	//lanbda���ʽ
	public static void lambda(){
		//����ʽ�ӿڣ�ֻ��һ�����󷽷��Ľӿڣ�������lambda
		String[] staff = {"abldf","bal","cy"};
		Arrays.sort(staff);
		Arrays.sort(staff,(first,second) -> first.length() - second.length());//////////
		System.out.println(Arrays.toString(staff));
		
//		Timer t = new Timer(1000,event->System.out.println("time:"+new Date()));////////
//		t.start();
//		JOptionPane.showMessageDialog(null, "�˳�����?");
//		System.exit(0);
		
		//������Ҫ�ṩһ������ʽ�ӿ�
		repeat(10,i -> System.out.println("Countdown: " + (9 - i)));

	}
	public interface IntConsumer{
		void accept(int value);
	}
	public static void repeat(int n, IntConsumer action){
		for(int i=0;i<10;i++)action.accept(i);
	}
	
	//��������
	public static void arraysSort(){
		Sisth[] sz = {new Sisth("xyg",56), new Sisth("jsl",59), new Sisth("dss",55)};
		Arrays.sort(sz);//String����Ϊ�ֵ�����
		for(Sisth a: sz)
			System.out.println(a.toString());
		String[] staff = {"abldf","bal","cy"};
		//String ���ͳ�������
		Arrays.sort(staff,new Sisth("",0));//�������һ��ʵ����Comparator�ӿڵıȽ���ʵ��
		System.out.println(Arrays.toString(staff));
	}
	
	//�����¡
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

//�ڲ���
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
////ʵ��һ�������ڲ���
//class TalkingClock2{
//	public void start(int interval,boolean beep){
//		//����һ��ʵ��ActionListenner�ӿڵ��¶���
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

//ʵ��һ����̬�ڲ���
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