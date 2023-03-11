package com.arraydemo;

import java.util.Scanner;

public class Arraysort {
	static Scanner sc = new Scanner(System.in);

	public static void sortArray(int ar[]) {
		int temp;
		for (int i = 0; i < ar.length; i++) {
			for (int j = i + 1; j < ar.length; j++) {
				if (ar[i] > ar[j]) {
					// swapping
					temp = ar[i];
					ar[i] = ar[j];
					ar[j] = temp;
				}
			}
		}

	}

	public static void main(String[] args) {
		int arr[] = new int[5];
		System.out.println("enter aray elements");

		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();

		}
		sortArray(arr);
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i] + " ");
		}

		for (int i : arr) {
			System.out.print(i + " ");
		}
	}

}
