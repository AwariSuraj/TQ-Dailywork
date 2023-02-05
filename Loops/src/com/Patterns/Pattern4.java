package com.Patterns;

import java.util.Scanner;

public class Pattern4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a length of rows");
		int row = sc.nextInt();
		int column = row / 2;
		boolean k = true;
		for (int i = 1; i <= column; i++) {
			for (int j = 1; j <= row; j++) {

				if (j >= (column + 1) - i && j <= (column - 1) + i && k) {
					System.out.print(i);
					k = false;
				} else {
					System.out.print(" ");
					k = true;
				}

			}
			System.out.println();
		}
	}

}
