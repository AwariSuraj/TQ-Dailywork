package com.Patterns;

public class pattern5 {

	public static void main(String[] args) {
		for (int i = 1; i <= 6; i++) {
			for (int j = 1; j <= 12; j++) {

				if (j >= 7 - i && j <= 5 + i) {
					System.out.print("*");
				} else {
					System.out.print(" ");

				}

			}
			System.out.println();
		}
		for (int i = 1; i <= 12; i++) {
			for (int j = 1; j <= 12; j++) {

				if (j >= 1 + i && j <= 11 - i) {
					System.out.print("*");
				} else {
					System.out.print(" ");

				}
			}
			System.out.println();

		}
	}
}
