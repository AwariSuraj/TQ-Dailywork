package com.logicalprogram;

import java.util.Scanner;

public class Armstrong {

	public static void CheckArmstrong(int num) {
		int num2 = num;
		int number = num;
		int sum = 0;
		int count = 0;

		while (num != 0) {

			int r = num % 10;

			count++;

			num = num / 10;

		}

		System.out.println("extract digits= " + count);
		int armstr = 0;

		while (num2 != 0) {
			int power = 1;
			int r = num2 % 10;
			for (int i = 1; i <= count; i++) {
				power = power * r;

			}
			armstr = armstr + power;

			num2 = num2 / 10;
		}
		if (number == armstr) {
			System.out.println("the number is armstrong " + number);
		} else {
			System.out.println("the number is not a armstrong " + number);
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a number");
		int num1 = sc.nextInt();
		CheckArmstrong(num1);

	}

}
