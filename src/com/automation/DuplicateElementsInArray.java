package com.automation;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class DuplicateElementsInArray {

	// There are 3 ways of solving
	// BruteSet
	// HashSet
	// HashMap

	public static void main(String[] args) {

		String array[] = { "AJAY", "HISHU", "SHIVANI", "HISHU", "AJAY", "SHALU", "SHALINI", "SHALU" };

		// BruteForce

		System.out.println("BruteForce");

		for (int i = 0; i < array.length; i++) {
			for (int j = i + 1; j < array.length; j++) {
				if (array[i].equals(array[j])) {
					System.out.println(array[i]);
				}

			}

		}

		// HashSet

		System.out.printf("\n" +"HashSet" + "\n");

		Set<String> str = new HashSet<String>();

		for (String s : array) {
			if (str.add(s) == false) {
				System.out.println(s);
			}
		}

		// HashMap
		
		System.out.println( "\n" +"HashMap");


		Map<String, Integer> map = new HashMap<String, Integer>();

		for (String c : array) {
			Integer count = map.get(c);

			if (count == null) {
				map.put(c, 1);
			} else {
				map.put(c, ++count);
			}

		}

		Set<Entry<String, Integer>> entrySet = map.entrySet();

		for (Entry<String, Integer> entry : entrySet) {
			if (entry.getValue() > 1) {

				System.out.println(entry.getKey() + ":" + entry.getValue());
			}

		}

	}

}
