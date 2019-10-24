package com.housegap.lab.eng.assigment;

import java.util.HashMap;
import java.util.Map;

public class FindWordInListOfCharacters {
	
	public static void main(String[] args) {
		char[] characters = new char[] {'a', 'b', 'c', 'o', 'l', 'm', 'o', 'l', 'f', 'k', 'p'};
		System.out.println("Find word cool: " + findWordInList("cool", characters));
		System.out.println("Find word book: " + findWordInList("book", characters));
		System.out.println("Find word loop: " + findWordInList("loop", characters));
		System.out.println("Find word ok: " + findWordInList("ok", characters));
		System.out.println("Find word books: " + findWordInList("books", characters));
		
	}
	
	public static boolean findWordInList(String word, char[] characters) {
		Map<Character, Integer> charMap = new HashMap<Character, Integer>();
		for (int i = 0; i < characters.length; i++) {
			Integer counter = charMap.get(characters[i]);
			if (counter == null) {
				charMap.put(characters[i], 1);
			} else {
				charMap.put(characters[i], ++counter);
			}
		}
		char[] wordChars = word.toCharArray();
		for (int i = 0; i < wordChars.length; i++) {
			Integer counter = charMap.get(wordChars[i]);
			if (counter == null || counter < 1) {
				System.out.println("Cannot find letter: " + wordChars[i]);
				return false;
			} else {
				charMap.put(wordChars[i], --counter);
			}
		}
		return true;
	}
	
	public static int[] findWordInList2(String word, char[] characters) {
		int[] wordIndex = new int[word.length()];
		
		return wordIndex;
	}

}
