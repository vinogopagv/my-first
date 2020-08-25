package com.vinogopa.main.javabasics;


public class SelectionSort {
	public static void main(String[] args) {
		int arrGiven[] = {1,4,5,8,7,6,9,45,87,14,2,0,4,7,55,49};
		int size = arrGiven.length;
		
		System.out.println("Before Selection Sort:"+printArray(arrGiven));

		for(int idx = 0; idx < size ; idx++) {
			int minIdx = idx;
			for(int jIdx = idx+1; jIdx < size ; jIdx++) {
				if(arrGiven[jIdx] < arrGiven[minIdx]) {
					swapNo(arrGiven,minIdx,jIdx);
				}
			}

		}

		System.out.println("After Selection Sort :"+printArray(arrGiven));
	}
	/**
	 * print Array in console
	 * @param arraySample
	 * @return
	 */
	private static String printArray(int[] arrGiven) {
		String str ="";
		for(int ar : arrGiven) {
			str += ar+" ";
		}
		return str;
	}

	/**
	 * swap the number based on given index
	 * @param arrGiven
	 * @param minIdx
	 * @param jIdx
	 */
	private static void swapNo(int[] arrGiven, int minIdx, int jIdx) {
		int tempVar = arrGiven[minIdx];
		arrGiven[minIdx] = arrGiven[jIdx];
		arrGiven[jIdx] = tempVar;
	}


}
