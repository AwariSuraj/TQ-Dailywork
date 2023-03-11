package com.arraydemo;

import java.util.Scanner;

public class Arrayoddevensum {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int sume = 0;
		int sumo = 0;
		int arr[] = new int[5];

		System.out.println("enter a five  numbers");

		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
			if (arr[i] % 2 == 0) {

				sume = sume + arr[i];
			} else {
				sumo = sumo + arr[i];
			}
		}
		System.out.println("sum of even=" + sume);
		System.out.println("sum of odd=" + sumo);
	}

}
