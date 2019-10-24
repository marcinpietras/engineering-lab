package com.housegap.lab.eng.searching;

public class InterpolationSearch {

	private static int counter = 0;

	public static void main(String[] args) {
		int[] array = new int[] { 1, 2, 3, 4, 5, 6, 7 };
		System.out.println("Search 2: " + search(2, array) + ", counter: " + counter);
		System.out.println("Search 1: " + search(1, array) + ", counter: " + counter);
		System.out.println("Search 7: " + search(7, array) + ", counter: " + counter);
		System.out.println("Search 6: " + search(6, array) + ", counter: " + counter);
		System.out.println("Search 5: " + search(5, array) + ", counter: " + counter);
		System.out.println("Search 9: " + search(9, array) + ", counter: " + counter);
		
		array = new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12 };
		System.out.println("\n\nSearch 2: " + search(2, array) + ", counter: " + counter);
		System.out.println("Search 1: " + search(1, array) + ", counter: " + counter);
		System.out.println("Search 7: " + search(7, array) + ", counter: " + counter);
		System.out.println("Search 6: " + search(6, array) + ", counter: " + counter);
		System.out.println("Search 5: " + search(5, array) + ", counter: " + counter);
		System.out.println("Search 9: " + search(9, array) + ", counter: " + counter);

	}

	public static int search(int number, int[] array) {
		counter = 0;
		return binarySearch(number, array, 0, array.length - 1);
	}

	private static int binarySearch(int number, int[] array, int low, int high) {
		counter++;
//		int pivot = low + (high - low) / 2;
		int pivot = low + ((high - low)/(array[high] - array[low])) * (number - array[low]);
		if (pivot < low || pivot > high) {
			return -1;
		} else if (number == array[pivot]) {
			return pivot;
		} else if (number > array[pivot]) {
			return binarySearch(number, array, pivot + 1, high);
		} else if (number < array[pivot]) {
			return binarySearch(number, array, low, pivot - 1);
		}
		return -1;
	}

}
