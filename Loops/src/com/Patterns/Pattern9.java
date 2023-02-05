package com.Patterns;

public class Pattern9 {

	public static void main(String[] args) {
		char ch = 'A';
		for (int i = 1; i <= 6; i++) {

			for (int j = 1; j <= 12; j++) {

				if (j <= i)

				{
					System.out.print(ch);

				} else {
					System.out.print(" ");
				}
			}
			ch++;
			System.out.println();
		}
	}

}
