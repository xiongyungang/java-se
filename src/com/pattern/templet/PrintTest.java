package com.pattern.templet;
/*
 * 模板方法模式
 */
public class PrintTest {
	public static void main(String[] args) {
		//打印方案1
		PrintTemplet printTemplet = new PrintDemo1();
		printTemplet.print();
		
		//打印方案2
		printTemplet = new PrintDemo2();
		printTemplet.print();
	}
}
