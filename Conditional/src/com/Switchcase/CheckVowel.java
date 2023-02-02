package com.Switchcase;

import java.util.Scanner;

public class CheckVowel {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("enter a character");
		char ch = sc.next().charAt(0);

		switch (ch) {
		case 'a':
		case 'A':
		case 'E':
		case 'e':
		case 'i':
		case 'I':
		case 'o':
		case 'O':
		case 'u':
		case 'U':
			System.out.println("character is vowel");
			break;
		default:
			System.out.println("character is consonant");

		}

	}

}
