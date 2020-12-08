package com.thread.status;

/**
 *
 */
public class ThreadStatus {
    public static void main(String[] args) {
        Thread thread = new Thread(() -> {
            for (int i = 0; i < 10; i++) {
                try {
                    Thread.sleep(1);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        thread.start();

        while (true) {
            if (thread.getState() == Thread.State.TERMINATED) {
                System.out.println("thread = " + thread.getState());
                break;
            }
            System.out.println("thread = " + thread.getState());
        }
    }
}
