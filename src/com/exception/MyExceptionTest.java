package com.exception;

import java.util.ArrayList;
import java.util.List;

public class MyExceptionTest {
	public static void main(String[] args) throws MyException {
		try{
			throw new MyRuntime("a runtime exception!");
		} catch (MyRuntime myRuntime){
			System.out.println("myRuntime = " + myRuntime);
		}

		List<String> list = new ArrayList<>();
		list.add("��");
		list.add("Ů");
		if(!list.contains("����")){
			throw new MyException("�Ը񲻺���");
		}
	}
}
