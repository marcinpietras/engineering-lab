package com.housegap.lab.eng.datastructure;

public class Queue<T> {
	
	private Object[] arrayQueue;
	
	private int size;
	
	private int first;
	
	private int last;
	
	public Queue(int size) {
		super();
		this.size = size;
		first = 0;
		last = -1;
		arrayQueue = new Object[size];
	}

	public static void main(String[] args) {
		Queue<String> queue = new Queue<String>(10);
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
		if (isFull()) {
			System.out.println("\nLOG: Queue is full");
			return;
		}
		arrayQueue[++last] = value;
	}
	
	public T get() {
		if (isEmpty()) {
			System.out.println("\nLOG: Queue is empty");
			return null;
		}
		return (T) arrayQueue[first++];
	}
	
	public void display() {
		System.out.println("\nDisplay queue: ");
		for (int i = first; i <= last; i++) {
			System.out.print(arrayQueue[i] + ", ");
		}
	}
	
	private boolean isFull() {
		return last == (size - 1);
	}
	
	private boolean isEmpty() {
		return first > last;
	}

}
