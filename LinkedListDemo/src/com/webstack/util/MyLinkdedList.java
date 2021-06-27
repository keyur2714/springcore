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
	
	public void remove(int pos) {
		Node currentNode = firstNode;
		Node prevNode = null;
		int i=1;
		if(pos == 1) {
			firstNode = firstNode.next;
		}else {
			while(currentNode != null && i < pos) {				
				prevNode = currentNode;
				currentNode = currentNode.next;
				i++;
			}			
			prevNode.next = currentNode.next;					
		}		
	}
	
	public void insertWithPos(int pos,int data) {
		Node newNode = new Node();
		newNode.data = data;
		if(pos == 1) {
			newNode.next = firstNode;
			firstNode = newNode;
		}else {
			Node currentNode = firstNode;
			Node prevNode = null;
			int i=1;
			while(currentNode != null && i < pos) {				
				prevNode = currentNode;
				currentNode = currentNode.next;
				i++;
			}
			prevNode.next = newNode;
			newNode.next = currentNode;
		}
	}
	
	public void display() {
		Node currentNode = firstNode;
		while(currentNode != null) {
			System.out.println(currentNode.data + "==");
			currentNode = currentNode.next;
		}
	}
	
}
