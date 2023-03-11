package com.arraydemo;

import java.util.Scanner;

public class Arrayreverse {
	static Scanner sc = new Scanner(System.in);

	public static void reverse(int ar[]) {
		for (int i = (ar.length - 1); i >= 0; i--) {
			System.out.println(ar[i]);
		}
	}

	public static void main(String[] args) {
		// Scanner sc = new Scanner(System.in);

		int arr[] = new int[5];
		System.out.println("enter arrray elements");

		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();

		}
		reverse(arr);

	}

}
