package com.pattern.templet;

public class PrintDemo2 extends PrintTemplet{

	@Override
	public void printHead() {
		System.out.println("采用方案2打印头部");
	}

	@Override
	public void printBody() {
		System.out.println("采用方案2打印body");
	}

	@Override
	public void printFoot() {
		System.out.println("采用方案2打印尾部");
	}

}
