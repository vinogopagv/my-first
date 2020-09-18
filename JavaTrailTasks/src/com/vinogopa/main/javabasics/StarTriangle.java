package com.vinogopa.main.javabasics;

import java.util.Scanner;

public class StarTriangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the No of Rows: ");
		int rows = sc.nextInt();
		
		/**
		 * Triangle Printing
		 */
		System.out.println("Triangle Printing");
		for(int i =1;i<=rows;i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println("");
		}
		
		/**
		 * Triangle(up down change) Printing
		 */
		
		System.out.println("\nTriangle 2 Printing\n");
		for(int i =1;i <= rows;i++) {
			for (int j = rows; j >= i; j--) {
				System.out.print("*");
			}
			System.out.println("");
		}
		
		
		/**
		 * Stair Case
		 */
		System.out.println("\nStair Case Printing");
		for(int i =1;i <= rows;i++) {
			for (int j = rows; j >= i; j--) {
				if(j > i)	//reverse condition for reverse stair case
					System.out.print(" ");
				if(j==i)
					for(int k =rows-j;k < rows ;k++) {
						System.out.print("#");
					}
			}
			if (i < rows) 
				System.out.println("");
		}

	}

}
