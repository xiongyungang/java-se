/*
 * 暂停线程
 * public static void yield()----Thread:暂停当前正在执行的线程，并执行其他线程
 * 
 * 使用yield()的目的是让相同优先级的线程之间能适当的轮转执行。但是，实际中无法保证yield()达到让步目的
 * 因为让步的线程还有可能被线程调度程序再次选中。
 */
package com.ThreadDemo;

public class YieldTest {
	public static void main(String args[]) {
		YieldDemo y = new YieldDemo();
		
		Thread t1 = new Thread(y);
		Thread t2 = new Thread(y);
		
		t1.setName("xyg");
		t2.setName("zss");
		
		t1.start();
		t2.start();
	}
}
