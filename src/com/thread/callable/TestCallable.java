package com.thread.callable;

import java.util.concurrent.*;

/**
 * callable实现线程
 * 1.可以定义返回值
 * 2.可以抛出异常
 * @param <T>
 */
public class TestCallable<T> implements Callable<T> {

    @Override
    public T call() throws Exception {
        for (int cnt = 0; cnt < 100;cnt++) {
            System.out.println(Thread.currentThread().getName()+" :cnt = " + cnt);
        }
        return null;
    }

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        for (int cnt = 0; cnt < 100;cnt++) {
            System.out.println(Thread.currentThread().getName()+" :cnt = " + cnt);
        }

        // 创建线程类
        TestCallable<Object> testCallable1 = new TestCallable<>();

        // 创建执行任务
        ExecutorService executorService = Executors.newFixedThreadPool(3);

        // 提交执行
        Future<Object> future = executorService.submit(testCallable1);

        // 获取执行结果
        Object result = future.get();

        // 服务关闭
        executorService.shutdown();
    }
}
