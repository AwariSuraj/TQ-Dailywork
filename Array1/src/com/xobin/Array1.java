package com.xobin;

import java.util.Scanner;

public class Array1 {

	/*
	 * public static void sum() {
	 * 
	 * } public static void sum(int x) {
	 * 
	 * }
	 */
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a length of an array");
		int length = sc.nextInt();
		int arr[] = new int[length];
		for (int i = 0; i < length; i++) {
			arr[i] = sc.nextInt();
		}

		for (int i = 0; i < length; i++) {
			for (int j = i + 1; j < length; j++) {
				if (arr[i] > arr[j]) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}

		}
		for (int ar : arr) {
			System.out.print(ar + " ");
		}

		for (int k = 0; k < length; k++) {
			if (arr[k] % 2 == 0) {
				int temp = arr[k];
				arr[k] = arr[k - 1];
				arr[k - 1] = temp;
			}
		}
		System.out.println();
		for (int ar : arr) {
			System.out.print(ar + " ");
		}
	}
}

/*
 * for(int i=0;i<5;i++) { sum=sum+arr[i];
 * 
 * }
 * 
 * 
 * 
 * 
 * 
 * 
 */
