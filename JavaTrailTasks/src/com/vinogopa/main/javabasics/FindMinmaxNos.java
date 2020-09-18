package com.vinogopa.main.javabasics;
/**
 * Find the largest and smallest number from an integer array
 * @author Vinothkumar
 *
 */
public class FindMinmaxNos {

	public static void main(String[] args) {

		// given input 
		int[] input = { 1, -1, 2, 3, -5, 5, 7, 9, -9, 9 };
		//int[] input = { 1, -1};
		//int[] input = { };
		//int[] input = null;
		//int[] input = {1};

		if (input == null || input.length == 0) { 
			System.out.println("Empty");
		} else {

			int min = input[0];
			int max = input[0];

			for(int i = 1;i<input.length;i++) {
				if(min > input[i]) {
					min = input[i];	
				}
				else if(max < input[i])
					max = input[i];
			}
			System.out.println("Min : "+min + "  Max : "+max);
		}
	}
}

