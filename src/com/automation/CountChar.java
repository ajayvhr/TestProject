package com.automation;

import java.util.HashMap;
import java.util.Map;

public class CountChar {

	public static void main(String[] args) {

		CountChar c = new CountChar();

		c.getCharCount("test");
		c.getCharCountWithoutWhiteSpace("test java");

	}

	public void getCharCount(String name) {

		char strArray[] = name.toCharArray();
		int count = strArray.length;

		System.out.println(count);

	}

	public void getCharCountWithoutWhiteSpace(String name) {

		char strArray[] = name.toCharArray();
		int count = 0;

		for (char c : strArray) {
			if (c!= ' ') {
				count++;
			}
			
		}
		System.out.println("Total number of characters in a string:" +count);
		
		
	}

}
