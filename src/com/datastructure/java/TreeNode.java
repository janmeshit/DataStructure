package com.datastructure.java;

public class TreeNode<E> {
	private E value;
	private TreeNode<E> parent;
	private TreeNode<E> left;
	private TreeNode<E> right;
	
	public TreeNode(E value,TreeNode<E> parent){
		this.value = value;
		this.parent = parent;
		this.left = null;
		this.right = null;
	}

	public E getValue() {
		return value;
	}

	public void setValue(E value) {
		this.value = value;
	}

	public TreeNode<E> getParent() {
		return this.parent;
	}

	public void setParent(TreeNode<E> parent) {
		this.parent = parent;
	}

	public TreeNode<E> getLeft() {
		return left;
	}

	public void setLeft(TreeNode<E> left) {
		this.left = left;
	}

	public TreeNode<E> getRight() {
		return right;
	}

	public void setRight(TreeNode<E> right) {
		this.right = right;
	}
	
	public TreeNode<E> addLeftChild(E value){
		this.left = new TreeNode<E>(value,this);
		return this.left;
	}
	public TreeNode<E> addRightChild(E value){
		this.right = new TreeNode<E>(value,this);
		return this.right;
	}
}
