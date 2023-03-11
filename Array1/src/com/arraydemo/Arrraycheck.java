package com.arraydemo;

import java.util.Scanner;

public class Arrraycheck {
	static Scanner sc = new Scanner(System.in);

	public static void check(int ar[])

	{
		int flag = 0;
		System.out.println("enter a element for searching");
		int num = sc.nextInt();
		for (int i = 0; i < ar.length; i++) {
			if (num == ar[i]) {
				flag = 1;
				break;

			}
		}
		if (flag == 1) {
			System.out.println("number is present in an aray");
		} else {
			System.out.println("number is not  present in an aray");
		}

	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int arr[] = new int[5];
		System.out.println("enter array element");

		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();

		}
		check(arr);
	}

}
