package com.core_java_volume;

import java.util.*;


public class Third {//public�������η�
	
	public static final double CM_PER_INCH = 2.54;//�ೣ�����ؼ���static final
	
	public static void main(String arg[]){
		System.out.println("hello world!\n");
		System.out.print("java primer.\n");
		
		//���� û���޷�����
		int iVal = 2147483647;
		short sVal = 32767;//-32768~32767
		long lVal = 23;
		byte bVal = 127;//-128~127
		
		//char����
		
		//������   double��Ĭ�ϣ���float
		
		//boolean����
		boolean flag = false;//���ͺ�boolean����ת��
		
		//�����ֱ�����������
		final int AGE = 3;//����
		
		//�ַ���
		String name="xiongyungang";
		String xin=name.substring(0,5);//�Ӵ�
		System.out.println(xin+" id="+123);
		flag = "xiong".equals(xin);//�����ִ�Сд�Ƚ��ַ���
		flag = "Xiong".equalsIgnoreCase(xin);
		System.out.println(xin.charAt(0));//
		//�����ַ���
		StringBuilder builder = new StringBuilder();//�յ��ַ���������
		builder.append("xyg");//���
		builder.insert(1,"iong");//����
		builder.delete(1, 5);//ɾ��
		System.out.println(builder);
		
		//�������
		System.out.println("what's your name?");
		Scanner in = new Scanner(System.in);
		name = in.nextLine();
		System.out.printf("%tc", new Date());//��ʽ�����
		
		//�ļ��������
		//Scanner in = new Scanner(Paths.get("myfile.txt"),"UTF-8");
		
		//����
		int[] a;//int a[];��������a
		int[] b = new int[10];
		//int[] a ={5,3};//��ʼ������
		a=new int[] {1,3,4,5,6};//ʹ�������������³�ʼ������
		for(int element:a)//ѭ��a�е�ÿһ��Ԫ�أ�element�����ݴ�aԪ��
			System.out.println(element);
		System.out.println("a[]:"+Arrays.toString(a));//��ӡ���飬Attays.toString�����ַ���
		b=a;//������������ͬһ������
		b[0]=5;
		System.out.println("a[]:"+Arrays.toString(a));
		b=Arrays.copyOf(a, a.length);//�������鵽һ��������
		b[0]=3;
		System.out.println("a[]:"+Arrays.toString(a));
		System.out.println("b[]:"+Arrays.toString(b));
		
		
	}
}
