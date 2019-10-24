package com.housegap.lab.eng.datastructure;

public class BinarySearchTree {

	private TreeNode head;

	public static void main(String[] args) {
		BinarySearchTree binarySearchTree = new BinarySearchTree();
		System.out.println("add 10, level: " + binarySearchTree.add(10));
		System.out.println("add 5, level: " + binarySearchTree.add(5));
		System.out.println("add 1, level: " + binarySearchTree.add(1));
		System.out.println("add 7, level: " + binarySearchTree.add(7));
		System.out.println("add 15, level: " + binarySearchTree.add(15));
		System.out.println("add 12, level: " + binarySearchTree.add(12));
		System.out.println("add 16, level: " + binarySearchTree.add(16));
		
		System.out.println("search 16: " + binarySearchTree.search(16));
		System.out.println("search 1: " + binarySearchTree.search(1));
		System.out.println("search 20: " + binarySearchTree.search(20));
	}

	public int add(int value) {
		int level = 0;
		if (head == null) {
			TreeNode node = new TreeNode(value);
			head = node;
			return level;
		} else {
			return addNode(head, value, level);
		}
	}

	private int addNode(TreeNode node, int value, int level) {
		level++;
		if (value < node.getValue()) {
			if (node.getLeft() == null) {
				TreeNode newNode = new TreeNode(value);
				node.setLeft(newNode);
				return level;
			} else {
				return addNode(node.getLeft(), value, level);
			}
		}
		if (value > node.getValue()) {
			if (node.getRight() == null) {
				TreeNode newNode = new TreeNode(value);
				node.setRight(newNode);
				return level;
			} else {
				return addNode(node.getRight(), value, level);
			}
		}
		return -1;
	}

	public int search(int value) {
		if (head == null) {
			return -1;
		} else {
			return searchNode(head, value);
		}
	}

	private int searchNode(TreeNode node, int value) {
		if (node == null) {
			return -1;
		}
		if (node.getValue() == value) {
			return node.getValue();
		}
		if (value < node.getValue()) {
			return searchNode(node.getLeft(), value);
		}
		if (value > node.getValue()) {
			return searchNode(node.getRight(), value);
		}
		return -1;
	}

}
