package com.constructor;

public class Item {

	private int itemId;
	private String itemName;
	private float price;
	private String category;

	// default constructor
	public Item() {
		System.out.println("we are in the default constructor");
	}
	// parameterized constructor

	public Item(int itemId, String itemName, float price, String category) {
		this.itemId = itemId;
		this.itemName = itemName;
		this.price = price;
		this.category = category;
	}

	public String toString() {
		return "item id=" + itemId + " itemName=" + itemName + " price=" + price + " category=" + category;
	}

	public static void main(String[] args) {

		Item i1 = new Item();
		System.out.println(i1);
		Item i2 = new Item(123, "pen", 5, "bluepen");
		System.out.println(i2);

	}

}
