package com.demo1;

import java.util.Arrays;

public class Mergearray {

	public static void mergeArray(int ar1[], int ar2[]) {
		int size1 = ar1.length;
		int size2 = ar2.length;

		int marr[] = new int[size1 + size2];

		int i, j;
		int k = 0;
		for (i = 0, j = 0; i < size1 && j < size2; i++, j++) {
			marr[k++] = ar1[i];
			marr[k++] = ar2[j];

		}
		while (i < size1) {
			marr[k++] = ar1[i++];

		}
		while (j < size2) {
			marr[k++] = ar2[j++];

		}
		System.out.println(Arrays.toString(marr));
	}

	public static void main(String[] args) {
		int arr1[] = { 6, 7, 12, 4, 5, 8 };
		int arr2[] = { 10, 20, 30 };

		System.out.println(Arrays.toString(arr1));
		System.out.println(Arrays.toString(arr2));
		mergeArray(arr1, arr2);
	}

}
