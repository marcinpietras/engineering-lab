package com.housegap.lab.eng.datastructure;

public class PriorityQueue<T> {
	
private Object[] arrayQueue;
	
	private int size;
	
	private int first;
	
	private int last;
	
	public PriorityQueue(int size) {
		super();
		this.size = size;
		first = 0;
		last = -1;
		arrayQueue = new Object[size];
	}

	public static void main(String[] args) {
		PriorityQueue<String> queue = new PriorityQueue<String>(10);
		queue.display();
		
		System.out.println("\nGet: " + queue.get());
		
		queue.put(4);
		queue.put(1);
		queue.put(3);
		queue.put(2);
		queue.put(5);
		queue.display();
		
		System.out.println("\nGet: " + queue.get());
		queue.display();
		
		System.out.println("\nGet: " + queue.get());
		queue.display();
		
		queue.put(6);
		queue.put(9);
		queue.put(10);
		queue.put(7);
		queue.put(8);
		queue.display();
		
		queue.put(11);
		queue.display();
	}
	
	public void put(int value) {
		if (isFull()) {
			System.out.println("\nLOG: Queue is full");
			return;
		}
		if (isEmpty()) {
			arrayQueue[++last] = value;
			return;
		}
		for (int i = first; i <= last; i++) {
			if (value < (int) arrayQueue[i]) {
				for (int j = last; j >= i; j--) {
					arrayQueue[j+1] = arrayQueue[j];
				}
				arrayQueue[i] = value;
				last++;
				return;
			}
		}
		arrayQueue[++last] = value;
	}
	
	public int get() {
		if (isEmpty()) {
			System.out.println("\nLOG: Queue is empty");
			return -1;
		}
		return (int) arrayQueue[first++];
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
