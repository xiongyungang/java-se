package com.thread.security;

import java.util.ArrayList;

public class SynchronizedLockTest {
    public static void main(String[] args) {
        ArrayList<Object> objects = new ArrayList<>();
        for (int i = 0; i < 1000; i++) {
            Thread thread = new Thread(() -> {
                synchronized (objects){
                    objects.add(Thread.currentThread().getName());
                }
            });
            thread.start();
        }
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("objects = " + objects.size());
    }
}
