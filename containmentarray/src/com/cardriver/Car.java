package com.cardriver;

import java.util.Arrays;

public class Car {

	private int carno;
	private String cname;
	private Driver driver[];

	public Car() {

	}

	public Car(int carno, String cname, Driver driver[]) {
		this.carno = carno;
		this.cname = cname;
		this.driver = driver;

	}

	public void setCarno(int carno) {
		this.carno = carno;
	}

	public int getCarno() {
		return carno;
	}

	public void setCname(String cname) {
		this.cname = cname;
	}

	public String getCname() {
		return cname;
	}

	public void setDriver(Driver driver[]) {
		this.driver = driver;
	}

	public Driver[] getDriver() {
		return driver;
	}

	public String toString() {
		return "car no." + carno + "  " + "carname" + cname + " " + Arrays.toString(driver);
	}
}
