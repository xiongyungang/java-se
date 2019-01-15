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
		int t = sz[(i+j)/2];//֧��
		
		//�������˽���ɨ�裬ֻҪ���˻�û�н��棬��һֱɨ��
		while(i<=j){
			//�ҵ���߱�֧������
			while(sz[i]<t){
				i++;
			}
			
			//�ҵ��ұ߱�֧��С����
			while(sz[j]>t){
				j--;
			}
			
			//�滻
			if(i<=j){
				int temp = sz[i];
				sz[i] = sz[j];
				sz[j] = temp;
				i++;
				j--;
			}
			System.out.println(Arrays.toString(sz));
		}
		
		
		//����ߡ���������ֱ�����ʣ��һ����(�ݹ����)
		if(L<j){
			quickSort(sz,L,j);
		}
		//���ұߡ���������ֱ�����ʣ��һ����(�ݹ����)
		if(i<R){
			quickSort(sz,i,R);
		}
	}

}
