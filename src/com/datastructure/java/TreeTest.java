package com.datastructure.java;

public class TreeTest {
	public static void main(String[] args) {
		BinaryTree<String> b1 = new BinaryTree<String>();
		b1.root = new TreeNode<String>("E",null);
		TreeNode<String> b2 = b1.root.addLeftChild("B");
		TreeNode<String> b3 = b1.root.addRightChild("M");
		b2.addRightChild("C");
		b2.addLeftChild("A");
		b3.addRightChild("Q");
		b3.addLeftChild("L");
		b1.preOrder();
		System.out.println(" ");
		b1.postOrder();
		System.out.println(" ");
		b1.inOrder();
		b1.binarySearch("E");
		
		
		//TreeNode<String> t1 = new TreeNode<String>("D", b1.root.getLeft());
		//TreeNode<String> t2 = new TreeNode<String>("E", b1.root.getLeft());
		
	}
	
}
