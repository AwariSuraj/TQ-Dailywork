package com.cardriver;

public class Driver {

	private String name;
	private String number;

	public Driver() {

	}

	public Driver(String name, String number) {
		this.name = name;
		this.number = number;
	}

	public void setName(String name) {
		this.name = name;

	}

	public String getName() {
		return name;
	}

	public void setNumber(String number) {
		this.number = number;

	}

	public String getNumber() {
		return number;
	}

	public String toString() {
		return "name :" + name + " " + "number=" + number;
	}
}
