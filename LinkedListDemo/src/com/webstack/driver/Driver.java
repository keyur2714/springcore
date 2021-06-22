package com.webstack.driver;

import com.webstack.util.MyLinkdedList;

public class Driver {
	
	public static void main(String str[]) {
		System.out.println("Hello Radhe Krishna....!");
		
		MyLinkdedList myLinkedList = new MyLinkdedList();
		myLinkedList.insert(11);
		myLinkedList.insert(22);
		myLinkedList.insert(33);
		
		myLinkedList.display();
		
		System.out.println("Done...");
		
	}

}
