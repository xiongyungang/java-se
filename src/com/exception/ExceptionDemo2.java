package com.exception;
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
 * ArithmeticException——由于除数为0引起的异常； 
ArrayStoreException——由于数组存储空间不够引起的异常； 
ClassCastException—一当把一个对象归为某个类，但实际上此对象并不是由这个类 创建的，也不是其子类创建的，则会引起异常； 
IllegalMonitorStateException——监控器状态出错引起的异常； 
NegativeArraySizeException—一数组长度是负数，则产生异常； 
NullPointerException—一程序试图访问一个空的数组中的元素或访问空的对象中的 方法或变量时产生异常； 
OutofMemoryException——用new语句创建对象时，如系统无法为其分配内存空 间则产生异常； 
SecurityException——由于访问了不应访问的指针，使安全性出问题而引起异常； 
IndexOutOfBoundsExcention——由于数组下标越界或字符串访问越界引起异常； 
IOException——由于文件未找到、未打开或者I/O操作不能进行而引起异常； 
ClassNotFoundException——未找到指定名字的类或接口引起异常； 
CloneNotSupportedException——一程序中的一个对象引用Object类的clone方法，但 此对象并没有连接Cloneable接口，从而引起异常； 
InterruptedException—一当一个线程处于等待状态时，另一个线程中断此线程，从 而引起异常，有关线程的内容，将在下一章讲述； 
NoSuchMethodException一所调用的方法未找到，引起异常； 
Illega1AccessExcePtion—一试图访问一个非public方法； 
StringIndexOutOfBoundsException——访问字符串序号越界，引起异常； 
ArrayIdexOutOfBoundsException—一访问数组元素下标越界，引起异常； 
NumberFormatException——字符的UTF代码数据格式有错引起异常； 
IllegalThreadException—一线程调用某个方法而所处状态不适当，引起异常； 
FileNotFoundException——未找到指定文件引起异常； 
EOFException——未完成输入操作即遇文件结束引起异常。
 */
public class ExceptionDemo2 extends Exception{
	public static void main(String arg[]) {
		// 编译时异常: 无法通过编译，必须显示处理。Exception下非RuntimeException类（Run..也是Ex..的子类),如IOException、SQLException等
		// 运行时异常: 都是RuntimeException类及其子类异常，如NullPointerException(空指针异常)，
		//  这些异常是不检查异常，程序中可以选择捕获处理，也可以不处理。这些异常一般是由程序逻辑错误引起的，程序应该从逻辑角度尽可能避免这类异常的发生

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
