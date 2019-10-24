package com.housegap.lab.eng.sorting;

public class QuickSort {

	public static void main(String[] args) {
//		int[] array = new int[] { 6, 8, 10, 9, 5, 7, 3, 4, 11, 1, 2, 12 };
		int[] array = new int[] { 6, 8, 3, 5, 2, 7, 4 };
		display(array);
		array = sort(array);
		display(array);

	}

	public static int[] sort(int[] array) {
		System.out.print("\nSorting ...");
		return quickSort(array, 0, array.length - 1);
	}

	public static int[] quickSort(int[] array, int low, int high) {
		if (low > high) {
			return array;
		}
		int l = low;
		int h = high;
		int mid = low + (high - low) / 2;
		int pivot = array[mid];

		while (l <= h) {
			while (array[l] < pivot) {
				l++;
			}
			while (array[h] > pivot) {
				h--;
			}
			int temp = array[l];
			array[l] = array[h];
			array[h] = temp;
			l++;
			h--;
		}
		if (low < h) {
			array = quickSort(array, low, h);
		}
		if (high > l) {
			array = quickSort(array, l, high);
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
