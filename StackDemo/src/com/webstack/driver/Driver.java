package com.webstack.driver;

import com.webstack.util.MyStack;

public class Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hello Radhe Krishna...");
		
		MyStack stack=new MyStack();
		stack.push(11);
		stack.push(12);
		stack.push(13);
		stack.push(14);
		stack.push(15);
		stack.push(16); //Stack is Overflow so not able to add
		
		System.out.println(stack.toString());
		
		int topElement = stack.pop();
		topElement = stack.pop();
		topElement = stack.pop();
		topElement = stack.pop();
		topElement = stack.pop();
		topElement = stack.pop();
		
		System.out.println(topElement);
		
		stack.push(111);
		stack.push(121);
		stack.push(131);
		
		
		System.out.println(stack.peek());
		System.out.println(stack.peek());
		
		
		System.out.println("done");
	}

}
