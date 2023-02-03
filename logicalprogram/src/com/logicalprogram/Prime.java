package com.logicalprogram;

import java.util.Scanner;

public class Prime {
	public static void checkprime(int num) {
		int i;

		int ans = num / 2;
		for (i = 2; i < ans; i++) {
			if (ans % i == 0) {
				break;
			}
		}
		if (ans == i) {
			System.out.println("the number is  prime");
		} else {
			System.out.println("the number is not  prime");
		}
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		if (num == 0 || num == 1) {
			System.out.println("the number is not  prime");
		} else {
			checkprime(num);
		}

	}

}
