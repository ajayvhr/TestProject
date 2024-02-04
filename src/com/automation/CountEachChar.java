package com.automation;

import java.util.HashMap;
import java.util.Map;

//WAP to count the occurrence of each characters in a string 

public class CountEachChar {

	public void getCharCount(String name) {

		char strArray[] = name.toCharArray();
		Map<Character, Integer> charMap = new HashMap<Character, Integer>();

		for (char c : strArray) {

			if (charMap.containsKey(c)) {
				charMap.put(c, charMap.get(c) + 1);
			} else
				charMap.put(c, 1);
		}

		System.out.println(name + ":" + charMap);
	}

	public void getCharCountWithOutWhiteSpace(String name) {

		char strArray[] = name.toCharArray();
		Map<Character, Integer> charMap = new HashMap<Character, Integer>();

		for (char c : strArray) {
			if (!String.valueOf(c).isBlank()) {
				if (charMap.containsKey(c)) {
					charMap.put(c, charMap.get(c) + 1);
				} else
					charMap.put(c, 1);
			}
		}

		System.out.println(name + ":" + charMap);
	}

	public static void main(String[] args) {

		CountEachChar c = new CountEachChar();
		c.getCharCount("test");
		c.getCharCountWithOutWhiteSpace("This is my first program");

	}

}
