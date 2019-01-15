package com;
import java.util.Scanner;

/*
 * �쳣
 * java.lang.ClassCastException����ת������
 * ava.lang.NullPointerException���������˿�ָ��
 * java.lang.ClassNotFoundExceptionָ�����಻����
 * java.lang.ArithmeticException��ѧ�����쳣
 * ArrayIndexOutOfBoundsException�����±�Խ��
 * java.lang.IllegalArgumentException�����Ĳ�������
 * java.lang.IllegalAccessExceptionû�з���Ȩ��
 * java.lang.IncompatibleClassChangeError�����ݵ���仯����
 * java.lang.StackOverflowError��ջ�������
 */
public class MyException extends Exception{
	public static void main(String arg[]) {
		// ����ʱ�쳣��Exception�·�RuntimeException
		// �����쳣:RuntimeException

		// �쳣����� Throwable�෽��
		// printStackTrace()����̨��ӡ
		// toString()����

		// �쳣���� 1.try..catch..finally
		// 2.throws
		try {
			function();
		} catch (ArithmeticException e) {
			System.out.println(e.toString());
		} catch (ArrayIndexOutOfBoundsException x) {
			System.out.println(x.toString());
		} finally {
			// finally �д�����Զ��ִ��
			System.out.println("�˲�������");
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
