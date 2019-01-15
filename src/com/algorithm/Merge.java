package com.algorithm;

import java.util.Arrays;

public class Merge {
	  public static void main(String[] args) {
	        int[] arrays = {9, 2, 5, 1, 3, 2, 9, 5, 2, 1, 8};
	        mergeSort(arrays, 0, arrays.length - 1);

	        System.out.println(Arrays.toString(arrays));


	    }

	    /**
	     * �鲢����
	     *
	     * @param arrays
	     * @param L      ָ�������һ��Ԫ��
	     * @param R      ָ���������һ��Ԫ��
	     */
	    public static void mergeSort(int[] arrays, int L, int R) {

	        //���ֻ��һ��Ԫ�أ��ǾͲ���������
	        if (L == R) {
	            return;
	        } else {

	            //ȡ�м���������в��
	            int M = (L + R) / 2;

	            //��ߵ������Ͻ��в��
	            mergeSort(arrays, L, M);

	            //�ұߵ������Ͻ��в��
	            mergeSort(arrays, M + 1, R);

	            //�ϲ�
	            merge(arrays, L, M + 1, R);

	        }
	    }


	    /**
	     * �ϲ�����
	     *
	     * @param arrays
	     * @param L      ָ�������һ��Ԫ��
	     * @param M      ָ������ָ���Ԫ��
	     * @param R      ָ����������Ԫ��
	     */
	    public static void merge(int[] arrays, int L, int M, int R) {

	        //��ߵ�����Ĵ�С
	        int[] leftArray = new int[M - L];

	        //�ұߵ������С
	        int[] rightArray = new int[R - M + 1];

	        //�������������������
	        for (int i = L; i < M; i++) {
	            leftArray[i - L] = arrays[i];
	        }
	        for (int i = M; i <= R; i++) {
	            rightArray[i - M] = arrays[i];
	        }


	        int i = 0, j = 0;
	        // arrays����ĵ�һ��Ԫ��
	        int  k = L;


	        //�Ƚ������������ֵ���ĸ�С�����������Ϸ�
	        while (i < leftArray.length && j < rightArray.length) {

	            //˭�Ƚ�С��˭��Ԫ�ط����������,�ƶ�ָ�룬�����Ƚ���һ��
	            if (leftArray[i] < rightArray[j]) {
	                arrays[k] = leftArray[i];

	                i++;
	                k++;
	            } else {
	                arrays[k] = rightArray[j];
	                j++;
	                k++;
	            }
	        }

	        //�����ߵ����黹û�Ƚ��꣬�ұߵ������Ѿ����ˣ���ô����ߵ���������������(ʣ�µĶ��Ǵ�����)
	        while (i < leftArray.length) {
	            arrays[k] = leftArray[i];

	            i++;
	            k++;
	        }
	        //����ұߵ����黹û�Ƚ��꣬��ߵ������Ѿ����ˣ���ô���ұߵ���������������(ʣ�µĶ��Ǵ�����)
	        while (j < rightArray.length) {
	            arrays[k] = rightArray[j];

	            k++;
	            j++;
	        }
	    }

}
