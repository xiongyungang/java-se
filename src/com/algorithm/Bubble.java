package com.algorithm;

/*
 * ð������
 */
import java.util.Arrays;

public class Bubble {
	public static void main(String arg[]) {
		// int[] sz = { 3, 5, 7, 5, 4, 3, 554, 43, 232, 67, 3, 212, 3, 546, 0 };
		int[] sz = { 1, 2, 1, 4, 5, 6, 7, 8, 9 };
		System.out.println("ԭ���飺" + Arrays.toString(sz));

		// ð�������Ż�
		int isChange = 0;// ��¼�Ƿ������û�,0δ�û���1�������û�

		for (int i = 0; i < sz.length - 1; i++) {
			isChange = 0;// ����
			for (int j = 0; j < sz.length - 1 - i; j++) {
				if (sz[j] > sz[j + 1]) {
					int temp = sz[j];
					sz[j] = sz[j + 1];
					sz[j + 1] = temp;
					isChange = 1;// ��������˵���������û�
				}
			}
			// ����Ƚ���һ��û�з����û�����ô˵���Ѿ��ź����ˣ�����Ҫ�ٱȽ���ȥ
			if (isChange == 0) {
				break;
			}
			System.out.println("��" + (i + 1) + "���û������" + Arrays.toString(sz));

		}
	}
}
