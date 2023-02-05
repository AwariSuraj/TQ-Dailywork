package com.Patterns;

public class pattern7 {

	public static void main(String[] args) {
		for (int i = 1; i <= 6; i++) {
			int num1 = i;

			for (int j = 1; j <= 12; j++) {

				if (j >= 7 - i && j <= 5 + i)

				{
					System.out.print(num1);

					if (j < 6) {
						num1--;
					} else {
						num1++;
					}
				} else

				{
					System.out.print(" ");
				}

			}
			System.out.println();
		}

	}

}
