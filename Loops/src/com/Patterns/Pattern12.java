/* Input 4 4
  output  1	2  3  4
  		  5 6  7  8
  		  9 10 1  2
  */
package com.Patterns;

import java.util.Scanner;

public class Pattern12 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("enter a length of pattern row and column ");
		int row = sc.nextInt();
		int column = sc.nextInt();
		int n = 1;
		for (int i = 1; i <= row; i++) {

			for (int j = 1; j <= column; j++) {

				if (j >= 1) {

					if (n > 10) {
						n = 1;
					}

					System.out.print(n + " ");
					n++;
				} else {
					System.out.print(" ");
				}

			}
			System.out.println();
		}

	}
}
