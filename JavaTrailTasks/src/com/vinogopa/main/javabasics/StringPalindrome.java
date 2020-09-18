package com.vinogopa.main.javabasics;

import java.util.Scanner;

public class StringPalindrome {

	public static void main(String[] args) {
		
		Scanner reader = new Scanner(System.in); 
		System.out.println("Please enter a String for Palindrome Check:"); 
		String input = reader.nextLine();

		System.out.println(isPalindrome(input));

	}

	public static boolean isPalindrome(String input) { 
		if (input == null || input.isEmpty()) { 
			return true; 
		} 
		char[] array = input.toCharArray(); 
		StringBuilder sb = new StringBuilder(input.length()); 
		for (int i = input.length() - 1; i >= 0; i--) {
			sb.append(array[i]); 
		} 
		String reverseOfString = sb.toString(); 
		return input.equals(reverseOfString); }

}
