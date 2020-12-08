package com.thread.security;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * https://blog.csdn.net/fuyuwei2015/article/details/83719444
 */
public class ReentrantLockTest {
    public static void main(String[] args) throws InterruptedException {

        Ticket t1 = new Ticket();

        Thread thread1 = new Thread(t1);
        Thread thread2 = new Thread(t1);

        thread1.start();
        thread2.start();

    }

}

class Ticket implements Runnable {
    Integer ticket = 100;

    /**
     * 公平锁是指多个线程同时尝试获取同一把锁时，获取锁的顺序按照线程达到的顺序
     * 非公平锁则允许线程“插队”
     */
    private Lock reenlock = new ReentrantLock(); //初始为非公平锁
    //private Lock reenlock = new ReentrantLock(true); // 初始化为公平锁

    @Override
    public void run() {
        while (true) {
            // 锁机制
            reenlock.lock();
            try {
                if (ticket > 0) {
                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println(Thread.currentThread().getName() + "正在出售第" + (ticket--) + "张票。");
                } else {
                    break;
                }
            } finally {
                // 解锁
                reenlock.unlock();
            }
        }
    }

}
