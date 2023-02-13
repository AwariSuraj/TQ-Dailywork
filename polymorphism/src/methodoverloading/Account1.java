package methodoverloading;

public class Account1 {

	int id;
	String name;
	float balance;
	String bankname;
	String pancard;
	String debitcard;

	public Account1(int id, String name, float balance, String bankname) {
		this.id = id;
		this.name = name;
		this.balance = balance;
		this.bankname = bankname;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getId() {
		return id;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setBalance(float balance) {
		this.balance = balance;
	}

	public float getBalance() {
		return balance;
	}

	public void setBankName(String bankname) {
		this.bankname = bankname;
	}

	public String getBankName() {
		return bankname;
	}

	public void setPancard(String pancard) {
		this.pancard = pancard;
	}

	public String getPancard() {
		return pancard;
	}

	public void setDebitcard(String debitcard) {
		this.debitcard = debitcard;
	}

	public String getDebitcard() {
		return debitcard;
	}

	public String toString() {
		return "id=" + id + "  name=" + name + " balance=" + balance + "  bankname=" + bankname;
	}

	public static void main(String[] args) {
		Account1 b = new Account1(12, "suraj", 10000f, "SBI");
		System.out.println(b);
		b.setDebitcard("suraj");
		String a = b.getDebitcard();
		System.out.println(a);
		System.out.println(b.getDebitcard());
		// b.setPancard("pancard");
		// System.out.println(b.getDebitcard());
	}

}
