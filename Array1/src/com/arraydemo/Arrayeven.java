package com.arraydemo;

import java.util.Scanner;

public class Arrayeven {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int arr[] = new int[5];
		System.out.println("enter arrray elements");

		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
			if (arr[i] % 2 == 0) {
				System.out.println(arr[i] + " ");
			}
		}
	}

}
