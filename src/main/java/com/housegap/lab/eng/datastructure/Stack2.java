package com.housegap.lab.eng.datastructure;

import java.util.Arrays;

public class Stack2<T> {

	private Object[] arrayStack;

	private int top;

	public Stack2() {
		super();
		top = -1;
		arrayStack = new Object[1];
	}

	public static void main(String[] args) {
		Stack2<String> stack = new Stack2<String>();
		System.out.println("Size: " + stack.getSize());
		
		stack.push("1");
		stack.push("2");
		stack.push("3");
		stack.push("4");
		System.out.println("Size: " + stack.getSize());
		
		System.out.println("Peek: " + stack.peek());
		System.out.println("Pull: " + stack.pop());
		System.out.println("Pull: " + stack.pop());
		System.out.println("Peek: " + stack.peek());
	}

	public void push(T value) {
		ensureCapacity(top + 2);
		arrayStack[++top] = value;
	}

	public T pop() {
		if (top < 0) {
			return null;
		} else {
			return (T) arrayStack[top--];
		}
	}

	public T peek() {
		if (top < 0) {
			return null;
		} else {
			return (T) arrayStack[top];
		}
	}

	public int getSize() {
		return arrayStack.length;
	}

	private void ensureCapacity(int minCapacity) {
		if (minCapacity > getSize()) {
			int newCapacity = getSize() * 2;
			arrayStack = Arrays.copyOf(arrayStack, newCapacity);
		}
	}

}
