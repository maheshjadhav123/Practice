package com.example;

public class Test {

	public static void main(String[] args) {

		// write a programme to print the occurance of each word in given string

		String s = "mahesh";

		char c[] = s.toCharArray();

		for (int i = 0; i < s.length(); i++) {
			if (c[i] != ' ') {
				int counter = 0;
				for (int j = 0; j < s.length(); j++) {

					if (c[i] == c[j]) {

						counter++;

					}

				}

				System.out.println(
						"The character>>>  " + c[i] + "  is repeated  " + counter + "  times in given Sentence");

			}
		}
	}
}