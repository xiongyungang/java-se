package com.enumDemo;
/*
 * 含有抽象方法的枚举类
 */
public enum Direction2 {
	FRONT("前") {
		@Override
		public void show() {
			System.out.println("前");
		}
	},BACK("后") {
		@Override
		public void show() {
			System.out.println("后");
		}
	},LEFT("左") {
		@Override
		public void show() {
			System.out.println("左");
		}
	},RIGHT("右") {
		@Override
		public void show() {
			System.out.println("右");
		}
	};
	
	private String name;
	
	//构造器必须私有
	private Direction2(String name){
		this.name=name;
	}
	
	public String getName(){
		return name;
	}
	
	public abstract void show();
}
