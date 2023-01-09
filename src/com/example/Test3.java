package com.example;

import java.util.Arrays;

public class Test3 {

	// Write a program for find 2 strings are anagram or not

	public static void main(String[] args) {

		String str = "my name is";
		String str2 = "i my name";

		str = str.toLowerCase();
		str2 = str2.toLowerCase();

		if (str.length() != str2.length()) {

			System.out.println("Both the strings are not anagram");

		} else {

			char a[] = str.toCharArray();
			char b[] = str2.toCharArray();

			Arrays.sort(a);
			Arrays.sort(b);

			if (Arrays.equals(a, b)) {

				System.out.println("Both the strings are  anagram");

			} else {
				System.out.println("Both the strings not are anagram");

			}

		}

	}

}
