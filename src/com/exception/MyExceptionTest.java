package com.exception;

import java.util.ArrayList;
import java.util.List;

public class MyExceptionTest {
	public static void main(String[] args) throws MyException {
		List<String> list = new ArrayList<>();
		list.add("��");
		list.add("Ů");
		if(!list.contains("����")){
			throw new MyException("�Ը񲻺���");
		}
	}
}
