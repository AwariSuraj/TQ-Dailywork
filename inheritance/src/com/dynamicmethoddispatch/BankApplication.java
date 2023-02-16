package com.dynamicmethoddispatch;

class Bank {
	protected String bankname;
	protected float balance;

	public Bank() {

	}

	public Bank(String bankname, float balance) {

		this.bankname = bankname;
		this.balance = balance;
	}

	public String getBankname() {
		return bankname;
	}

	public void setBankname(String bankname) {
		this.bankname = bankname;
	}

	public float getBalance() {
		return balance;
	}

	public void setBalance(float balance) {
		this.balance = balance;
	}

	public void balance() {
		System.out.println("your balance =" + balance);
	}

	public String toString() {
		return "Bank [bankname=" + bankname + ", balance=" + balance + "]";
	}

}

class Saving extends Bank {
	int interest;

	public Saving() {

	}

	public Saving(String bankname, float balance, int interest) {
		super(bankname, balance);
		this.interest = interest;

	}

	public void balance() {
		float intre = (balance * interest) / 100;
		balance = balance + intre;
		System.out.println("balance =" + balance);
	}

	public String toString() {
		return super.toString() + "Saving [interest=" + interest + "%" + "]";
	}

}

class Current extends Bank {
	int interest;

	public Current() {

	}

	public Current(String bankname, float balance, int interest) {
		super(bankname, balance);
		this.interest = interest;

	}

	public void balance() {
		float intre = (balance * interest) / 100;
		balance = balance + intre;
		System.out.println("balance =" + balance);
	}

	public String toString() {
		return super.toString() + "Current [interest=" + interest + "%" + "]";
	}

}

public class BankApplication {

	public static void main(String[] args) {
		Bank b = new Saving("hdfc", 50000f, 2);
		System.out.println(b);
		b.balance();

		Bank b1 = new Current("hdfc", 10000f, 3);
		System.out.println(b1);
		b1.balance();

	}

}
