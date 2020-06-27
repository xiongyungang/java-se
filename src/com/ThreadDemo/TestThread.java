/*
 * 多线程：在一个进程中有多个执行路劲
 * 线程类：Thread
 */
package com.ThreadDemo;

public class TestThread {
	public static void main(String arg[]) {
		Hero h1 = new Hero("疾风剑豪", 616, 50);
		Hero h2 = new Hero("无极剑圣", 300, 30);

		Hero h3 = new Hero("赏金猎人", 500, 65);
		Hero h4 = new Hero("盲僧", 455, 80);
		
//		KillThread killThread1 = new KillThread(h1,h2);
//		killThread1.start();
//		KillThread killThread2 = new KillThread(h3,h4);
//		killThread2.start();
		
		MyThread my1=new MyThread();//设置线程名
		MyThread my2=new MyThread();
		my1.setName("线程1 ");
		my2.setName("线程2 ");
		my1.start();
		my2.start();
		
	}
}
