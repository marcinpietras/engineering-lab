package com.housegap.lab.eng.assigment;

public class FibonacciNumber {
	
	public static void main(String[] args) {
		System.out.println("Fibonaci of 0: " + getFibonacciNumber(0));
		System.out.println("Fibonaci of 1: " + getFibonacciNumber(1));
		System.out.println("Fibonaci of 2: " + getFibonacciNumber(2));
		System.out.println("Fibonaci of 3: " + getFibonacciNumber(3));
		System.out.println("Fibonaci of 4: " + getFibonacciNumber(4));
		System.out.println("Fibonaci of 5: " + getFibonacciNumber(5));
		
		System.out.print("\nFibonaci of 10: ");
		for (int i = 1; i < 10; i++) {
			System.out.print(getFibonacciNumber(i) + ", ");
		}
		
		
	}
	
	public static int getFibonacciNumber(int number) {
		if (number == 0) {
			return 0;
		} else if (number == 1) {
			return 1;
//		} else if (number == 2) {
//			return 1;
		} else {
			return getFibonacciNumber(number - 2) + getFibonacciNumber(number - 1);
		}
	}

}
