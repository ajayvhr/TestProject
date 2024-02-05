package com.automation;


//WAP to print all elements percentage of occurence in given string
//Use charAt to get each and every characters in s string 
//Use wrapper class to check upperCase /lowerCase/digits in an string

public class ElementPercentage {

	public static void getCharPercentage(String str) {

		int length = str.length();
		int upperCaseCount = 0;
		int lowerCaseCount = 0;
		int digits = 0;
		int specialChar = 0;

		for (int i = 0; i < length; i++) {

			char ch = str.charAt(i);

			if (Character.isUpperCase(ch)) {
				upperCaseCount++;
			} else if (Character.isLowerCase(ch)) {
				lowerCaseCount++;
			} else if (Character.isDigit(ch)) {
				digits++;
			} else
				specialChar++;
		}

		double upperCasePercentage = (upperCaseCount * 100) / length;
		double lowerCasePercentage = (lowerCaseCount * 100) / length;
		double digitsPercentage = (digits * 100) / length;
		double specialCharPercentage = (specialChar * 100) / length;

		System.out.println("Percentage :" + "Value");
		System.out.println("UpperCasePercentage :" + upperCasePercentage);
		System.out.println("lowerCasePercentage :" + lowerCasePercentage);
		System.out.println("digitsPercentage :" + digitsPercentage);
		System.out.println("specialCharPercentage :" + specialCharPercentage);

	}

	public static void main(String[] args) {

		getCharPercentage("MyJavProgramIncludesAllChar#@&71257");

	}

}
