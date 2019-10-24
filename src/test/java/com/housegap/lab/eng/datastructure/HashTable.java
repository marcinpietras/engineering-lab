package com.housegap.lab.eng.datastructure;

import java.util.ArrayList;
import java.util.List;

public class HashTable<T> {

	private Element[] elements;

	private int size;

	public HashTable(int size) {
		super();
		this.size = size;
		elements = new Element[size];
//		for (int i = 0; i < size; i++) {
//			elements[i] = new Element();
//		}
	}

	public static void main(String[] args) {
		HashTable<String> hashTable = new HashTable<String>(10);
		hashTable.put(1, "1");
		hashTable.put(11, "11");
		hashTable.put(21, "21");
		hashTable.put(2, "2");
		hashTable.put(3, "3");

		hashTable.display();

		System.out.println("\n\nKeys: " + hashTable.keys());

		System.out.println("\nValue for 1 : " + hashTable.get(1));
		System.out.println("\nValue for 3 : " + hashTable.get(3));

		hashTable.remove(11);
		hashTable.display();

		hashTable.remove(2);
		hashTable.display();

		hashTable.remove(21);
		hashTable.display();
	}

	public void put(int key, T value) {
		Element element = elements[getHash(key)];
		if (element == null) {
			Element newElement = new Element(key, value);
			elements[getHash(key)] = newElement;
		} else {
			Element newElement = new Element(key, value);
			newElement.setNext(element);
			elements[getHash(key)] = newElement;
		}

//		if (element.getValue() == null) {
//			element.setKey(key);
//			element.setValue(value);
//		} else {
//			Element newElement = new Element(key, value);
//			newElement.setNext(element);
//			elements[getHash(key)] = newElement;
//		}
	}

	public T get(int key) {
		Element element = elements[getHash(key)];
		while (element != null) {
			if (key == element.getKey()) {
				return (T) element.getValue();
			}
			element = element.getNext();
		}
		return null;
	}

	public void remove(int key) {
		Element element = elements[getHash(key)];
		Element previous = element;
		while (element != null) {
			if (key == element.getKey()) {
				if (element.equals(previous)) {
					elements[getHash(key)] = element.getNext();
				} else {
					previous.setNext(element.getNext());
				}
			}
			previous = element;
			element = element.getNext();
		}
	}

	public List<Integer> keys() {
		List<Integer> keys = new ArrayList<Integer>();
		for (int i = 0; i < size; i++) {
			Element element = elements[i];
			while (element != null) {
				keys.add(element.getKey());
				element = element.getNext();
			}
		}
		return keys;
	}

	public void display() {
		System.out.println("\n\nDisplay");
		for (int i = 0; i < size; i++) {
			System.out.print("\nHash: " + i + " -> ");
			Element element = elements[i];
			while (element != null) {
				System.out.print(element.getValue() + ", ");
				element = element.getNext();
			}
		}
	}

	private int getHash(int key) {
		return key % size;
	}

}
