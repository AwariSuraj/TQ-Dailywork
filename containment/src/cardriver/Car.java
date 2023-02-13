package cardriver;

public class Car {
	private int cno;
	private String cname;
	private float average;
	private Driver d;

	public Car() {

	}

	public Car(int cno, String cname, float average) {

		this.cno = cno;
		this.cname = cname;
		this.average = average;
	}

	public int getCno() {
		return cno;
	}

	public void setCno(int cno) {
		this.cno = cno;
	}

	public String getCname() {
		return cname;
	}

	public void setCname(String cname) {
		this.cname = cname;
	}

	public float getAverage() {
		return average;
	}

	public void setAverage(float average) {
		this.average = average;
	}

	public Driver getD() {
		return d;
	}

	public void setD(Driver d) {
		this.d = d;
	}

	public String toString() {
		return "car details  " + "cno=" + cno + "  cname=" + cname + "   average" + average + "   " + d;
	}
}