/*
 * �߳����ȼ�
 * IllegalArgumentException
 * 		void setPriority()
 * 		int getPriority():���ȼ���Χ1-10 Ĭ��5
 * ���ȼ���һ���̶������̻߳�ý϶��ִ�л���
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
