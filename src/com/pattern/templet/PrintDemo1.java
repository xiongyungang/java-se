package com.pattern.templet;
/*
 * ��ӡ����1 �̳�ģ����
 */
public class PrintDemo1 extends PrintTemplet{

	@Override
	public void printHead() {
		System.out.println("���÷���1��ӡͷ��");
	}

	@Override
	public void printBody() {
		System.out.println("���÷���1��ӡbody");
	}

	@Override
	public void printFoot() {
		System.out.println("���÷���1��ӡβ��");
	}

}
