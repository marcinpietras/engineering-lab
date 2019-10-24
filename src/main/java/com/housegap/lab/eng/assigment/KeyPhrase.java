package com.housegap.lab.eng.assigment;

import java.io.IOException;
import java.net.URISyntaxException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class KeyPhrase {
	
	private Map<String, String> commonWords;
	
	public static void main(String[] args) {
		KeyPhrase keyPhrase = new KeyPhrase();
		try {
			String text = keyPhrase.readFile();
			System.out.println("Key phrase: " + keyPhrase.getKeyPhrase(text));
			
		} catch (IOException | URISyntaxException e) {
			e.printStackTrace();
		}
	}
	
	public KeyPhrase() {
		super();
		commonWords = new HashMap<String, String>();
		commonWords.put("I", null);
		commonWords.put("you", null);
		commonWords.put("a", null);
		commonWords.put("of", null);
		commonWords.put("and", null);
		commonWords.put("in", null);
		commonWords.put("is", null);
		commonWords.put("but", null);
	}

	public String getKeyPhrase(String text) {
		Map<String, Integer> keyPhrases = new HashMap<String, Integer>();
		StringTokenizer stringTokenizer = new StringTokenizer(text);
		while (stringTokenizer.hasMoreElements()) {
			String word = (String) stringTokenizer.nextElement();
			if (!commonWords.containsKey(word.trim().toLowerCase())) {
				Integer wordCounter = keyPhrases.get(word);
				if (wordCounter == null) {
					keyPhrases.put(word.trim().toLowerCase(), 1);
				} else {
					keyPhrases.put(word.trim().toLowerCase(), ++wordCounter);
				}
			}
		}
		
		System.out.println("LOG -> " + keyPhrases);
		
		String keyPhrase = null;
		Integer keyPhraseCounter = 0;
		for(String word : keyPhrases.keySet()) {
			Integer counter = keyPhrases.get(word);
			if (counter > keyPhraseCounter) {
				keyPhrase = word;
				keyPhraseCounter = counter;
			}
		}
		return keyPhrase;
	}
	
	private String readFile() throws IOException, URISyntaxException {
//		String text = new String(Files.readAllBytes(Paths.get("/Users/mpietras/mydev/engineering-lab/src/main/resources/text.txt")));
		String text = new String(Files.readAllBytes(Paths.get(ClassLoader.getSystemResource("text.txt").toURI())));
		return text;
	}

}
