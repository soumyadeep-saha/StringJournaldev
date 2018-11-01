package com.soumyadeep.string;

public class StringPool {

	public static void main(String[] args) {

		/*
		 * For example, how many string is getting created in below statement; String
		 * str = new String("Cat"); In above statement, either 1 or 2 string will be
		 * created. If there is already a string literal “Cat” in the pool, then only
		 * one string “str” will be created in the pool. If there is no string literal
		 * “Cat” in the pool, then it will be first created in the pool and then in the
		 * heap space, so total 2 string objects will be created.
		 */
		
		String s1 = "Cat";
		String s2 = "Cat";
		String s3 = new String("Cat");

		System.out.println("s1 == s2 :" + (s1 == s2));
		System.out.println("s1 == s3 :" + (s1 == s3));
	}
}
