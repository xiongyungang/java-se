package com.algorithm;

import java.util.Arrays;

public class Quick {
	public static void main(String[] args) {
		int[] sz = { 9, 4, 3, 2, 8, 0, 43, 7, 5, 3, 8 };
		System.out.println(Arrays.toString(sz));
		quickSort(sz, 0, 10);
	}

	private static void quickSort(int[] sz, int L, int R) {
		int i = L;
		int j = R;
		int t = sz[(i+j)/2];//支点
		
		//左右两端进行扫描，只要两端还没有交替，就一直扫描
		while(i<=j){
			//找到左边比支点大的数
			while(sz[i]<t){
				i++;
			}
			
			//找到右边比支点小的数
			while(sz[j]>t){
				j--;
			}
			
			//替换
			if(i<=j){
				int temp = sz[i];
				sz[i] = sz[j];
				sz[j] = temp;
				i++;
				j--;
			}
			System.out.println(Arrays.toString(sz));
		}
		
		
		//“左边”再做排序，直到左边剩下一个数(递归出口)
		if(L<j){
			quickSort(sz,L,j);
		}
		//“右边”再做排序，直到左边剩下一个数(递归出口)
		if(i<R){
			quickSort(sz,i,R);
		}
	}

}
