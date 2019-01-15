package com.pattern.templet;
/*
 * ´òÓ¡Ä£°åÀà
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
