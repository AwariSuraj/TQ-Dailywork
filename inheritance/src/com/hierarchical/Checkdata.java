package com.hierarchical;

public class Checkdata {

	public static void main(String[] args) {

		Landline l = new Landline("9022118454", 104, 500f, 201, "cable");
		Mobile m = new Mobile("8010844164", 105, 100f, "jio", "apple");
		System.out.println(l);
		System.out.println(m);

	}

}
