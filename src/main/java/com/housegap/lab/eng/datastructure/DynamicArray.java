package com.housegap.lab.eng.datastructure;

import java.util.Arrays;

public class DynamicArray<T> {
	
	private Object[] data;
	
	private int size;
	
	public static void main(String[] args) {
		DynamicArray<Integer> dynamicArray = new DynamicArray<Integer>();
		System.out.println("Size: " + dynamicArray.getSize());
		dynamicArray.put(11);
		System.out.println("Size: " + dynamicArray.getSize());
		dynamicArray.put(12);
		System.out.println("Size: " + dynamicArray.getSize());
		dynamicArray.put(13);
		System.out.println("Size: " + dynamicArray.getSize());
		dynamicArray.put(14);
		System.out.println("Size: " + dynamicArray.getSize());
		dynamicArray.put(15);
		System.out.println("Size: " + dynamicArray.getSize());
		
		System.out.println("\nDynamicArray: ");
		for (int i = 0; i < dynamicArray.getSize(); i++) {
			System.out.println(dynamicArray.get(i));
		}
		
	}
	
	public DynamicArray() {
		size = 0;
		data = new Object[1];
	}

	public int getSize() {
		return data.length;
	}
	
	@SuppressWarnings("unchecked")
	public T get(int index) {
		return (T) data[index];
	}
	
	public void put(T element) {
		ensureCapacity(size+1);
		data[size++] = element;
		
	}
	
	private void ensureCapacity(int minCapacity) {
		int oldCapacity = getSize();
		if (minCapacity > oldCapacity) {
			int newCapacity = oldCapacity * 2;
			if (newCapacity < minCapacity) {
				newCapacity = minCapacity;
			}
			data = Arrays.copyOf(data, newCapacity);
			
		}
	}
}
