/*
 * main是一个线程
 * 守护线程
 * public final void setDeamon(blloean on)
 * 设置守护线程，一旦(前台)主线程结束就结束守护线程
 */
package com.ThreadDemo;

public class DeamonTest {
	public static void main(String[] args) {
		DeamonDemo d = new DeamonDemo();
		
		Thread d1 = new Thread(d);
		Thread d2 = new Thread(d);

		d1.start();
		d2.start();

	}
}
