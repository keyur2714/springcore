package com.webstack.util;

public class MyQueue {

	int SIZE = 5;
	int items[] = new int[SIZE];
	public int front, rear;
	public int lengthOfQueue = 0;

	public MyQueue() {
		front = -1;
		rear = -1;
	}
	
	private boolean isFull() {
		if(front == 0 && rear == SIZE -1) {
			return true;
		}
		if(front == rear + 1) {
			return true;
		}
		return false;
	}
	
	private boolean isEmpty() {
		if(front == -1) {
			return true;
		}
		return false;
	}

	public void enQueue(int data) {
		if(isFull()) {
			System.out.println("Queue is Full.");
		}else {
			if (front == -1) {
				front = 0;
			}
			rear = (rear + 1) % SIZE;
		
			items[rear] = data;
			lengthOfQueue = lengthOfQueue + 1;
		}
	}

	public int deQueue() {
		int element;
		if(isEmpty()) {
			System.out.println("Queue is Empty.");
			return -1; 
		}else {
			
		}
		element = items[front];
		if(front == rear) {
			front = -1;
			rear = -1;
		}else {
			front = (front + 1) % SIZE;
		}		
		lengthOfQueue = lengthOfQueue - 1;
		return element;
	}
	
	public void display() {
		int i;
		if(isEmpty()) {
			System.out.println("Queue is Empty...!");
		}else {
			System.out.println("Front is : "+front);
			System.out.println("Items in Queue...!");
			for(i=front;i != rear ;i = (i+1) % SIZE) {
				System.out.print(items[i] + " ");
			}
			System.out.print(items[i]);
			System.out.println();
			System.out.println("Rear is : "+rear);
		}
				
	}

	
}
