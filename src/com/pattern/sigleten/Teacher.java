package com.pattern.sigleten;
/*
 * 饿汉式 单例模式
 */
public class Teacher {
	private Teacher(){	
	}
	
	private static Teacher t = null;
	
	//同步方法保证线程安全，因为有可能多个线程同时进入判断语句中
	public synchronized static Teacher getTeacher(){
		if(t==null){
			t = new Teacher();
		}
		return t;
	}
}
