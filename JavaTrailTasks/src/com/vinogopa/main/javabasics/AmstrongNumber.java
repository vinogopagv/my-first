package com.vinogopa.main.javabasics;

import java.util.Scanner;

public class AmstrongNumber {

	public static void main(String[] args) {

		int sum = 0;int r,n;

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number:");
		int givenData = sc.nextInt();
		n = givenData;
		//Armstrong number
		while(n > 0) {
			r = n % 10;
			sum = sum + (r*r*r);
			n = n/10;
		}

		if(givenData == sum)
			System.out.println("Amstrong Number");
		else
			System.out.println("Not Amstrong Number");
	}

}
