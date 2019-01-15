package com.algorithm;

/*
 * ÿһ�˲������򣬶����Խ�һ������ֵ����һ���������У�ֱ��ȫ��ֵ����
 * �����������ķѵ�ʱ����O(n^2)
 */
import java.util.Arrays;

public class Insert {
	public static void main(String[] args) {
		int[] sz = { 45, 5, 7, 5, 4, 6, 7, 65, 4, 3, 89, 7 };

		// ���ѭ��������Ҫ���������(��1��ʼ��Ϊ����0λ��������������)
		for (int i = 1; i < sz.length; i++) {
			int temp = sz[i];
			while (i >= 1 && sz[i - 1] > temp) {
				// ���뵽��ǰ
				sz[i] = sz[i - 1];
				i--;
			}
			sz[i] = temp;
			System.out.println(Arrays.toString(sz));
		}
	}
}
