package com.vinogopa.main.javabasics;

/**
 * 
 * You have given an integer array of size N. Array contains numbers from 1 to N-1 
 * but a couple of numbers are missing in an array which also contains duplicates.
 * 
 */

/** 
 * Java Program to find missing numbers in an integer 
 * array with duplicates. 
 * Array may contains more  than one duplicates.  
 * input: {1, 1, 2, 3, 5, 5, 7, 9, 9, 9}; 
 * output: 4, 6, 8 
 */

public class FindMissingNumbers {
	public static void main(String[] args) { 
		// given input 
		int[] input = { 1, 1, 2, 3, 5, 5, 7, 9, 9, 9 }; 

		// let's create another array with same length  by default all index will contain zero  default value for int variable 
		int[] register = new int[input.length]; 

		// now let's iterate over given array to mark all present numbers in our register array 

		for (int i : input) {
			register[i] = 1;
		} 

		//let's print all the absentees
		System.out.println("missing numbers in given array"); 

		for (int i = 1; i < register.length; i++) { 
			//0 Means Number not present in the array
			if (register[i] == 0) {
				System.out.println(i); 
			} 
		} 
	}
}

