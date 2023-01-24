package com.cogent.exercises;

import java.util.HashMap;
import java.util.Map;

public class Anagram {

	public static void main(String[] args) {
		System.out.println(isAnagram("triangle", "integral"));
	}
	
	public static boolean isAnagram(String s1, String s2) {
		
		// Can't be anagram if length is not the same for both
		if(s1.length() != s2.length())
			return false;
		
		Map<Character, Integer> map = new HashMap<>();
		
		// iterate through the first string
	    for (int i = 0; i < s1.length(); i++) {
	        char c = s1.charAt(i);
	        
	        // if the character is already present in the map
	        if (map.containsKey(c)) {
	            // increment count
	            map.put(c, map.get(c) + 1);
	        } 
	        else {
	            // add the character to the map with count 1
	            map.put(c, 1);
	        }
	    }
	    
	    // iterate through the second string
	    for (int i = 0; i < s2.length(); i++) {
	        char c = s2.charAt(i);
	        // if the character is not present in the map, no anagrams
	        if (!map.containsKey(c)) {
	            return false;
	        } else {
	            // decrement the count of the character in the map
	            map.put(c, map.get(c) - 1);
	        }
	    }
	    
	    // iterate through the map
	    for (Map.Entry<Character, Integer> entry : map.entrySet()) {
	        // if the value of any entry in the map is not 0, no anagrams
	        if (entry.getValue() != 0) {
	            return false;
	        }
	    }
	    
	    return true; // at this point all tests have passed, so they are anagrams
	}
}
