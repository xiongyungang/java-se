package com;

import com.Outer.Inner;

/**
 * 内部类回顾
 * @author Administrator
 *
 */
public class Outer {
	private static int numOut=1;
	
	/**
	 * 匿名内部类
	 */
	public void method() {
		new Show() {
			@Override
			public void show() {
				System.out.println("hello");
			}
			public void show2(){
				System.out.println("hello2");
			}
		}.show2();
	}
	
	/**
	 * 成员内部类
	 * @author Administrator
	 *
	 */
	public static class Inner{
		public  int numInner=10;
		public  void say(){
			numInner = numOut;
			System.out.println(numInner);
		}
	}
	
	/**
	 * 局部内部类
	 * @param args
	 */
	public void method2(){
		
		class  Inner{
			private int numInners =1;
			public void say(){
				System.out.println(numOut);//可直接访问外部类成员
			}
		}
	}
	
	public static void main(String[] args) {
		
		//匿名内部类
		Outer outer = new Outer();
		outer.method();
	}
}



interface Show {
	public void show();
}
