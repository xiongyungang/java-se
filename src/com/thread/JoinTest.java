/*
 * �����߳�
 * public final void join()----Thread:�ȴ����߳���ֹ
 * 
 * һ����join()�̣߳������̱߳���ȴ�
 */
package com.thread;

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
			tp1.join(10);  //  �����̵߳ȴ����߳���ֹ
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		tp2.start();
		tp3.start();
	}
}
