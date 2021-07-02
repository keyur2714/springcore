package com.webstack.util;

import java.util.Arrays;

public class MyStack {

	static final int MAX = 5;
	int top;
	int stackArr[] = new int[MAX];

	public MyStack() {
		top = -1;
	}

	public boolean push(int no) {		
		if (isOverflow()) {
			System.out.println("Sorry ! Stack is Over Flow...");
			return false;
		}
		top++;
		stackArr[top] = no;
		return true;
	}

	public int pop() {
		if (isEmpty()) {
			System.out.println("Sorry ! Stack is Empty...");
			return 0;
		}else {
			int result = stackArr[top--];
			return result;
		}				
	}

	public int peek() {
		if (isEmpty()) {
			System.out.println("Sorry ! Stack is Empty...");
		}
		return stackArr[top];
	}

	private boolean isEmpty() {
		if (top < 0) {
			return true;
		}
		return false;
	}

	private boolean isOverflow() {
		if (top == MAX-1) {
			return true;
		}
		return false;
	}

	@Override
	public String toString() {
		return "MyStack [stackArr=" + Arrays.toString(stackArr) + "]";
	}
	
	

}
