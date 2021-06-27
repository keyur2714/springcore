package com.webstack.driver;

import com.webstack.util.MyLinkdedList;

public class Driver {
	
	public static void main(String str[]) {
		System.out.println("Hello Radhe Krishna....!");
		
		MyLinkdedList myLinkedList = new MyLinkdedList();
		myLinkedList.insert(11);
		myLinkedList.insert(22);
		myLinkedList.insert(33);
		myLinkedList.insert(44);
		myLinkedList.insert(55);
		
		System.out.println("After Insert");
		
		myLinkedList.display();
		
		myLinkedList.insertWithPos(1,100);
		
		System.out.println("After Position Insert");
		
		myLinkedList.display();
						
		myLinkedList.remove(1);
		
		System.out.println("After Remove First Node");
		
		myLinkedList.display();
		
		myLinkedList.remove(2);
		
		System.out.println("After Remove Position 2 Node");
		
		myLinkedList.display();
		
		System.out.println("Done...");
		
	}

}
