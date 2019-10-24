package com.housegap.lab.eng.datastructure;

public class Queue3<T> {

	private Node front;
	
	private Node rear;

	public Queue3() {
		super();
		front = null;
		rear = null;
	}

	public static void main(String[] args) {
		Queue3<String> queue = new Queue3<String>();
		queue.display();

		System.out.println("\nGet: " + queue.get());

		queue.put("1");
		queue.put("2");
		queue.put("3");
		queue.put("4");
		queue.put("5");
		queue.display();

		System.out.println("\nGet: " + queue.get());
		queue.display();

		System.out.println("\nGet: " + queue.get());
		queue.display();

		queue.put("6");
		queue.put("7");
		queue.put("8");
		queue.put("9");
		queue.put("10");
		queue.display();

		queue.put("11");
		queue.display();
	}

	public void put(T value) {
		if (front == null) {
			Node newNode = new Node(null, value);
			front = newNode;
			rear = newNode;
		}
		Node newNode = new Node(null, value);
		rear.setNext(newNode);
		rear = newNode;
	}

	public T get() {
		if (front == null) {
			return null;
		}
		T value = (T) front.getValue();
		front = front.getNext();
		return value;
	}

	public void display() {
		System.out.println("\nDisplay queue: ");
		Node node = front;
		while (node != null) {
			System.out.print(node.getValue() + ", ");
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
