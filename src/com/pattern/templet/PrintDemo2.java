package com.pattern.templet;

public class PrintDemo2 extends PrintTemplet{

	@Override
	public void printHead() {
		System.out.println("���÷���2��ӡͷ��");
	}

	@Override
	public void printBody() {
		System.out.println("���÷���2��ӡbody");
	}

	@Override
	public void printFoot() {
		System.out.println("���÷���2��ӡβ��");
	}

}
