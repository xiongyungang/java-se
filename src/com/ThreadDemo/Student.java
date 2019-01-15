/*
 * 等待唤醒机制：
 * 		wait() 让线程处于等待状态
 * 		notify() 唤醒等待的线程
 * 
 * wait()的线程被唤醒后，继续执行，wait()方法出现后，对应的线程就释放了锁对象
 * 
 * 		wait()和sleep()
 * 		wait()是Object类方法，释放锁对象
 * 		sleep()是Thread类的的静态方法，不释放锁对象
 */
package com.ThreadDemo;

public class Student {
	private String name;
	private int age;
	private boolean flag = false;// 等待唤醒标记

	public synchronized void set(String name, int age) {
		//如果有数据则等待
		if (flag) {
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
		//设置值
		this.name=name;
		this.age=age;

		// 修改标记
		flag = true;
		notify();// 唤醒
	}
	public synchronized void get(){
		//如果没有数据就等待
		if(!flag){
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
		System.out.println(name+" "+age);
		
		//修改标记
		flag=false;
		notify();
	}
}
