package com.Patterns;

public class Pattern8 {

	public static void main(String[] args) {
		for (int i = 1; i <= 6; i++) {
			int num1 = 1;

			for (int j = 1; j <= 12; j++) {

				if (j >= num1 && j % 2 != 0)

				{
					System.out.print(num1);

				} else

				{
					System.out.print("0");
				}

			}
			System.out.println();

		}
	}
}
