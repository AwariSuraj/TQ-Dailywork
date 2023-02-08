package com.constructor;

public class Supplier {

	private String supplierName;
	private String Supplierproduct;
	private String supplierAddress;
	private float supplierRating;

	public Supplier(String supplierName, String Supplierproduct, String supplierAddress, float supplierRating) {
		this.supplierName = supplierName;
		this.Supplierproduct = Supplierproduct;
		this.supplierAddress = supplierAddress;
		this.supplierRating = supplierRating;
	}

	public String toString() {

		return "supplier Name=" + supplierName + " Supplier product=" + Supplierproduct + " supplier Address="
				+ supplierAddress + "  supplier Rating=" + supplierRating;
	}

	public static void main(String[] args) {

		Supplier s1 = new Supplier("awari", "cars", "mumbai", 5);
		System.out.println(s1);

	}

}
