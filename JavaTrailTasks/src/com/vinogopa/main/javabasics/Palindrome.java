package com.vinogopa.main.javabasics;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		
		int sum = 0;int r,n;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number:");
		int givenData = sc.nextInt();
		n = givenData;
		//logic for reverse a given number
		while(n > 0) {
		r = n % 10;
		sum = (sum*10)+r;
		n = n/10;
		}
		
		System.out.println("Reverse Number :"+sum);
		if(givenData == sum)
			System.out.println("palindrome");
		else
			System.out.println("Not palindrome");
	}

}
