package com.soumyadeep.string;

import java.util.Arrays;

public class StringSplit {

	public static void main(String[] args) {

		String line = "I am a java developer";

		String[] words = line.split(" ");

		String[] twoWords = line.split(" ", 2);

		System.out.println("String split with delimiter: " + Arrays.toString(words));

		System.out.println("String split into two: " + Arrays.toString(twoWords));

		// split string delimited with special characters
		String wordsWithNumbers = "I|am|a|java|developer";

		/*
		 * We can use backslash to use java regular expression special characters as
		 * normal characters, like I have used pipe (|) special character in above
		 * program
		 */
		String[] numbers = wordsWithNumbers.split("\\|");

		System.out.println("String split with special character: " + Arrays.toString(numbers));
	}
}
