package com.annotation;

public class Calculator {

    @JunitDemo
    public void test1(){
        System.out.println(1 / 2);
    }

    @JunitDemo
    public void test2(){
        System.out.println("true = " + true);
    }

    @JunitDemo
    public void test3(){
        System.out.println(2 / 0);
    }

}
