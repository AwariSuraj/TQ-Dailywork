package com.queue;

class Myqueue {
	int front, rear;
	int size;
	int[] arr;

	public Myqueue(int size) {
		super();
		this.size = size;
		front = 0;
		rear = 0;
		int arr[] = new int[this.size];
	}

	public void insert(int data) {
		if (rear < size) {
			arr[rear] = data;
			rear++;
			System.out.println("element inserted");
		} else {
			System.out.println("overflow");
		}
	}

	public void delete() {
		int tmp;
		if (rear > front) {
			System.out.println("element deleted:" + arr[front]);
			for (tmp = front; tmp < rear - 1; tmp++) {
				arr[tmp] = arr[tmp + 1];

			}
			arr[--rear] = 0;
		} else {
			System.out.println("underflow");
		}
	}

	public void display() {
		if (rear > front) {
			for (int i = front; i < rear; i++) {
				System.out.println(arr[i]);
			}
		} else {
			System.out.println("Queue is empty");
		}
	}
}

public class Queueasarray {

	public static void main(String[] args) {
		Myqueue q = new Myqueue(4);
		q.insert(78);
		q.insert(89);
		q.display();

		q.insert(67);
		q.insert(56);
		q.insert(45);
		q.display();

		q.delete();
		q.delete();
		q.delete();
		q.delete();

		q.delete();
		q.display();
	}

}
