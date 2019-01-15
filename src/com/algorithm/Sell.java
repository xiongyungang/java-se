package com.algorithm;

import java.util.Arrays;

/*
 * 希尔排序
 */
public class Sell {
	public static void main(String[] args) {
		int[] arrays = { 3, 4, 7, 46, 7, 4, 567, 898, 6, 65, 5, 5, 454, 78, 7 };
		shellsort(arrays);
		System.out.println(Arrays.toString(arrays));
	}

	private static void shellsort(int[] arrays) {
		// 增量每次都/2
		for (int step = arrays.length / 2; step > 0; step /= 2) {

			// 从增量那组开始进行插入排序，直至完毕
			for (int i = step; i < arrays.length; i++) {

				int j = i;
				int temp = arrays[j];

				// j - step 就是代表与它同组隔壁的元素
				while (j - step >= 0 && arrays[j - step] > temp) {
					arrays[j] = arrays[j - step];
					j = j - step;
				}
				arrays[j] = temp;
			}
		}
	}
}
