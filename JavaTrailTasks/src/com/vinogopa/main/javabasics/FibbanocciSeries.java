package com.vinogopa.main.javabasics;

import java.util.Scanner;

public class FibbanocciSeries {

	public static void main(String[] args) {
		int prevNum = 0;
		int nextNum = 1;
		int maxNum = 0;
		
		System.out.println("Enter the Max Number Count for Fibbanocci series you want: ");
		Scanner sc = new Scanner(System.in);
		maxNum = sc.nextInt();
		
		for(int indexNo=1;indexNo <= maxNum; ++indexNo) {
			System.out.println(prevNum +"");
			
			int sum = prevNum + nextNum;
			prevNum = nextNum;
			nextNum = sum;
		}
	}

}
