package com.arraydemo;

import java.util.Scanner;

public class Arraytraversal {
	public static void traversal(int ar[]) {

		for (int i = 0; i < ar.length; i++) {

			ar[i] = ar[i] + ar[i];

		}
		System.out.println("arry in method");
		for (int i = 0; i < ar.length; i++) {

			System.out.println(ar[i] + " ");
		}
		System.out.println();

	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int arr[] = new int[5];
		System.out.println("enter arrray elements");

		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();

		}

		System.out.println("main array");
		for (int i = 0; i < arr.length; i++) {

			System.out.println(arr[i] + " ");
		}

		traversal(arr);
	}
}