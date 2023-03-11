package com.demo1;

import java.util.Scanner;

public class AlternateElements {
	static Scanner sc = new Scanner(System.in);

	public static void enterArray(int ar[]) {
		System.out.println("Enter array elements");
		for (int i = 0; i < ar.length; i++) {
			ar[i] = sc.nextInt();
		}
	}

	public static void printArray(int ar[]) {
		System.out.println("============================");

		for (int x : ar) {
			System.out.print(x + " ");
		}

		System.out.println();
	}

	public static void alternateNumbers(int ar[]) {
		/*
		 * for(int i=0;i<ar.length;i+=2) {
		 * 
		 * System.out.print(ar[i]+" "); }
		 */

		for (int i = 0; i < ar.length; i++) {
			if (i % 2 == 0)
				System.out.print(ar[i] + " ");
		}

		System.out.println();

	}

	public static void main(String[] args) {

		System.out.println("Enter size:");
		int size = sc.nextInt();

		int arr[] = new int[size];
		enterArray(arr);

		System.out.println("Before:");
		printArray(arr);

		System.out.println("============================");
		alternateNumbers(arr);

	}

}
