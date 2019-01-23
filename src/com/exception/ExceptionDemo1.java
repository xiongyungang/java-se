package com.exception;
/**
 * 多个异常处理
 * 
 * 一旦try中发生异常代码，会去找对应的catch,然后trycache结束执行后续代码
 * @author Administrator
 *
 */
public class ExceptionDemo1 {
	public static void main(String[] args) {
		int[] i = {1,2,3};
		try {
			i[3] = 10;
			int j= 2/0;
			System.out.println("try中异常代码之后部分不会执行");
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("发生了数组越界");
		} catch (ArithmeticException e) {
			System.out.println("发生了被除数为0");
		} finally {
			System.out.println("finally代码运行正常");
		}
		System.out.println("try之后的代码运行正常");
	}
}
