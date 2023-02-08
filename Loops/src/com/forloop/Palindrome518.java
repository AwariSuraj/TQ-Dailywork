package com.forloop;

import java.util.Scanner;

public class Palindrome518 {
	public static void Palindrome(int num) {
		int reverse = 0;
		int num2 = num;
		while (num != 0) {
			int r = num % 10;
			reverse = (reverse * 10) + r;
			num = num / 10;

		}
		if (reverse == num2)

		{
			System.out.println("the number is palindrome number=" + num2 + " and reverse  = " + reverse);
		} else {
			System.out.println("the number is not a palindrome");
		}

	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a number");
		int num1 = sc.nextInt();
		Palindrome(num1);
	}
}