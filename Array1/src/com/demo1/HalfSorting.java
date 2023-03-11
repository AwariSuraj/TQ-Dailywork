package com.demo1;

import java.util.Scanner;

public class HalfSorting {
	static Scanner sc = new Scanner(System.in);

	public static void enterArray(int ar[]) {
		System.out.println("enter a array element");
		for (int i = 0; i < ar.length; i++) {
			ar[i] = sc.nextInt();
		}
	}

	public static void printArray(int ar[]) {
		for (int x : ar) {
			System.out.println(x + " ");
		}
	}

	public static void halfSort(int ar[]) {
		for (int i = 0; i < ((ar.length) / 2); i++) {

			for (int j = i + 1; j < ((ar.length) / 2); j++) {
				if (ar[i] < ar[j]) {
					int temp = ar[i];
					ar[i] = ar[j];
					ar[j] = temp;
				}

			}

		}
		for (int k = (ar.length) / 2; k < ar.length; k++) {

			for (int l = k + 1; l < ((ar.length) / 2); l++) {
				if (ar[k] > ar[l]) {
					int temp = ar[k];
					ar[k] = ar[l];
					ar[l] = temp;
				}

			}

		}
	}

	public static void main(String[] args) {
		// Scanner sc=new Scanner(System.in);
		System.out.println("enter a size of the array");
		int n = sc.nextInt();
		int arr[] = new int[n];

		enterArray(arr);
		printArray(arr);
		System.out.println(".................................................................");
		halfSort(arr);
		printArray(arr);

	}

}
