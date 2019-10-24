package com.housegap.lab.eng.assigment;

public class FactorialNumer {

	public static void main(String[] args) {
		System.out.println("0! = " + factorial(0));
		System.out.println("1! = " + factorial(1));
		System.out.println("3! = " + factorial(3));
		System.out.println("5! = " + factorial(5));

	}

	public static int factorial(int number) {
		if (number == 0) {
			return 1;
		} else {
			return number * factorial(number - 1);
		}
	}

}
