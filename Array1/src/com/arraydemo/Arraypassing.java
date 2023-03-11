package com.arraydemo;

import java.util.Scanner;

public class Arraypassing {
	public static int even(int ar[]) {
		int sum = 0;

		for (int i = 0; i < ar.length; i++)

		{
			if (ar[i] % 2 == 0) {
				sum = sum + ar[i];
			}

		}
		return sum;
	}

	public static int odd(int ar1[]) {
		int sum = 0;

		for (int i = 0; i < ar1.length; i++)

		{
			if (ar1[i] % 2 != 0) {
				sum = sum + ar1[i];
			}

		}
		return sum;
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int arr[] = new int[5];
		System.out.println("enter arrray elements");

		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();

		}
		int s = even(arr);
		System.out.println("sum of even numbers=" + s);
		int s1 = odd(arr);
		System.out.println("sum of  odd numbers=" + s1);
	}

}
