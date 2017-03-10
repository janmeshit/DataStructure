package com.datastructure.java;

public class BinaryTree<E extends Comparable<? super E >>{
	TreeNode<E> root;
	
	private void preOrder(TreeNode<E> node){
		if(node != null){
			System.out.print(node.getValue());
			preOrder(node.getLeft());
			preOrder(node.getRight());
		}
		
	}
	
	public void preOrder(){
		this.preOrder(root);
	}
	
	private void postOrder(TreeNode<E> node){
		if(node != null){
			postOrder(node.getLeft());
			postOrder(node.getRight());
			System.out.print(node.getValue());
			
			
		}
		
	}
	
	public void postOrder(){
		this.postOrder(root);
	}
	protected void inOrder(TreeNode<E> node){
		if(node != null){
			inOrder(node.getLeft());
			System.out.print(node.getValue());
			inOrder(node.getRight());
			
			
			
		}
		
	}
	
	public void inOrder(){
		this.inOrder(root);
	}
	
	public void binarySearch(E val){
		
		//System.out.println(root.getValue().toString());
		int comp = val.compareTo(root.getValue());
		System.out.println(comp);
		
	}


	public int compareTo(E o) {
		// TODO Auto-generated method stub
		return 0;
	}

}
