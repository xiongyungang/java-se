/*
 * 实现同步的2种方式：
 * 		1同步代码块
 * 		2同步方法
 * 需要用同步代码:
 * 		1是否有共享数据
 * 		2是否多条语句操作共享数据
 * 		3是否在多线程环境中
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

public class TicketRunnable implements Runnable {
	private int ticket = 100;
	Object obj = new Object();// 提供一个锁对象

	@Override
	public void run() {
		int x = 0;
		while (true) {
			if (x%2==0) {
				// 锁机制
				//同步代码块
				synchronized (this) {// 多个线程使用同一个锁对象
					if (ticket > 0) {
						try {
							Thread.sleep(100);
						} catch (InterruptedException e) {
							e.printStackTrace();
						}
						System.out.println(Thread.currentThread().getName() + "正在出售第" + (ticket--) + "张票。");
					}
				}
			} else {
				check();
			}

		}
	}
	
	//同步方法
	//同步方法的锁对象是this对象
	//静态同步方法的锁对象是 类名.class Class类型对象
	private synchronized void check() {
			if (ticket > 0) {
				try {
					Thread.sleep(100);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				System.out.println(Thread.currentThread().getName() + "正在出售第" + (ticket--) + "张票。");
			}
	}

}
