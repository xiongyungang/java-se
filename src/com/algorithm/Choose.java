package com.algorithm;
/*
 * ѡ�����򣬲��ȶ������򷽷���2����ȵ����������е�ǰ��λ��˳������������������ǰ��λ��˳����ͬ��
 */
import java.util.Arrays;

public class Choose {
	public static void main(String[] args) {
		int[] sz = { 3, 5, 7, 5, 4, 3, 554, 43, 232, 67, 3, 212, 3, 546, 0 };
		System.out.println("ԭ���飺" + Arrays.toString(sz));
		method1(sz);//������β����ʼ
		method2(sz);//������ͷ����ʼ
	}

	private static void method2(int[] sz) {
		//����
		int min = 0;
		
		//���ѭ��������Ҫ���������
		for (int i = 0; i < sz.length - 1; i++) {
			min = i;
		    //�ڲ�ѭ�����Ʊ�������ĸ������õ����/��С
			for (int j = i; j < sz.length; j++) {
				if (sz[j] < sz[min]) {
					min = j;
				}
			}
			// ����
			int temp = sz[i];// ��ǰ��λ������Ԫ��
			sz[i] = sz[min];
			sz[min] = temp;
		}
		System.out.println("method1�������飺" + Arrays.toString(sz));
	}

	private static void method1(int[] sz) {
		int max = 0;
		for (int i = 0; i < sz.length - 1; i++) {
			max = 0;// ����
			for (int j = 0; j < sz.length - i; j++) {
				if(sz[j]>sz[max]){
					max=j;
				}
			}
			//����
			int temp = sz[sz.length-i-1];//���ﵱǰԪ�������һ����Ҫ-1�������
			sz[sz.length-i-1] = sz[max];
			sz[max] = temp;
		}
		System.out.println("method2�������飺" + Arrays.toString(sz));
	}

}
