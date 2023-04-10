package com.stackdemo;

class MyStack {
	int top;
	int size;
	int[] stk;

	MyStack() {

	}

	MyStack(int size) {
		top = -1;
		this.size = size;
		stk = new int[this.size];
	}

	void push(int data) {
		if (top < size - 1) {
			top++;
			stk[top] = data;
			System.out.println("element inserted");
		} else {
			System.out.println("overflow");
		}
	}

	void pop() {
		if (top != -1) {
			System.out.println("element deleted");
			top--;

		} else {
			System.out.println("underflow");
		}
	}

	void show() {
		if (top != -1) {
			for (int i = 0; i <= top; i++) {
				System.out.println(stk[i]);
			}

		} else {
			System.out.println("empty");
		}
	}
}

public class StackDataStructure {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyStack st = new MyStack(5);
		st.push(10);
		st.push(12);
		st.show();
		st.pop();
		st.show();
	}

}
