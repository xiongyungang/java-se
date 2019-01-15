package com.ThreadDemo;

public class DeamonTest2 {
	public static void main(String[] args) {
		Thread t1 = new Thread(){
			public void run(){
				int s = 0;//记录次数
				while(true){
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
					System.out.printf("守护线程运行：%d次\n",s++);
					}
			}
		};
		
		t1.setDaemon(true);
		t1.start();
		for(int i=0;i<200;i++)
			try {
				Thread.sleep(40);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			};
	}
}
