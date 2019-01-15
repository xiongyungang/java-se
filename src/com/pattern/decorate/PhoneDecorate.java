package com.pattern.decorate;

public abstract class PhoneDecorate implements Phone {
	private Phone phone;
	
	public PhoneDecorate(Phone phone){
		this.phone=phone;
	}

	@Override
	public void call() {
		this.phone.call();
	}

}
