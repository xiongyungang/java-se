package com.exception;

import java.util.ArrayList;
import java.util.List;

public class MyExceptionTest {
	public static void main(String[] args) throws MyException {
		List<String> list = new ArrayList<>();
		list.add("男");
		list.add("女");
		if(!list.contains("中性")){
			throw new MyException("性格不合适");
		}
	}
}
