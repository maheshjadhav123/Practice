package com.example;

public class Test2 {

	public static void main(String[] args) {

		// Chec the given string is palindrome or not

		String s = "radar";

		String r="";
		
		
		for(int i=s.length()-1;i>=0;i--) {
			
			r=r+s.charAt(i);
			
			
		}
		
		if(s.equals(r)) {
			
			
			System.out.println("Given String>>  "+s+"  << is Pelindrome");
		}else {
			
			System.out.println("Given String   "+s+"  is not a Pelindrome");
		}
		
		
	}
}
