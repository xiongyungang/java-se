package com.exception;
import java.util.Scanner;

/*
 * �쳣
 *
 * 		// ����ʱ�쳣: �޷�ͨ�����룬������ʾ����Exception�·�RuntimeException�ࣨRun..Ҳ��Ex..������),��IOException��SQLException��
 *		// ����ʱ�쳣: ����RuntimeException�༰�������쳣����NullPointerException(��ָ���쳣)��
 *
 * 		// �쳣���� 1.try..catch..finally
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
		System.out.println("�쳣������");
	}
}
