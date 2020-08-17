package com.vinogopa.main.javabasics;
class JavaException {
	public static void main(String args[]) {
		try {
			int d = 7;
			int n = 20;
			int fraction = n / d;
			int g[] = {1,2,5};
			g[20] = 100;
		}

		/**un comment to below for exception compile error chk*/
		//	 catch(Exception e){
		//	  	System.out.println("In the catch block due to Exception = "+e);
		//	  }
		catch (ArithmeticException e) {
			System.out.println("In the catch block due to Exception = " + e);
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("In the catch block due to Exception = " + e);
		}
		finally{
			System.out.println("Inside Finally"); 
		}
		System.out.println("End Of Main");
	}
}
