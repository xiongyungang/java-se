package com.core_java_volume;

/**
 * �ڲ���ع�
 * @author Administrator
 *
 */
public class Outer {
	private static int numOut=1;
	
	/**
	 * �����ڲ���
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
	 * ��Ա�ڲ���
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
	 * �ֲ��ڲ���
	 * @param args
	 */
	public void method2(){
		
		class  Inner{
			private int numInners =1;
			public void say(){
				System.out.println(numOut);//��ֱ�ӷ����ⲿ���Ա
			}
		}
	}
	
	public static void main(String[] args) {
		
		//�����ڲ���
		Outer outer = new Outer();
		outer.method();
	}
}



interface Show {
	public void show();
}
