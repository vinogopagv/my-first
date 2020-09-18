package com.vinogopa.main.javabasics;

import java.util.Arrays;

public class TrainPlatform {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[] = { 900, 940, 950, 1100, 1500, 1800,430 }; 
	    int dep[] = { 910, 1200, 1120, 1130, 1900, 2000 ,1040,1250}; 
	    
	    int timeSize = arr.length;
	    findMinPaltformReuried(arr,dep,timeSize);

	}

	private static void findMinPaltformReuried(int arr[], int dep[], int timeSize) {
		int platformNeeded = 1;
		int result = 1;
		int i = 1;
		int j = 0;
		
		Arrays.sort(arr);
		Arrays.sort(dep);
		
		while(i < timeSize && j < timeSize) {
			if(arr[i] <= dep[j]) {
				platformNeeded++;
				i++;
				}
			else if(arr[i] > dep[j]) {
				platformNeeded--;
				j++;
				}
				
		}
		result = Math.max(result, platformNeeded);
		
		System.out.println("Min Platform need :" +result);
		}

}
