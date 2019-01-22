package com.string;
/**
 * String、StringBuffer、StringBuilder之间的转换
 * @author Administrator
 *
 */
public class StringStringBufferBuilder {
	public static void main(String[] args) {
		String str = "helloString";
		StringBuffer sbf = new StringBuffer("helloBuffer");
		StringBuilder sbd = new StringBuilder("helloBuilder");
		
		StringToBuffer(str);
		BufferToString(sbf);
	}

	private static void BufferToString(StringBuffer sbf) {
		//1.String的构造方法
		String str = new String(sbf);
		//2.toString方法
		sbf.toString();
	}

	private static void StringToBuffer(String str) {
		//1.构造器
		StringBuffer sbf = new StringBuffer(str);
		//2.append方法
		sbf.append(str);
	}
}
