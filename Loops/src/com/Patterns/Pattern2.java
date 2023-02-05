package com.Patterns;

import java.util.Scanner;

public class Pattern2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("enter a length of pattern row and column ");
		int row = sc.nextInt();
		int column = sc.nextInt();
		for (int i = 1; i <= row; i++) {
			for (int j = 1; j <= column; j++) {

				if (j >= ((column + 1) - i)) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}

			}
			System.out.println();
		}
	}

}
