package com.supplieritem;

public class Item {

	private int id;
	private String name;
	private float unitprice;
	private int quantity;

	public Item() {

	}

	public Item(int id, String name, float unitprice, int quantity) {
		super();
		this.id = id;
		this.name = name;
		this.unitprice = unitprice;
		this.quantity = quantity;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public float getUnitprice() {
		return unitprice;
	}

	public void setUnitprice(float unitprice) {
		this.unitprice = unitprice;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public String toString() {
		return "Item id=" + id + ", name=" + name + ", unitprice=" + unitprice + ", quantity=" + quantity;
	}

}
