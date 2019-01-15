package com.ThreadDemo;

public class JoinDemo implements Runnable{
	@Override
	public void run() {
			for(int i = 0;i<100;i++){
		System.out.println(Thread.currentThread().getName()+"---"+i);
		Thread.yield();
	}
	}
}
