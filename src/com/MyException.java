package com;
import java.util.Scanner;

/*
 * 异常
 * java.lang.ClassCastException类型转换错误
 * ava.lang.NullPointerException程序遇上了空指针
 * java.lang.ClassNotFoundException指定的类不存在
 * java.lang.ArithmeticException数学运算异常
 * ArrayIndexOutOfBoundsException数组下标越界
 * java.lang.IllegalArgumentException方法的参数错误
 * java.lang.IllegalAccessException没有访问权限
 * java.lang.IncompatibleClassChangeError不兼容的类变化错误
 * java.lang.StackOverflowError堆栈溢出错误
 */
public class MyException extends Exception{
	public static void main(String arg[]) {
		// 编译时异常：Exception下非RuntimeException
		// 运行异常:RuntimeException

		// 异常解决： Throwable类方法
		// printStackTrace()控制台打印
		// toString()描述

		// 异常处理： 1.try..catch..finally
		// 2.throws
		try {
			function();
		} catch (ArithmeticException e) {
			System.out.println(e.toString());
		} catch (ArrayIndexOutOfBoundsException x) {
			System.out.println(x.toString());
		} finally {
			// finally 中代码永远会执行
			System.out.println("此操作有误");
		}

	}

	public static void function() {
		int a, b;
		Scanner in = new Scanner(System.in);
		a = in.nextInt();
		b = in.nextInt();
		int c = a / b;
		System.out.println(c);
		int[] a1 = { 1, 3, 3 };
		System.out.println(a1[3]);
		System.out.println("-------");
	}
}
