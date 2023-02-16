package com.covarient;

class Vehicle {
	protected int speed;

	{
		speed = 100;
	}

	Vehicle changeSpeed() {
		speed = speed + 10;
		return this;
	}

	void display() {
		System.out.println("speed of vehicle:" + speed);
	}
}

class Car extends Vehicle {
	{
		speed = 200;
	}

	Car changeSpeed() {
		speed = speed + 50;
		return this;
	}

	void display() {
		System.out.println("speed of car:" + speed);
	}

	void changeGear() {
		System.out.println("Gear changed");
	}
}

public class Covarientdemo {

	public static void main(String[] args) {

		Car c;
		Car bmw = new Car();
		Car audi = new Car();
		// c=(Car)bmw.changeSpeed(); when return type is Vehicle;
		c = bmw.changeSpeed(); // when return type is Car;

		c.display();
		c.changeGear();
		c.changeSpeed();
		c.display();
		System.out.println("-----------------------------------------------");
		c = audi.changeSpeed();
		c.display();
	}

}
