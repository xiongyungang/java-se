package com.pattern.decorate;

public class DgPhoneDecorate extends PhoneDecorate{

	public DgPhoneDecorate(Phone phone) {
		super(phone);
	}
	
	@Override
	public void call() {
		super.call();
		System.out.println("²¥·Å¹ã¸æ");
	}

}
