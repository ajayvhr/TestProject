package com.automation;

public class RemoveWhiteSpaces {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		RemoveWhiteSpaces removeWhiteSpace = new RemoveWhiteSpaces();

		removeWhiteSpace.removeUsingTrim(" JavaIsGreat ");
		removeWhiteSpace.removeUsingReplaceAll(" Java Is Great ");
		removeWhiteSpace.removeWhiteSpaces(" Java Is Great ");

	}

	public void removeUsingTrim(String str) {

		String stringWithoutSpace = str.trim();

		System.out.println(stringWithoutSpace);

	}

	public void removeUsingReplaceAll(String str) {

		String stringWithoutSpace = str.replaceAll("\\s+", "");

		System.out.println(stringWithoutSpace);

	}

	public void removeUsingStringUtils(String str) {

//		StringUtils.deleteWhiteSpaces();

	}

	public void removeWhiteSpaces(String str) {

		String noWhiteSpace = "";

		for (int i = 0; i < str.length(); i++) {

			if ((str.charAt(i) != ' ') && (str.charAt(i) != '\t')) {
				noWhiteSpace = noWhiteSpace + str.charAt(i);

			}

		}

		System.out.println(noWhiteSpace);

	}

}
