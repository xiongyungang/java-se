/*
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
package com.thread;

public class Student {
	private String name;
	private int age;
	private boolean flag = false;// �ȴ����ѱ��

	public synchronized void set(String name, int age) {
		//�����������ȴ�
		if (flag) {
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
		//����ֵ
		this.name=name;
		this.age=age;

		// �޸ı��
		flag = true;
		notify();// ����
	}
	public synchronized void get(){
		//���û�����ݾ͵ȴ�
		if(!flag){
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
		System.out.println(name+" "+age);
		
		//�޸ı��
		flag=false;
		notify();
	}
}
