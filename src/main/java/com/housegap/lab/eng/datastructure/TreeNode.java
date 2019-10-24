package com.housegap.lab.eng.datastructure;

public class TreeNode {
	
	private int value;
	
	private TreeNode left;
	
	private TreeNode right;

	public TreeNode(int value) {
		super();
		this.value = value;
	}

	public TreeNode getLeft() {
		return left;
	}

	public void setLeft(TreeNode left) {
		this.left = left;
	}

	public TreeNode getRight() {
		return right;
	}

	public void setRight(TreeNode right) {
		this.right = right;
	}

	public int getValue() {
		return value;
	}
	

}
