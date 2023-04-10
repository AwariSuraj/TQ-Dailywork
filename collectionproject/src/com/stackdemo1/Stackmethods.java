package com.stackdemo1;

import java.util.Enumeration;
import java.util.Stack;

public class Stackmethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack<String> stk = new Stack<>();
		stk.push("suraj");
		stk.push("Awari");
		stk.push("sinhgad");
		System.out.println(stk);
		stk.pop();
		System.out.println(stk);
		System.out.println(stk.capacity());
		System.out.println(stk.search("awari"));

		Enumeration<String> enm = stk.elements();
		while (enm.hasMoreElements()) {
			System.out.println(enm.nextElement());
		}
	}

}
