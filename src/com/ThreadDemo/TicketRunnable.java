/*
 * ʵ��ͬ����2�ַ�ʽ��
 * 		1ͬ�������
 * 		2ͬ������
 * ��Ҫ��ͬ������:
 * 		1�Ƿ��й�������
 * 		2�Ƿ������������������
 * 		3�Ƿ��ڶ��̻߳�����
 * �ȴ����ѻ��ƣ�
 * 		wait() ���̴߳��ڵȴ�״̬
 * 		notify() ���ѵȴ����߳�
 * 
 * wait()���̱߳����Ѻ󣬼���ִ�У�wait()�������ֺ󣬶�Ӧ���߳̾��ͷ���������
 * 
 * 		wait()��sleep()
 * 		wait()��Object�෽�����ͷ�������
 * 		sleep()��Thread��ĵľ�̬���������ͷ�������
 */
package com.ThreadDemo;

public class TicketRunnable implements Runnable {
	private int ticket = 100;
	Object obj = new Object();// �ṩһ��������

	@Override
	public void run() {
		int x = 0;
		while (true) {
			if (x%2==0) {
				// ������
				//ͬ�������
				synchronized (this) {// ����߳�ʹ��ͬһ��������
					if (ticket > 0) {
						try {
							Thread.sleep(100);
						} catch (InterruptedException e) {
							e.printStackTrace();
						}
						System.out.println(Thread.currentThread().getName() + "���ڳ��۵�" + (ticket--) + "��Ʊ��");
					}
				}
			} else {
				check();
			}

		}
	}
	
	//ͬ������
	//ͬ����������������this����
	//��̬ͬ���������������� ����.class Class���Ͷ���
	private synchronized void check() {
			if (ticket > 0) {
				try {
					Thread.sleep(100);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				System.out.println(Thread.currentThread().getName() + "���ڳ��۵�" + (ticket--) + "��Ʊ��");
			}
	}

}
