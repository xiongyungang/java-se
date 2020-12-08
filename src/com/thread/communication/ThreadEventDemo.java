package com.thread.communication;

/**
 * 线程2等待线程2运行n秒后再运行，使用标记事件的方式
 */
public class ThreadEventDemo {
    public static void main(String[] args) {
        Event event = new Event();

        Thread1 thread1 = new Thread1(event);
        Thread2 thread2 = new Thread2(event);

        new Thread(thread1).start();
        new Thread(thread2).start();
    }
}

// Thread1
class Thread1 implements Runnable {
    Event evnet;
    int cnt = 0;

    public Thread1(Event evnet) {
        this.evnet = evnet;
    }

    @Override
    public void run() {
        while (true) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            cnt++;
            if (cnt == 2) {
                evnet.flag = true; // 设置事件
            }
            System.out.println("thread1 run for " + cnt + "seconds.");

        }
    }
}

// Thread2
class Thread2 implements Runnable {
    Event evnet;

    public Thread2(Event evnet) {
        this.evnet = evnet;
    }

    @Override
    public void run() {
        while (true) {
            // 等待事件激活
            if (evnet.flag) {
                System.out.println("thread2 running..");
            }

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

// Event
class Event {
    boolean flag = false; // 事件默认未激活
}
