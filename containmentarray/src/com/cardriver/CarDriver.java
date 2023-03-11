package com.cardriver;

import java.util.Scanner;

public class CarDriver {
	static Scanner sc = new Scanner(System.in);

	public static void carDetails(Car c1) {
		System.out.println("enter a car number");
		c1.setCarno(sc.nextInt());
		System.out.println("enter a car name");
		c1.setCname(sc.next());
		System.out.println("enter a number of drivers");
		int n = sc.nextInt();

		Driver driver1[] = new Driver[n];

		for (int i = 0; i < n; i++) {
			driver1[i] = new Driver();
			System.out.println("enter a driver a name");
			driver1[i].setName(sc.next());
			System.out.println("enter a driver number");
			driver1[i].setNumber(sc.next());
		}
		c1.setDriver(driver1);

	}

	public static void commonDriver(Car[] c2) {
		System.out.println("========================================");
		System.out.println("enter a driver name");
		String name = sc.next();

		for (Car c : c2) {
			for (Driver d : c.getDriver())

			{
				if (d.getName().equals(name)) {
					System.out.println(c.getCname() + "  " + c.getCarno());
				}
			}
		}

	}

	public static void main(String[] args) {

		Car c[] = new Car[3];
		for (int i = 0; i < 3; i++) {
			c[i] = new Car();
			carDetails(c[i]);
		}

		for (Car c1 : c) {
			System.out.println("car number " + c1.getCarno() + " " + "car name " + c1.getCname() + " ");

			for (Driver d1 : c1.getDriver()) {
				System.out.println(d1);
			}
			System.out.println("================");
		}
		commonDriver(c);
	}
}
