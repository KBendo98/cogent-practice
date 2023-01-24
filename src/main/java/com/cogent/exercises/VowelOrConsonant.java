package com.cogent.exercises;

public class VowelOrConsonant {

	public static void main(String[] args) {
		char c = 'I';
		
		String result = (c == 'a' || c == 'e' || c == 'i' || c == 'o' || 
				c == 'u' || c == 'A' || c == 'E' || c == 'I' || c == 'O' 
				|| c == 'U') ? "vowel" : "consonant";
		
		System.out.println(result);
	}

}
