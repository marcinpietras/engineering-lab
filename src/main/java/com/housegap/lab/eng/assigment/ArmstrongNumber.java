package com.housegap.lab.eng.assigment;

public class ArmstrongNumber {

	public static void main(String[] args) {
		System.out.println("Number 1: " + isArmstrong(1));
		System.out.println("Number 153: " + isArmstrong(153));
		System.out.println("Number 154: " + isArmstrong(154));
		System.out.println("Number 371: " + isArmstrong(371));
		System.out.println("Number 372: " + isArmstrong(372));
	}
	
	public static boolean isArmstrong(int inputNumber) {
		int number = inputNumber;
		int result = 0;
		while (number > 0) {
			int digit = number%10;
			result = result + digit*digit*digit;
			number = number/10;
		}
		if (inputNumber == result) {
			return true;
		} else {
			return false;
		}
	}

}
