package com.enumDemo;
/**
 * ö����
 * 
 * 		����ö����̳�Enum��
 * 		ö�������˽�й�����
 * 		�����г��󷽷�����ö���������д�÷�������direction2��
 *
 */
public enum Direction {
	FRONT("ǰ"),BACK("��"),LEFT("��"),RIGHT("��");
	
	private String name;
	
	//����������˽��
	private Direction(String name){
		this.name=name;
	}
	
	public String getName(){
		return name;
	}
	
	
}
