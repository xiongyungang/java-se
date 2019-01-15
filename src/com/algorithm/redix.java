package com.algorithm;
/*
 * ��������Ͱ����
 */
import java.util.Arrays;

public class redix {
	public static void main(String[] args) {
		int[] arrays = { 34, 6, 3, 43, 27, 86, 234, 23, 5687, 5, 34 };

		redix(arrays);
		System.out.println(Arrays.toString(arrays));
	}

	private static void redix(int[] arrays) {
		//�����
		int max = findMax(arrays);
		//�������λ��������10����ѭ��2��
		for (int i = 1; max / i > 0; i *= 10) {
			int[][] buckets = new int[arrays.length][10];

			// ��ȡÿһλ����Ȼ�����Ͱ��
			for (int j = 0; j < arrays.length; j++) {
				//ȡ����λʮλ��λ...
				int num = (arrays[j]/i)%10;
				//����Ͱ��
				buckets[j][num] = arrays[j];
			}
			
			//����Ͱ��Ԫ��
			int k=0;
			//��ʮ��Ͱ
			for(int j=0;j<10;j++){
				//��ÿ��Ͱ��Ԫ�ؽ��л���
				for(int l=0;l<arrays.length;l++){
					//���Ͱ����Ԫ�ؾͻ���
					if(buckets[l][j]!=0){
						arrays[k++] = buckets[l][j];
					}
				}
			}
		}
	}

	private static int findMax(int[] arrays) {
		int max = arrays[0];
		for (int i : arrays) {
			if (i > max)
				max = i;
		}
		return max;
	}
}
