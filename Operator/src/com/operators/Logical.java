package com.operators;

public class Logical {

	public static void main(String[] args) {
		int num1 = 5, num2 = 6, num3 = 8;

		if (num1 > num2 && num1 > num3) {
			System.out.println("greater number is " + num1);
		} else if (num2 > num1 && num2 > num3) {
			System.out.println("greater number is " + num2);
		} else {
			System.out.println("greater number is " + num3);
		}

	}

}
