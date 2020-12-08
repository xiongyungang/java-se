package com.thread.juc;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

/**
 *
 *  线程A执行+1操作，线程B执行-1操作。。。
 *
 A execute add ,num = 1
 D execute sub ,num = 0
 A execute add ,num = 1
 D execute sub ,num = 0
 A execute add ,num = 1
 D execute sub ,num = 0
 A execute add ,num = 1
 *
 *
 */
public class ConditionDemo {
    public static void main(String[] args) {
        Data data = new Data();

        new Thread(() ->{
            try {
                for (int i = 0; i < 10; i++) {
                    data.add();
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        },"A").start();

        new Thread(() ->{
            try {
                for (int i = 0; i < 10; i++) {
                    data.sub();
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }, "B").start();

        new Thread(() ->{
            try {
                for (int i = 0; i < 10; i++) {
                    data.add();
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        },"C").start();

        new Thread(() ->{
            try {
                for (int i = 0; i < 10; i++) {
                    data.sub();
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        },"D").start();
    }
}

class Data {
    private int num = 0;

    private ReentrantLock lock = new ReentrantLock();

    private Condition condition = lock.newCondition();

    //+1
    public void add() throws InterruptedException {
        lock.lock();
        try {
            // 使用while防止虚唤醒
            while (num != 0) {
                condition.await(); // 等待
            }
            System.out.println(Thread.currentThread().getName()+" execute add ,num = " + (++num));
            condition.signalAll();  // 唤醒全部线程
        } finally {
            lock.unlock();
        }

    }

    //-1
    public void sub() throws InterruptedException {
        lock.lock();
        try {
            // 使用while防止虚唤醒
            while (num == 0) {
                condition.await(); // 等待
            }
            System.out.println(Thread.currentThread().getName()+" execute sub ,num = " + (--num));
            condition.signalAll(); // 唤醒所有线程
        } finally {
            lock.unlock();
        }
    }
}
