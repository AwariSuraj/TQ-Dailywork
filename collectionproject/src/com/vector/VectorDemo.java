package com.vector;

import java.util.Vector;

public class VectorDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Vector<String> colours = new Vector<>();// (9,5) capacity increase by us
		System.out.println("size" + colours.size());
		System.out.println("Capacity:" + colours.capacity());
		colours.ensureCapacity(30);
		colours.add("blue");
		colours.add("green");
		colours.add("blue");
		colours.add("green");
		colours.add("blue");
		colours.add("green");
		colours.add("blue");
		colours.add("green");
		colours.add("blue");
		colours.add("green");
		System.out.println("size" + colours.size());
		System.out.println("Capacity:" + colours.capacity());
		// colours.ensureCapacity(15);
		colours.add("blue");
		colours.add("green");
		System.out.println("size" + colours.size());
		colours.ensureCapacity(15);
		System.out.println("Capacity:" + colours.capacity());

		System.out.println(colours.get(4));
		System.out.println(colours.elementAt(4));

		System.out.println(colours.set(4, "red"));
		colours.setElementAt("purple", 4);
		System.out.println(colours);
	}

}
