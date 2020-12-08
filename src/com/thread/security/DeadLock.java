package com.thread.security;


public class DeadLock {
    private Object lock1 = new Object();
    private Object lock2 = new Object();

    public void thread1Method() {
        synchronized (lock1) {
            System.out.println(Thread.currentThread().getName()+"：获取到lock1，请求lock2");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            synchronized (lock2) {
                System.out.println(Thread.currentThread().getName()+"：获取到lock2");
            }
        }
    }

    public void thread2Method() {
        synchronized (lock2) {
            System.out.println(Thread.currentThread().getName()+"：获取到lock2，请求lock1");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            synchronized (lock1) {
                System.out.println(Thread.currentThread().getName()+"：获取到lock1");
            }
        }
    }

    public static void main(String[] args) {
        DeadLock deadLock = new DeadLock();
        new Thread(()->{
            deadLock.thread1Method();
        }).start();

        new Thread(()->{
            deadLock.thread2Method();
        }).start();
    }
}
