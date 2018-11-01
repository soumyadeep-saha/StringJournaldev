package com.soumyadeep.string;

import java.util.Arrays;

public class StringToCharArray {

	public static void main(String[] args) {

		String str = "journaldev.com";
		char[] charArr = str.toCharArray();
		// print the char[] elements
		System.out.println("String converted to char array: " + Arrays.toString(charArr));

		char[] charArray = { 'P', 'A', 'N', 'K', 'A', 'J' };
		String str1 = new String(charArray);
		System.out.println(str1);
	}
}
