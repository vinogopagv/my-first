package com.vinogopa.main.javabasics;

import java.util.Scanner;
/**
 * EB Bill Calculator for TNEB for House Tariff only
 * @author Vinothkumar
 *
 */
public class EBbillCalculator {
	
	private double amountInRs;
	private double energyConsumed;
	
	public static void main(String[] args) {
		EBbillCalculator ebBill = new EBbillCalculator();
		ebBill.findElectricityCharge();
		
	}

	EBbillCalculator(){
		this.amountInRs = 0d;
		this.energyConsumed = 0d;
	}
	
	/**
	 * findElectricityCharge method calculate EB Charge for consumed units.
	 * 
	 * for FIRST 100 units - Rs.0.0(Free)
	 * Charges mentioned here are for one unit
	 * Up to 200 usage, For 101 to 200 units Charge is Rs.1.50 
	 * Up to 500 usage, For 101 to 200 units Charge is Rs 2.0 for 201 to 500 units Charge is Rs 3.0
	 * Above 500 usage,For 101 to 200 units Charge is Rs 3.50 for 201 to 500 units 
	 * Charge is Rs 4.60 and  for above 500 Charge is 6.60 
	 */
	private void findElectricityCharge() {
		
		System.out.println("Please enter the Energy Consumed in KWh:");
		Scanner sc = new Scanner(System.in);
		this.energyConsumed =  sc.nextDouble();
		
		if(this.energyConsumed <= 100) {
			this.amountInRs = 0;
		}
		else if(100d < this.energyConsumed &&  this.energyConsumed <= 200d) {
			this.amountInRs = ((this.energyConsumed-100)) * 1.50;
		}else if(200d < this.energyConsumed &&  this.energyConsumed <= 500d) {
			this.amountInRs = ((this.energyConsumed -200)) * 3 + (100 * 2);
		}else {
			this.amountInRs = ((this.energyConsumed -500) * 6.60) + (300 *4.60) + (100 * 3.50);

		}
		System.out.println( "Elecricity Charge For "+ this.energyConsumed +" Kwh is Rupees :"+ this.amountInRs);
	}

}
