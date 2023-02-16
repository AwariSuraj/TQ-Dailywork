package com.SingleInheritance;

class Animal {

	String color = "black";

}

class Dog extends Animal {

	public void leg() {
		System.out.println("four leg");
		System.out.println(color);
	}

}

public class Simple {

	public static void main(String[] args) {
		Dog d = new Dog();
		d.leg();

	}

}
