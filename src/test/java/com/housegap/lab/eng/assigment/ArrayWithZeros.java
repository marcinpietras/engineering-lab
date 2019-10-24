package com.housegap.lab.eng.assigment;

import com.housegap.lab.eng.datastructure.Element;

public class ArrayWithZeros {

	private int[] array = new int[] { 0, 0, 0, 1, 2, 3, 0, 0, 4, 5 };

	private Element[] elements;

	public static void main(String[] args) {
		ArrayWithZeros arrayWithZeros = new ArrayWithZeros();
		System.out.println("Array: " + arrayWithZeros.array);
		for(int i = 0; i < arrayWithZeros.array.length; i++) {
			arrayWithZeros.put(i, arrayWithZeros.array[i]);

		}
		System.out.println("Map: " + arrayWithZeros.elements);

	}

	public ArrayWithZeros() {
		super();
		elements = new Element[20];
	}

	public void put(int key, int value) {
//		Element element = elements[getHash(key)];
//		if (element == null) {
		Element newElement = null;
		for (int i = 0; i < elements.length; i++) {
			Element element = elements[i];
			if (element != null && element.getValue().equals(value)) {
				newElement = element;
				break;
			}
		}
		if (newElement == null) {
			newElement = new Element(key, value);
		}

		elements[getHash(key)] = newElement;
//		} 
//		else {
//			Element newElement = new Element(key, value);
//			newElement.setNext(element);
//			elements[getHash(key)] = newElement;
//		}

//		if (element.getValue() == null) {
//			element.setKey(key);
//			element.setValue(value);
//		} else {
//			Element newElement = new Element(key, value);
//			newElement.setNext(element);
//			elements[getHash(key)] = newElement;
//		}
	}

	public Integer get(int key) {
		Element element = elements[getHash(key)];
		if (element == null) {
			return null;
		}
		return (Integer) element.getValue();
//		while (element != null) {
//			if (key == element.getKey()) {
//				return (Integer) element.getValue();
//			}
//			element = element.getNext();
//		}
//		return null;
	}

	private int getHash(int key) {
		return key;
	}

}
