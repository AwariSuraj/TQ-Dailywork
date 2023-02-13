package com.Casting;

public class Typecast {

	public static void main(String[] args) {
		short a = 10;
		int b = a;
		System.out.println(a);

		// automatic type casting;

		/*
		 * when we go from lower datatype to higher datatype no need to type cast
		 * compiler automatically typecast byte->short->int->long->float->double
		 */

//-------------------------------------------------------------------//

		// manual type casting
		/*
		 * when we go from higher datatype to lower datatype we need to type cast
		 * manuallly;
		 * 
		 * double->float->long->int->short->byte
		 */

		double c = 10;
		long d = (long) c;

		System.out.println(a);
	}

}
