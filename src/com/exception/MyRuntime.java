package com.exception;

public class MyRuntime extends RuntimeException{
    public MyRuntime(){
        super();
    }

    public MyRuntime(String message){
        super(message);
    }

}
