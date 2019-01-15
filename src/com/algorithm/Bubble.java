package com.algorithm;

/*
 * 冒泡排序
 */
import java.util.Arrays;

public class Bubble {
	public static void main(String arg[]) {
		// int[] sz = { 3, 5, 7, 5, 4, 3, 554, 43, 232, 67, 3, 212, 3, 546, 0 };
		int[] sz = { 1, 2, 1, 4, 5, 6, 7, 8, 9 };
		System.out.println("原数组：" + Arrays.toString(sz));

		// 冒泡排序优化
		int isChange = 0;// 记录是否发生了置换,0未置换，1发生了置换

		for (int i = 0; i < sz.length - 1; i++) {
			isChange = 0;// 重置
			for (int j = 0; j < sz.length - 1 - i; j++) {
				if (sz[j] > sz[j + 1]) {
					int temp = sz[j];
					sz[j] = sz[j + 1];
					sz[j + 1] = temp;
					isChange = 1;// 进到这里说明发生了置换
				}
			}
			// 如果比较完一趟没有发生置换，那么说明已经排好序了，不需要再比较下去
			if (isChange == 0) {
				break;
			}
			System.out.println("第" + (i + 1) + "次置换结果：" + Arrays.toString(sz));

		}
	}
}
