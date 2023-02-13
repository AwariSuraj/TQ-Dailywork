package methodoverloading;

public class Typepromotionambiguity {

	static void display(int a, double d) {
		System.out.println("method 1");
		System.out.println(a + d);
	}

	static void dispaly(long l, float f) {
		System.out.println("method 2");
		System.out.println(l + f);
	}

	public static void main(String[] args) {
		/*
		 * display((9,8.5f));
		 * 
		 * ambigious because two situation occur while calling the method
		 */
	}

}
