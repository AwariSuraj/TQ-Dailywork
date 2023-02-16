package com.hierarchical;

public class Mobile extends Phone {

	String simcard;
	String brand;

	public Mobile() {

	}

	public Mobile(String no, int id, float bill, String simcard, String brand) {
		super(no, id, bill);
		this.simcard = simcard;
		this.brand = brand;
	}

	public String getSimcard() {
		return simcard;
	}

	public void setSimcard(String simcard) {
		this.simcard = simcard;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String toString() {
		return super.toString() + "Mobile [simcard=" + simcard + ", brand=" + brand + "]";
	}

}
