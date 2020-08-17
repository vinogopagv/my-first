package com.vinogopa.main.javabasics;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DateDemo {

	public static void main(String[] args) throws ParseException {
		
		DateDemo demo = new DateDemo();
		Date date = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("dd-MMM-yyyy");
		int cycles = 4;
		boolean done = false;
		
		for(int cycle = 1;cycle <= cycles;cycle++) {
			
			Calendar cal1 = demo.getCalendarObj();
			cal1.add(Calendar.DATE,84*cycle);
			
			String cycleDate = sdf.format(cal1.getTime());
			System.out.println("cycle NO : "+cycle+" end in "+cycleDate);
			
			if(!done && date.before(cal1.getTime())){
				System.out.println("Current Date : "+sdf.format(date));
				System.out.println("You are now in Cycle :"+cycle);
				done = true;
			}
		}
	}
	/**
	 * produces calendar instance with specified value
	 * @return
	 */
	protected Calendar getCalendarObj() {
		Calendar cal1 = Calendar.getInstance();
		cal1.set(2020, 0, 1);
		return cal1;
	}

}
