package com.logicalprogram;

import java.util.Scanner;

public class ExtractDigitSumPro {
	public static void extract(int num) {
		int sum = 0;
		int product = 1;
		System.out.println("extract digits are:");
		while (num != 0) {
			int r = num % 10;
			System.out.println(r);
			sum = sum + r;
			product = product * r;
			num = num / 10;
		}
		System.out.println("the sum of extract digits =" + sum);
		System.out.println("the product of extract digits =" + product);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("enter a number");
		int num1 = sc.nextInt();
		extract(num1);

	}

}
