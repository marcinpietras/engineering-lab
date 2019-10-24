package com.housegap.lab.eng.searching;

public class LinearSearch {
	
	public static void main(String[] args) {		
		int[] array = new int[] {2,4,7,9,10,3,5,1,6,8};
		System.out.println("Search 9: " + search(9, array));
		System.out.println("Search 11: " + search(11, array));
		System.out.println("Search 2: " + search(2, array));
		System.out.println("Search 8: " + search(8, array));
		System.out.println("Search 10: " + search(10, array));
		
	}
	
	public static int search(int number, int[] array) {
		for (int i = 0; i < array.length; i++) {
			if (number == array[i]) {
				return i;
			}
		}
		return -1;
	}

}
