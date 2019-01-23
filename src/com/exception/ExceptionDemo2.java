package com.exception;
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
 * ArithmeticException�������ڳ���Ϊ0������쳣�� 
ArrayStoreException������������洢�ռ䲻��������쳣�� 
ClassCastException��һ����һ�������Ϊĳ���࣬��ʵ���ϴ˶��󲢲���������� �����ģ�Ҳ���������ഴ���ģ���������쳣�� 
IllegalMonitorStateException���������״̬����������쳣�� 
NegativeArraySizeException��һ���鳤���Ǹ�����������쳣�� 
NullPointerException��һ������ͼ����һ���յ������е�Ԫ�ػ���ʿյĶ����е� ���������ʱ�����쳣�� 
OutofMemoryException������new��䴴������ʱ����ϵͳ�޷�Ϊ������ڴ�� ��������쳣�� 
SecurityException�������ڷ����˲�Ӧ���ʵ�ָ�룬ʹ��ȫ�Գ�����������쳣�� 
IndexOutOfBoundsExcention�������������±�Խ����ַ�������Խ�������쳣�� 
IOException���������ļ�δ�ҵ���δ�򿪻���I/O�������ܽ��ж������쳣�� 
ClassNotFoundException����δ�ҵ�ָ�����ֵ����ӿ������쳣�� 
CloneNotSupportedException����һ�����е�һ����������Object���clone�������� �˶���û������Cloneable�ӿڣ��Ӷ������쳣�� 
InterruptedException��һ��һ���̴߳��ڵȴ�״̬ʱ����һ���߳��жϴ��̣߳��� �������쳣���й��̵߳����ݣ�������һ�½����� 
NoSuchMethodExceptionһ�����õķ���δ�ҵ��������쳣�� 
Illega1AccessExcePtion��һ��ͼ����һ����public������ 
StringIndexOutOfBoundsException���������ַ������Խ�磬�����쳣�� 
ArrayIdexOutOfBoundsException��һ��������Ԫ���±�Խ�磬�����쳣�� 
NumberFormatException�����ַ���UTF�������ݸ�ʽ�д������쳣�� 
IllegalThreadException��һ�̵߳���ĳ������������״̬���ʵ��������쳣�� 
FileNotFoundException����δ�ҵ�ָ���ļ������쳣�� 
EOFException����δ���������������ļ����������쳣��
 */
public class ExceptionDemo2 extends Exception{
	public static void main(String arg[]) {
		// ����ʱ�쳣: �޷�ͨ�����룬������ʾ����Exception�·�RuntimeException�ࣨRun..Ҳ��Ex..������),��IOException��SQLException��
		// ����ʱ�쳣: ����RuntimeException�༰�������쳣����NullPointerException(��ָ���쳣)��
		//  ��Щ�쳣�ǲ�����쳣�������п���ѡ�񲶻���Ҳ���Բ�������Щ�쳣һ�����ɳ����߼���������ģ�����Ӧ�ô��߼��ǶȾ����ܱ��������쳣�ķ���

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
