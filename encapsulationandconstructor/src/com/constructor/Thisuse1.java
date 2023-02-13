package com.constructor;

class A {
	int n;
	int n1;

	// calling the object itself
	A() {
		n = 5;
		n1 = 10;
	}

	public void add(A a1) {
		this.n = this.n + a1.n;
		this.n1 = this.n1 + a1.n1;
	}

	public void Show() {
		System.out.println(this.n + " " + this.n1);
	}

}

public class Thisuse1 {

	public static void main(String[] args) {

		A obj = new A();

		obj.add(obj);

		obj.Show();
	}

}
