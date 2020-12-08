package com.thread.communication;


import java.util.ArrayList;
import java.util.List;

/**
 * 生产者消费者问题
 * 生产者不停生产，消费者不停消费。。
        1 products ware produced.
        1 product ware Consumed.
        2 products ware produced.
        3 products ware produced.
        4 products ware produced.
        2 product ware Consumed.
        5 products ware produced.
        3 product ware Consumed.
        6 products ware produced.
        4 product ware Consumed.
        7 products ware produced.
        5 product ware Consumed.
        ...
 */
public class ProducersAndConsumers {
    public static void main(String[] args) {
        Depostory depostory = new Depostory();

        Producers producers = new Producers(depostory);
        Consumers consumers = new Consumers(depostory);

        new Thread(producers).start();
        new Thread(consumers).start();
    }

}

// 产品
class Product{
    int id;

    public Product(int id) {
        this.id = id;
    }
}

// 生产者
class Producers implements Runnable{
    Depostory depostory;

    public Producers(Depostory depostory) {
        this.depostory = depostory;
    }

    @Override
    public void run() {
        for (int i = 1; ; i++) {
            depostory.push(new Product(i));
            System.out.println(i+" products"+" ware produced.");
        }
    }
}

// 消费者
class Consumers implements Runnable{

    Depostory depostory;

    public Consumers(Depostory depostory) {
        this.depostory = depostory;
    }


    @Override
    public void run() {
        while (true){
            Product pop = depostory.pop();
            System.out.println(pop.id+" product "+ "ware Consumed.");
        }
    }
}

// 仓库
class Depostory{
    List<Product> products = new ArrayList<>();
    private int size = 5; // 仓库容量

    // 生产者生产产品
    public synchronized void push(Product product){
        if (size == products.size()) {
            // 等待消费者消费
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        try {
            Thread.sleep(10);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        products.add(product);
        notifyAll(); //通知消费者消费
    }

    // 消费者消费产品
    public synchronized Product pop(){
        if (products.size() == 0) {
            try {
                wait(); // 线程等待，等待生产者生产
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        Product product = products.get(0);
        products.remove(product);
        notifyAll(); // 线程唤醒，通知
        return product;
    }
}
