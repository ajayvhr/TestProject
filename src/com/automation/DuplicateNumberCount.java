package com.automation;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;

//WAP to count the occurrence of all he digits in the number 
//Create HashMap
//Use whileLoop having condition that number is not zero
//Get last digit from the number using modus 10 
//Add if loop as per the requirements

public class DuplicateNumberCount {

	public static void getDigitCount(long number) {

		HashMap<Long, Integer> hashMap = new HashMap<Long, Integer>();

		while (number != 0) {

			long lastNumber = number % 10;

			if (hashMap.containsKey(lastNumber)) {
				hashMap.put(lastNumber, hashMap.get(lastNumber) + 1);
			} else {
				hashMap.put(lastNumber, 1);
			}

			number = number / 10;
		}

		Set<Entry<Long, Integer>> keys = hashMap.entrySet();
		for (Entry key : keys) {
			System.out.println(key.getKey() + ":" + key.getValue());

		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		getDigitCount(8800401564L);

	}
}
