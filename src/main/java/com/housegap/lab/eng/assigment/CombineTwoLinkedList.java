package com.housegap.lab.eng.assigment;

import java.util.LinkedList;
import java.util.List;

public class CombineTwoLinkedList {
	
	private LinkedList<Integer> list1;
	
	private LinkedList<Integer> list2;
	
	public static void main(String[] args) {
		CombineTwoLinkedList combineTwoLinkedList = new CombineTwoLinkedList();
		
		System.out.println("List1: " + combineTwoLinkedList.list1);
		System.out.println("List2: " + combineTwoLinkedList.list2);
		List<Integer> result = combineTwoLinkedList.combine();
		System.out.println("Result: " + result);
	}

	public CombineTwoLinkedList() {
		super();
		list1 = new LinkedList<Integer>();
		list1.add(1);
		list1.add(5);
		list1.add(10);
		list1.add(15);
		list1.add(20);
//		list1.add(25);
//		list1.add(30);
	
		list2 = new LinkedList<Integer>();
		list2.add(1);
		list2.add(2);
		list2.add(5);
		list2.add(11);
		list2.add(12);
		list2.add(13);
		list2.add(14);
	}
	
	public LinkedList<Integer> combine() {
		LinkedList<Integer> result = new LinkedList<Integer>();
		int list1index = 0;
		int list2index = list2.size() - 1;
		while (list1index < list1.size() || list2index >= 0) {
			if (list1index < list1.size() && list1.get(list1index) != null) {
				result.add(list1.get(list1index++));
			}
			if (list2index >=0 && list2.get(list2index) != null) {
				result.add(list2.get(list2index--));
			}
		}
		return result;
	}
	

}
