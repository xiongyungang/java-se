/*
 * main��һ���߳�
 * �ػ��߳�
 * public final void setDeamon(blloean on)
 * �����ػ��̣߳�һ��(ǰ̨)���߳̽����ͽ����ػ��߳�
 */
package com.ThreadDemo;

public class DeamonTest {
	public static void main(String[] args) {
		DeamonDemo d = new DeamonDemo();
		
		Thread d1 = new Thread(d);
		Thread d2 = new Thread(d);
				
		d1.setDaemon(true);
		d2.setDaemon(true);
		
		d1.start();
		d2.start();

		for(int i = 0;i<10;i++){
			//��ӡmain�߳�(���߳�)�߳���
			System.out.println(Thread.currentThread().getName()+"---"+i);
		}
	}
}
