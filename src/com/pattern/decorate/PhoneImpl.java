package com.pattern.decorate;

public class PhoneImpl implements Phone {

	@Override
	public void call() {
		System.out.println("手机打电话");
	}

}
