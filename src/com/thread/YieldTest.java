/*
 * ��ͣ�߳�
 * public static void yield()----Thread:��ͣ��ǰ����ִ�е��̣߳���ִ�������߳�
 * 
 * ʹ��yield()��Ŀ��������ͬ���ȼ����߳�֮�����ʵ�����תִ�С����ǣ�ʵ�����޷���֤yield()�ﵽ�ò�Ŀ��
 * ��Ϊ�ò����̻߳��п��ܱ��̵߳��ȳ����ٴ�ѡ�С�
 */
package com.thread;

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
