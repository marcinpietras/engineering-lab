package com.housegap.lab.eng.assigment;

public class PrimeNumber {

	public static void main(String[] args) {
		System.out.println("Number 1: " + isPrime(1));
		System.out.println("Number 2: " + isPrime(2));
		System.out.println("Number 3: " + isPrime(3));
		System.out.println("Number 4: " + isPrime(4));
		System.out.println("Number 5: " + isPrime(5));
		System.out.println("Number 6: " + isPrime(6));
		System.out.println("Number 7: " + isPrime(7));

	}
	
	public static boolean isPrime(int number) {
		for(int i = 2; i < number; i++) {
			if (number%i == 0) {
				return false;
			}
		}
		return true;
	}

}
