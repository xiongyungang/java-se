package com.thread;

public class MyRunnableDemo {
	public static void main(String arg[]) {
//		MyRunnable my = new MyRunnable();
//		Thread th1 = new Thread(my);
//		Thread th2 = new Thread(my);
//		th1.start();
//		th2.start();
		
		Hero h1 = new Hero("���罣��", 616, 50);
		Hero h2 = new Hero("�޼���ʥ", 300, 30);

		Hero h3 = new Hero("�ͽ�����", 500, 65);
		KillRunnable kill1=new KillRunnable(h1,h2);
		KillRunnable kill2=new KillRunnable(h3,h2);
		Thread k1= new Thread(kill1);
		Thread k2= new Thread(kill2);
		k1.start();
		k2.start();
	}
}
