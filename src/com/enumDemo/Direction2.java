package com.enumDemo;
/*
 * ���г��󷽷���ö����
 */
public enum Direction2 {
	FRONT("ǰ") {
		@Override
		public void show() {
			System.out.println("ǰ");
		}
	},BACK("��") {
		@Override
		public void show() {
			System.out.println("��");
		}
	},LEFT("��") {
		@Override
		public void show() {
			System.out.println("��");
		}
	},RIGHT("��") {
		@Override
		public void show() {
			System.out.println("��");
		}
	};
	
	private String name;
	
	//����������˽��
	private Direction2(String name){
		this.name=name;
	}
	
	public String getName(){
		return name;
	}
	
	public abstract void show();
}
