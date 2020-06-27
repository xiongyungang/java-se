/*
 * 加入线程
 * public final void join()----Thread:等待该线程终止
 * 
 * 一旦有join()线程，其他线程必须等待
 */
package com.ThreadDemo;

public class JoinTest {
	public static void main(String[] args) {
		JoinDemo p = new JoinDemo();

		Thread tp1 = new Thread(p);
		Thread tp2 = new Thread(p);
		Thread tp3 = new Thread(p);

		tp1.setName("xyg");
		tp2.setName("fuck");
		tp3.setName("wdnmd");


		tp1.start();
		try {
			tp1.join(10);  //  其他线程等待该线程终止
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		tp2.start();
		tp3.start();
	}
}
