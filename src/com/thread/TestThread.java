/*
 * ���̣߳���һ���������ж��ִ��·��
 * �߳��ࣺThread
 */
package com.thread;

public class TestThread {
	public static void main(String arg[]) {
		Hero h1 = new Hero("���罣��", 616, 50);
		Hero h2 = new Hero("�޼���ʥ", 300, 30);

		Hero h3 = new Hero("�ͽ�����", 500, 65);
		Hero h4 = new Hero("äɮ", 455, 80);
		
//		KillThread killThread1 = new KillThread(h1,h2);
//		killThread1.start();
//		KillThread killThread2 = new KillThread(h3,h4);
//		killThread2.start();
		
		MyThread my1=new MyThread();//�����߳���
		MyThread my2=new MyThread();
		my1.setName("�߳�1 ");
		my2.setName("�߳�2 ");
		my1.start();
		my2.start();
		
	}
}
