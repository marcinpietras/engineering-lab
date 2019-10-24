package com.housegap.lab.eng.datastructure;


public class Element {
	
	private int key;
	
	private Object value;
	
	private Element next;

	public Element() {
		super();
	}

	public Element(int key, Object value) {
		super();
		this.key = key;
		this.value = value;
	}

	public int getKey() {
		return key;
	}

	public void setKey(int key) {
		this.key = key;
	}

	public Object getValue() {
		return value;
	}

	public void setValue(Object value) {
		this.value = value;
	}

	public Element getNext() {
		return next;
	}

	public void setNext(Element next) {
		this.next = next;
	}

}
