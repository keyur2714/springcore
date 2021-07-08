package com.webstack.driver;

import com.webstack.util.MyQueue;

public class TestDriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hello Radhe Krishna...!");

		MyQueue queue = new MyQueue();
		queue.enQueue(11);
		queue.enQueue(12);
		queue.enQueue(13);
		queue.enQueue(14);
		queue.enQueue(15);

		queue.display();

		System.out.println("Lenght of Queue : " + queue.lengthOfQueue);

		int data = queue.deQueue();

		System.out.println(data + " Removed from Queue");

		queue.display();

		System.out.println("Lenght of Queue : " + queue.lengthOfQueue);

		queue.enQueue(16);

		queue.display();

		System.out.println("Lenght of Queue : " + queue.lengthOfQueue);
		
		queue.enQueue(17);
	}

}
