package com.Patterns;

public class Pattern10 {

	public static void main(String[] args) {
		boolean k = true;
		for (int i = 1; i <= 6; i++) {
			char ch = 'A';
			for (int j = 1; j <= 12; j++) {

				if (j >= 7 - i && j <= 5 + i && k) {

					System.out.print(ch);
					k = false;
					ch++;

				} else {
					System.out.print(" ");
					k = true;
				}

			}
			System.out.println();
		}
	}

}
