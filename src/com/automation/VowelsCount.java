package com.automation;

public class VowelsCount {

	public static boolean isVowel(char t) {
		return t == 'a' || t == 'e' || t == 'i' || t == 'o' || t == 'u';
	}

	public static void main(String[] args) {

		String str = "JavaWorld";
		int count = 0;

		for (int i = 0; i < str.length(); i++) {
			if (isVowel(str.charAt(i))) {
				count++;
			}
		}

		System.out.println("VowelCount :" + count);
	}

}
