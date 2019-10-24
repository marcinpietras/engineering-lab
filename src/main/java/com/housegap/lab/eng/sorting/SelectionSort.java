package com.housegap.lab.eng.sorting;

public class SelectionSort {
	
	public static void main(String[] args) {
		int[] array = new int[] { 6, 8, 3, 9, 5, 7, 3, 4, 9, 1, 2, 12 };
		display(array);
		array = sort(array);
		display(array);
		
	}
	
	public static int[] sort(int[] array) {
		System.out.print("\nSorting ...");
		for (int i = 0; i < array.length - 1; i++) {
			int min = i;
			for (int j = i + 1; j < array.length; j++) {
				if (array[j] < array[min]) {
					min = j;
				}			
			}
			if (min != i) {
				int temp = array[i];
				array[i] = array[min];
				array[min] = temp;
			}
		}
		
		return array;
	}
	
	private static void display(int[] array) {
		System.out.print("\nDisplay: ");
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + ", ");
		}
	}

}
