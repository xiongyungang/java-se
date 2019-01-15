/*
 * 线程优先级
 */
package com.ThreadDemo;

public class PriorityDemo implements Runnable{

	@Override
	public void run() {
		for(int i = 0;i<100;i++){
			System.out.println(Thread.currentThread().getName()+"---"+i);
			try {
				Thread.sleep(50);
			} catch (InterruptedException e) {e.printStackTrace();
			}
		}
	}

}
