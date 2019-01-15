package com.string;

/**
 * StringBuilder 不同步数据线程不安全效率高，适用于单线程下在字符缓冲区进行大量操作的情况
 * @author Administrator
 *
 */
public class StringBuilderDemo {
	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder();
		sb.append("hello");
		change(sb);//传递的是引用，所以值改变了
		System.out.println(sb);
	}

	private static void change(StringBuilder sb) {
		sb.append("world");
	}
}
