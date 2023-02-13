package methodoverloading;

import java.util.Scanner;

public class Bank {

	static Scanner sc = new Scanner(System.in);

	void pancard(Account1 a2) {
		System.out.println("checking pancard availabiltity");
		if (a2.getBalance() > 50000) {
			System.out.println("Balance exceeding 50000 enter pan card details:");
			String pan = sc.next();
			a2.setPancard(pan);
		} else {
			System.out.println("no need of pancard");
		}

	}

	void debitcard(Account1 a2) {
		if (a2.getBalance() >= 25000) {
			System.out.println("you have given the debit card ");
			System.out.println("please enter the card details");
			a2.setDebitcard(sc.next());

		} else {
			System.out.println("you dont have the debit card");
		}

	}

	/*
	 * static void deposit(Account1 a1) {
	 * System.out.println("Enter the amount to be deposited:"); float amount =
	 * sc.nextFloat(); if ((a1.getBalance() + amount) >= 50000) {
	 * System.out.println("Balance exceeding 50000 enter pan card details:"); String
	 * pan = sc.next(); a1.setPancard(pan); } a1.setBalance(a1.getBalance() +
	 * amount);
	 * 
	 * System.out.println("Current Balance:" + a1.getBalance());
	 * 
	 * }
	 * 
	 * static void withdrawl(Account1 a1) {
	 * 
	 * System.out.println("Enter the amount to be withdrawl="); float amount =
	 * sc.nextFloat();
	 * 
	 * if ((a1.getBalance() - amount) < 0) {
	 * System.out.println("Insufficient Balance ");
	 * 
	 * } else a1.setBalance(a1.getBalance() - amount);
	 * System.out.println("Current Balance=" + a1.getBalance());
	 * 
	 * }
	 */

	public static void main(String[] args) {

		Account1 a = new Account1(40, "awari", 20000f, "HDFC");
		System.out.println(a);

		Bank b = new Bank();
		b.pancard(a);
		b.debitcard(a);
		System.out.println(a.getDebitcard());

		Account1 a1 = new Account1(80, "Shinde", 510000f, "sbi");
		System.out.println(a1);
		Bank b1 = new Bank();
		b1.pancard(a1);
		b1.debitcard(a1);
		System.out.println(a1.getDebitcard());
		/*
		 * int ch, choice; do { System.out.println("1. Deposit Money");
		 * System.out.println("2. Withdraw money"); System.out.println("3. Exit"); ch =
		 * sc.nextInt();
		 * 
		 * switch (ch) { case 1: deposit(a); break; case 2: withdrawl(a); break; case 3:
		 * System.exit(0); break; default: System.out.println("Error");
		 * 
		 * }
		 * 
		 * System.out.println("Do you want to perform more opr(1-yes,0-no)"); choice =
		 * sc.nextInt();
		 * 
		 * } while (choice == 1);
		 */

	}

}
