package com.pattern.templet;
/*
 * ��ӡģ����
 */
public abstract class PrintTemplet {
	public void print(){
		printHead();
		printBody();
		printFoot();
	}

	public abstract void printHead();
	
	public abstract void printBody();
	
	public abstract void printFoot();
}
