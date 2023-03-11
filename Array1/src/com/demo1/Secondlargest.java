package com.demo1;

import java.util.Arrays;

public class Secondlargest {
	public static void secondLargest(int ar[]) {
		for (int i = 0; i < ar.length; i++) {
			for (int j = i + 1; j < ar.length; j++) {
				if (ar[i] < ar[j]) {
					int temp = ar[i];
					ar[i] = ar[j];
					ar[j] = temp;
				}
			}
		}
		System.out.println(Arrays.toString(ar));
		System.out.println(ar[1]);
	}

	public static void main(String[] args) {
		int arr[] = { 1, 2, 3, 4, 5, 6 };
		secondLargest(arr);
	}

}
