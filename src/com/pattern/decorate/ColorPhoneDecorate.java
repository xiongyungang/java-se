package com.pattern.decorate;

public class ColorPhoneDecorate extends PhoneDecorate{

	public ColorPhoneDecorate(Phone phone) {
		super(phone);
	}
	
	@Override
	public void call() {
		System.out.println("≤•∑≈≤ ¡Â");
		super.call();
	}

}
