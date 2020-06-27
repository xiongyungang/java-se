package com.exception;
import java.util.Scanner;

/*
 * 异常
 *
 * 		// 编译时异常: 无法通过编译，必须显示处理。Exception下非RuntimeException类（Run..也是Ex..的子类),如IOException、SQLException等
 *		// 运行时异常: 都是RuntimeException类及其子类异常，如NullPointerException(空指针异常)，
 *
 * 		// 异常处理： 1.try..catch..finally
 *		// 2.throws
 */
public class ExceptionDemo2 extends Exception{
	public static void main(String arg[]) {
		try {
			function();
		} catch (ArrayIndexOutOfBoundsException e){
			System.out.println("e = " + e.toString());
		} finally {
			System.out.println("finally");
		}
	}

	public static void function() throws ArrayIndexOutOfBoundsException{
		int a, b;
		Scanner in = new Scanner(System.in);
		a = in.nextInt();
		b = in.nextInt();
		int c = a / b;
		System.out.println(c);
		int[] a1 = { 1, 3, 3 };
		System.out.println(a1[3]);
		System.out.println("异常后的语句");
	}
}
