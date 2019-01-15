package com.algorithm;

import java.util.Arrays;

/*
 * ϣ������
 */
public class Sell {
	public static void main(String[] args) {
		int[] arrays = { 3, 4, 7, 46, 7, 4, 567, 898, 6, 65, 5, 5, 454, 78, 7 };
		shellsort(arrays);
		System.out.println(Arrays.toString(arrays));
	}

	private static void shellsort(int[] arrays) {
		// ����ÿ�ζ�/2
		for (int step = arrays.length / 2; step > 0; step /= 2) {

			// ���������鿪ʼ���в�������ֱ�����
			for (int i = step; i < arrays.length; i++) {

				int j = i;
				int temp = arrays[j];

				// j - step ���Ǵ�������ͬ����ڵ�Ԫ��
				while (j - step >= 0 && arrays[j - step] > temp) {
					arrays[j] = arrays[j - step];
					j = j - step;
				}
				arrays[j] = temp;
			}
		}
	}
}
