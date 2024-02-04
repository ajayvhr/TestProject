package com.automation;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class DuplicateCharCount {

	public static void main(String[] args) {

		DuplicateCharCount charCount = new DuplicateCharCount();

		charCount.getDuplicateCharCount("Im Ajay kumar Vohra");

	}

	public void getDuplicateCharCount(String str) {

		char[] strArray = str.toCharArray();

		Map<Character, Integer> charMap = new HashMap<Character, Integer>();

		for (char c : strArray) {
			Integer count = charMap.get(c);
			if (!String.valueOf(c).isBlank()) {
				if (count == null) {
					charMap.put(c, 1);
				} else {
					charMap.put(c, ++count);
				}
			}
		}

			Set<Entry<Character, Integer>> entrySet = charMap.entrySet();
			for (Entry<Character, Integer> entry : entrySet) {
				if (entry.getValue() > 1) {
					System.out.println(entry.getKey() + ":" + entry.getValue());
					// System.out.println(entry.getKey() + ":" + entry.getValue());

				}
			}
		}
	}
