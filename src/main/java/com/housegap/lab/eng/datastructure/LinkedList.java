package com.housegap.lab.eng.datastructure;

public class LinkedList {
	
	private Node head = null;
	
	public static void main(String[] args) {
		LinkedList linkedList = new LinkedList();
		linkedList.displayNoods();
		
		linkedList.add("1");
		linkedList.add("2");
		linkedList.add("3");
		linkedList.add("4");
		linkedList.add("5");
		
		System.out.println("\nAfter add");
		linkedList.displayNoods();
		
		linkedList.delete();
		
		System.out.println("\nAfter delete");
		linkedList.displayNoods();
		
		Node node2 = linkedList.search("2");
		System.out.println("\nNode for 2 : " + node2.getValue());
		
		linkedList.delete("2");
		
		System.out.println("\nAfter delete 2");
		linkedList.displayNoods();
	}
	
	
	public Node getFirst() {
		return head;
	}
	
	public void add(Object value) {
		Node node = new Node(head, value);
		head = node;
	}
	
	public void delete() {
		if (head == null) {
			return;
		}
		head = head.getNext();
	}
	
	public Node search (Object value) {
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
		Node previous = head;
		Node current = head.getNext();
		while (current != null) {
			if (current.getValue().equals(value)) {
				previous.setNext(current.getNext());
				return;
			}
			previous = current;
			current = current.getNext();
		}
	
	}
	
	public void displayNoods() {
		System.out.println("\nDisplay nodes: ");
		Node node = getFirst();
		while(node != null) {
			System.out.println(node.getValue());
			node = node.getNext();
		}
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
