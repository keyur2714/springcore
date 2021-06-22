package com.webstack.util;

public class MyLinkdedList {
	
	Node firstNode;
	
	public void insert(int data) {
		Node newNode = new Node();
		newNode.data = data;
		newNode.next = null;
		
		if(firstNode == null) {
			firstNode = newNode;
		}else {
			Node currentNode = firstNode;
			while(currentNode.next != null) {
				currentNode = currentNode.next;
			}
			currentNode.next = newNode;			
		}		
	}
	
	public void display() {
		Node currentNode = firstNode;
		while(currentNode != null) {
			System.out.println(currentNode.data);
			currentNode = currentNode.next;
		}
	}
	
}
