package com.ThreadDemo;

public class TicketRunnableTest {
	public static void main(String arg[]){
		TicketRunnable t1 = new TicketRunnable();

		Thread tt1= new Thread(t1);
		Thread tt2= new Thread(t1);
		Thread tt3= new Thread(t1);
		Thread tt4= new Thread(t1);
		
		tt1.setName("窗口1");
		tt2.setName("窗口2");
		tt3.setName("窗口3");
		tt4.setName("窗口4");
		
		tt1.start();
		tt2.start();
		tt3.start();
		tt4.start();
	}
}
