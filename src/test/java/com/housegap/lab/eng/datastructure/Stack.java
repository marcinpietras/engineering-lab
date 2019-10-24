package com.housegap.lab.eng.datastructure;

public class Stack<T> {
	
	private Object[] arrayStack;
	
	private int size;
	
	private int top;
	
	public Stack(int size) {
		super();
		this.size = size;
		top = -1;
		arrayStack = new Object[size];
	}

	public static void main(String[] args) {
		Stack<String> stack = new Stack<String>(10);
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
		if (isFull()) {
			return;
		}
		arrayStack[++top] = value;
	}
	
	public T pop() {
		if (top < 0) {
			return null;
		} else {
			return (T)arrayStack[top--];
		}
	}
	
	public T peek() {
		if (top < 0) {
			return null;
		} else {
			return (T)arrayStack[top];
		}
	}
	
	public boolean isFull() {
		return top == (size - 1);
	}


}
