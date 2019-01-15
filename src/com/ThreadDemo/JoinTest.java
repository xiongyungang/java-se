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
		tp2.setName("zss");
		tp3.setName("ld");

		tp1.setPriority(10);
		tp2.setPriority(1);
		tp3.setPriority(1);

		tp1.start();
		try {
			tp1.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		tp2.start();
		tp3.start();
	}
}
