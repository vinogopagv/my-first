package com.vinogopa.main.javabasics;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {

		int reminder = 0;
		boolean isPrime = true;
		
		System.out.println("Enter the Number:");
		Scanner sc = new Scanner(System.in);
		int NumberToCheck = sc.nextInt();
		
		if(NumberToCheck <= 2) {
			System.out.println("Pls enter Number greater than 2,Since 0,1 and 2 are default Prime number");
		}else {
			//check range from 2 to half of it value,Ex : 17 -> 2 to 8
			for(int i = 2;i < NumberToCheck/2;i++) {
				reminder = NumberToCheck % 2;
				
				//if reminder is ZERO then its not prime 
				//since,prime number is a number divided by 1 and itself.
				if(reminder == 0) {
					isPrime = false;
					break;
				}
			}
			if(isPrime)
				System.out.println("Prime");
			else
				System.out.println("Non Prime");
		}
	}

}
