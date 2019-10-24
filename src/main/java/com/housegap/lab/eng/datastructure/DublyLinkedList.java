package com.housegap.lab.eng.datastructure;

public class DublyLinkedList {

	private Node head = null;
	
	private Node rear = null;

	public static void main(String[] args) {
		DublyLinkedList linkedList = new DublyLinkedList();
		linkedList.displayNoods();

		linkedList.add("1");
		linkedList.add("2");
		linkedList.add("3");
		linkedList.add("4");
		linkedList.add("5");

		System.out.println("\nAfter add");
		linkedList.displayNoods();

		linkedList.delete();

		System.out.println("\n\nAfter delete 1: ");
		linkedList.displayNoods();

		Node node2 = linkedList.search("2");
		System.out.println("\n\nNode for 2: " + node2.getValue());

		linkedList.delete("2");

		System.out.println("\n\nAfter delete 2: ");
		linkedList.displayNoods();
	}

	public Node getFirst() {
		return head;
	}

	public void add(Object value) {
		if (head == null) {
			Node node = new Node(null, value, null);
			head = node;
			rear = node;
			return;
		}
		Node node = new Node(rear, value, null);
		rear.setNext(node);
		rear = node;
	}

	public void delete() {
		if (head == null) {
			return;
		}
		head = head.getNext();
	}

	public Node search(Object value) {
		Node node = head;
		while (node != null) {
			if (value.equals(node.getValue())) {
				return node;
			}
			node = node.getNext();
		}
		return null;
	}

	public void delete(Object value) {
		if (head == null) {
			return;
		}
		if (head.getValue().equals(value)) {
			head = head.getNext();
			return;
		}
		Node current = head.getNext();
		while (current != null) {
			if (current.getValue().equals(value)) {
				current.getPrevious().setNext(current.getNext());
				return;
			}
			current = current.getNext();
		}

	}

	public void displayNoods() {
		System.out.print("Display nodes: ");
		Node node = getFirst();
		while (node != null) {
			System.out.print(node.getValue() + ", ");
			node = node.getNext();
		}
	}

	class Node {

		private Node next;

		private Node previous;

		private Object value;

		public Node(Node previous, Object value, Node next) {
			super();
			this.next = next;
			this.previous = previous;
			this.value = value;
		}

		public Node getNext() {
			return next;
		}

		public void setNext(Node next) {
			this.next = next;
		}

		public Node getPrevious() {
			return previous;
		}

		public void setPrevious(Node previous) {
			this.previous = previous;
		}

		public Object getValue() {
			return value;
		}

	}

}
