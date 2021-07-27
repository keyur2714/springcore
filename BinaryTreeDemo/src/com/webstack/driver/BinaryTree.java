package com.webstack.driver;

import com.webstack.util.Node;

public class BinaryTree {
	
	Node root;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BinaryTree tree = new BinaryTree();
		tree.root = new Node(11);
		tree.root.left = new Node(10);
		tree.root.left.left = new Node(3);
		tree.root.left.right = new Node(22);
		
		tree.root.right = new Node(12);
		tree.root.right.left = new Node(22);
		
		tree.printPreOrder(tree.root);
		
		System.out.println("------------------");
		
		tree.printInOrder(tree.root);
		
		System.out.println("-------------------");
		
		tree.printPostOrder(tree.root);
				
	}

	private void printPreOrder(Node node) {
		if(node == null)
			return;
		System.out.println(node.data + " ");
		
		printPreOrder(node.left);
		
		printPreOrder(node.right);
	}
	
	private void printInOrder(Node node) {
		if(node == null)
			return;
				
		printInOrder(node.left);
		
		System.out.println(node.data + " ");
		
		printInOrder(node.right);
	}
	
	private void printPostOrder(Node node) {
		if(node == null)
			return;
				
		printPostOrder(node.left);
		
		printPostOrder(node.right);
		
		System.out.println(node.data + " ");
				
	}
}
