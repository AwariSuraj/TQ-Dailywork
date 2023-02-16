package com.covarient;

class First {
	Number value;

	Number displayValue() {
		return value;
	}
}

class Second extends First {
	Integer myval;

	Integer displayValue() {
		return myval;
	}

}

public class WrapperCovarient {

	public static void main(String[] args) {
		Second s = new Second();
		Integer n = s.displayValue();
		n = n + 5;

	}

}
