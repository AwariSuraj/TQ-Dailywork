package com.forloop;

public class Alternatenumber {

	public static void main(String[] args) {
		int n = 5;
		int sum = 0;
		for (int i = 1; i <= 5; i++) {

			if (i % 2 == 0) {
				continue;
			}
			System.out.println(i);
			sum = sum + i;
		}
		System.out.println(sum);
	}

}
