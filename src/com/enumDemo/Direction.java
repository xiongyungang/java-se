package com.enumDemo;
/**
 * 枚举类
 * 
 * 		所有枚举类继承Enum类
 * 		枚举类必须私有构造器
 * 		可以有抽象方法，但枚举项必须重写该方法（见direction2）
 *
 */
public enum Direction {
	FRONT("前"),BACK("后"),LEFT("左"),RIGHT("右");
	
	private String name;
	
	//构造器必须私有
	private Direction(String name){
		this.name=name;
	}
	
	public String getName(){
		return name;
	}
	
	
}
