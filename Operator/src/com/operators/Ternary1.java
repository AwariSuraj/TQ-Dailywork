package com.operators;

import java.util.Scanner;

public class Ternary1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter your marks");
		int marks = sc.nextInt();
		System.out.println("enter best of three");
		int bestofthree = sc.nextInt();
		System.out.println((marks > 85 || bestofthree > 90) ? "eligible" : "not eligible");
	}

}
