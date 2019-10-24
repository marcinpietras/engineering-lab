package com.housegap.lab.eng.sorting;

public class BubbleSort {
	
	public static void main(String[] args) {
		int[] array = new int[] { 12, 8, 3, 9, 5, 7, 3, 8, 9, 1, 2, 12 };
		display(array);
		array = sort(array);
		display(array);
		
	}
	
	public static int[] sort(int[] array) {
		System.out.print("\nSorting ...");
		for (int i = array.length; i > 0; i--) {
			for (int j = 1; j < i; j++) {
				if (array[j-1] > array[j]) {
					int temp = array[j];
					array[j] = array[j-1];
					array[j-1] = temp;
				}			
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
