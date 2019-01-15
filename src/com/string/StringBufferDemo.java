package com.string;

/*
 * StringBuffer:字符串缓存区类
 * 				采用缓存区机制，其值可改变
 */
public class StringBufferDemo {
	public static void main(String[] args) {
		//方式1
		StringBuffer strBuf = new StringBuffer();
		// strBuf.append("world");//strBuf还是指向原来的对象
		System.out.println(strBuf);
		System.out.println(strBuf.length());// 字符个数
		System.out.println(strBuf.capacity());// 字符容量默认16，实际长度
		
		//方式2
		StringBuffer strBuf2 = new StringBuffer(100);//指定容量
		System.out.println(strBuf2);
		System.out.println(strBuf2.length());
		System.out.println(strBuf2.capacity());
		
		//方式3
		StringBuffer strBuf3 = new StringBuffer("helloworld");
		System.out.println(strBuf3);
		System.out.println(strBuf3.length());
		System.out.println(strBuf3.capacity());
	}
}
