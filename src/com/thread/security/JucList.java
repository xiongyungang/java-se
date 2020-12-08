package com.thread.security;

import java.util.concurrent.CopyOnWriteArrayList;

public class JucList {
    public static void main(String[] args) {
        CopyOnWriteArrayList<Object> objects = new CopyOnWriteArrayList<>();
        for (int i = 0; i < 1000; i++) {
            Thread thread = new Thread(() -> {
                    objects.add(Thread.currentThread().getName());
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
