package com.housegap.lab.eng.datastructure;

public class Stack3<T> {

	private Node head;

	public Stack3() {
		super();
	}

	public static void main(String[] args) {
		Stack3<String> stack = new Stack3<String>();

		stack.push("1");
		stack.push("2");
		stack.push("3");
		stack.push("4");

		System.out.println("Peek: " + stack.peek());
		System.out.println("Pull: " + stack.pop());
		System.out.println("Pull: " + stack.pop());
		System.out.println("Peek: " + stack.peek());
	}

	public void push(T value) {
		Node newNode = new Node(head, value);
		head = newNode;
	}

	public T pop() {
		Node node = head;
		if (node == null) {
			return null;
		}
		head = head.getNext();
		return (T)node.getValue();
	}

	public T peek() {
		Node node = head;
		if (node == null) {
			return null;
		}
		return (T)node.getValue();
	}

	class Node {

		private Node next;

		private Object value;

		public Node(Node next, Object value) {
			super();
			this.next = next;
			this.value = value;
		}

		public Node getNext() {
			return next;
		}

		public void setNext(Node next) {
			this.next = next;
		}

		public Object getValue() {
			return value;
		}

	}

}
