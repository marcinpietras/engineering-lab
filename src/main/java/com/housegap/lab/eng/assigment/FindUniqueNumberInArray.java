package com.housegap.lab.eng.assigment;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;


public class FindUniqueNumberInArray {
	
	public static void main(String[] args) {
		int[] numbers = new int[]{1,3,5,5,6,6,7,8,9,9,10,10};
		System.out.println("Unique numbers: " + getUniqueNumbers(numbers));
		
	}
	
	public static List<Integer> getUniqueNumbers(int[] numbers) {
		Map<Integer, Integer> numberMap = new HashMap<Integer, Integer>();
		for (int i = 0; i < numbers.length; i++) {
			Integer counter = numberMap.get(numbers[i]);
			if (counter == null) {
				counter = 0;
			}
			numberMap.put(numbers[i], ++counter);
		}
		List<Integer> result = new LinkedList<Integer>();
		for(Integer index : numberMap.keySet()) {
			if (numberMap.get(index) == 1) {
				result.add(index);
			}
		}
		System.out.println("numberMap: " + numberMap);
		return result;
	}

}
