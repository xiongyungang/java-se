package com.exception;
/**
 * ����쳣����
 * 
 * һ��try�з����쳣���룬��ȥ�Ҷ�Ӧ��catch,Ȼ��trycache����ִ�к�������
 * @author Administrator
 *
 */
public class ExceptionDemo1 {
	public static void main(String[] args) {
		int[] i = {1,2,3};
		try {
			i[3] = 10;
			int j= 2/0;
			System.out.println("try���쳣����֮�󲿷ֲ���ִ��");
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("����������Խ��");
		} catch (ArithmeticException e) {
			System.out.println("�����˱�����Ϊ0");
		} finally {
			System.out.println("finally������������");
		}
		System.out.println("try֮��Ĵ�����������");
	}
}
