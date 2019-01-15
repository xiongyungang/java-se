package com;

import java.util.*;


public class Third {//public访问修饰符
	
	public static final double CM_PER_INCH = 2.54;//类常量，关键字static final
	
	public static void main(String arg[]){
		System.out.println("hello world!\n");
		System.out.print("java primer.\n");
		
		//整型 没有无符号数
		int iVal = 2147483647;
		short sVal = 32767;//-32768~32767
		long lVal = 23;
		byte bVal = 127;//-128~127
		
		//char类型
		
		//浮点型   double（默认），float
		
		//boolean类型
		boolean flag = false;//整型和boolean不能转换
		
		//不区分变量声明定义
		final int AGE = 3;//常量
		
		//字符串
		String name="xiongyungang";
		String xin=name.substring(0,5);//子串
		System.out.println(xin+" id="+123);
		flag = "xiong".equals(xin);//不区分大小写比较字符串
		flag = "Xiong".equalsIgnoreCase(xin);
		System.out.println(xin.charAt(0));//
		//构建字符串
		StringBuilder builder = new StringBuilder();//空的字符串构建器
		builder.append("xyg");//添加
		builder.insert(1,"iong");//插入
		builder.delete(1, 5);//删除
		System.out.println(builder);
		
		//输入输出
		System.out.println("what's your name?");
		Scanner in = new Scanner(System.in);
		name = in.nextLine();
		System.out.printf("%tc", new Date());//格式化输出
		
		//文件输入输出
		//Scanner in = new Scanner(Paths.get("myfile.txt"),"UTF-8");
		
		//数组
		int[] a;//int a[];声明变量a
		int[] b = new int[10];
		//int[] a ={5,3};//初始化数组
		a=new int[] {1,3,4,5,6};//使用匿名数组重新初始化数组
		for(int element:a)//循环a中的每一个元素，element用于暂存a元素
			System.out.println(element);
		System.out.println("a[]:"+Arrays.toString(a));//打印数组，Attays.toString返回字符串
		b=a;//两个变量引用同一个数组
		b[0]=5;
		System.out.println("a[]:"+Arrays.toString(a));
		b=Arrays.copyOf(a, a.length);//拷贝数组到一个新数组
		b[0]=3;
		System.out.println("a[]:"+Arrays.toString(a));
		System.out.println("b[]:"+Arrays.toString(b));
		
		
	}
}
