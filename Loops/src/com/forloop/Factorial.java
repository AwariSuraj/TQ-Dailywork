package com.forloop;

public class Factorial {

	public static void main(String[] args) {
		int no = 4;
		int f = 1;
		for (int i = 1; i <= no; i++) {
			f = f * i;
		}

		System.out.println(f);

	}

}
