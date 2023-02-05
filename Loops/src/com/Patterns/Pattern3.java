package com.Patterns;

public class Pattern3 {

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
	}

}
