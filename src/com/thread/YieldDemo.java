package com.thread;

public class YieldDemo implements Runnable{

	@Override
	public void run() {
		for(int i = 0;i<100;i++){
			System.out.println(Thread.currentThread().getName()+"---"+i);
			Thread.yield();
		}
	}

}
