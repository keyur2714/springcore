package com.webstack.driver;

import com.webstack.util.Node;

public class BinarySearchTree {

	Node root;
	
	BinarySearchTree(){
		this.root = null;
	}
	
	public static void main(String[] args) {
		BinarySearchTree bst = new BinarySearchTree();
		bst.insert(11);
		bst.insert(3);
		bst.insert(10);
		bst.insert(12);
		bst.insert(22);
		bst.insert(13);
		
		System.out.println("In Order ::: ");
		
		bst.printInOrder(bst.root);
		
		System.out.println("Pre Order ::: ");
		
		bst.printPreOrder(bst.root);
		
		System.out.println("Post Order ::: ");
		
		bst.printPostOrder(bst.root);
	}
	
	private void insert(int data) {
		root = this.insertRecursive(root, data);
	}
		
	
	private Node insertRecursive(Node root,int data) {
		if(root == null) {
			root = new Node(data);;
			return root;
		}
		if(data < root.data) {
			root.left = insertRecursive(root.left,data);
		}else if(data > root.data) {
			root.right = insertRecursive(root.right,data);
		}
		return root;
	}

	private void printInOrder(Node node) {
		if(node == null)
			return;
				
		printInOrder(node.left);
		
		System.out.println(node.data + " ");
		
		printInOrder(node.right);
	}
	
	private void printPreOrder(Node node) {
		if(node == null)
			return;
		System.out.println(node.data + " ");
		
		printPreOrder(node.left);
		
		printPreOrder(node.right);
	}
	
	private void printPostOrder(Node node) {
		if(node == null)
			return;
				
		printPostOrder(node.left);
		
		printPostOrder(node.right);
		
		System.out.println(node.data + " ");
				
	}
	
}
