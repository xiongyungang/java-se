package com.pattern.templet;
/*
 * ģ�巽��ģʽ
 */
public class PrintTest {
	public static void main(String[] args) {
		//��ӡ����1
		PrintTemplet printTemplet = new PrintDemo1();
		printTemplet.print();
		
		//��ӡ����2
		printTemplet = new PrintDemo2();
		printTemplet.print();
	}
}
