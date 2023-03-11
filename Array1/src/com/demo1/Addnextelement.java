package com.demo1;

import java.util.Scanner;

public class Addnextelement {

	static Scanner sc = new Scanner(System.in);

	public static void enterArray(int ar[]) {
		System.out.println("enter an array element");
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

	public static void replaceNext(int ar[]) {

		for (int i = 0; i < (ar.length) - 1; i++)

		{
			ar[i] = ar[i] + ar[i + 1];
		}

	}

	public static void main(String[] args) {

		System.out.println("Enter size:");
		int size = sc.nextInt();

		int arr[] = new int[size];
		enterArray(arr);

		System.out.println("Before:");
		printArray(arr);

		replaceNext(arr);

		System.out.println("After:");
		printArray(arr);

	}

}
