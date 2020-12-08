/*
 * main��һ���߳�
 * �ػ��߳�
 * public final void setDeamon(blloean on)
 * �����ػ��̣߳�һ��(ǰ̨)���߳̽����ͽ����ػ��߳�
 */
package com.thread;

public class DeamonTest {
	public static void main(String[] args) {
		DeamonDemo d = new DeamonDemo();
		
		Thread d1 = new Thread(d);
		Thread d2 = new Thread(d);

		d1.start();
		d2.start();

	}
}
