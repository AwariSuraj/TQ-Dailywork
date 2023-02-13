package cardriver;

import java.util.Scanner;

public class Cardrive {

	static Scanner sc = new Scanner(System.in);

	public static void carDetails(Car c1) {
		Driver d1 = new Driver();
		System.out.println("enter a car number");
		c1.setCno(sc.nextInt());
		System.out.println("enter a name of the car");
		c1.setCname(sc.next());
		System.out.println("enter a average");
		c1.setAverage(sc.nextFloat());

		driverDetails(d1);

		c1.setD(d1);

	}

	public static void driverDetails(Driver d2) {
		System.out.println("enter driver id");
		d2.setId(sc.nextInt());
		System.out.println("enter driver  name");
		d2.setName(sc.next());
		System.out.println("enter driver age");
		d2.setAge(sc.nextInt());
	}

	public static void main(String[] args) {

		Car c = new Car();
		carDetails(c);
		System.out.println(c);

	}

}
