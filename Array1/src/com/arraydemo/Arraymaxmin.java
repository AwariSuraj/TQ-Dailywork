package com.arraydemo;

import java.util.Scanner;

public class Arraymaxmin {

	static Scanner sc = new Scanner(System.in);

	public static void maxMin(int ar[])

	{
		int max = Integer.MIN_VALUE;
		int min = Integer.MAX_VALUE;

		for (int i = 0; i < ar.length; i++) {
			if (ar[i] > max) {
				max = ar[i];
			}
			if (ar[i] < min) {
				min = ar[i];
			}
		}
		System.out.println("max =" + max + "   " + "min=" + min);

	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int arr[] = new int[5];
		System.out.println("enter array elements");

		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();

		}
		maxMin(arr);
	}

}
