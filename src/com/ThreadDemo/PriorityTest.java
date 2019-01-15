/*
 * 线程优先级
 * IllegalArgumentException
 * 		void setPriority()
 * 		int getPriority():优先级范围1-10 默认5
 * 优先级在一定程度上让线程获得较多的执行机会
 */

package com.ThreadDemo;

public class PriorityTest {
	public static void main(String[] args) {
		PriorityDemo p = new PriorityDemo();

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
		tp2.start();
		tp3.start();
	}
}
