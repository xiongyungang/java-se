package com.pattern.templet;
/*
 * 打印方案1 继承模板类
 */
public class PrintDemo1 extends PrintTemplet{

	@Override
	public void printHead() {
		System.out.println("采用方案1打印头部");
	}

	@Override
	public void printBody() {
		System.out.println("采用方案1打印body");
	}

	@Override
	public void printFoot() {
		System.out.println("采用方案1打印尾部");
	}

}
