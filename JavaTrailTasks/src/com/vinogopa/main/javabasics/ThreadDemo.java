package com.vinogopa.main.javabasics;


public class ThreadDemo implements Runnable {

	public static void main(String[] args) {

		Thread n1 = new Thread("Thread1");
		Thread n2 = new Thread("Thread2");
		n1.start();
		n2.start();
		n1.interrupt();
		System.out.println("Thread 1 name :"+n1.getName());
		System.out.println("Thread 2 name :"+n2.getName());

	}


	@Override
	public void run() {
		System.out.println("Run Called");
	}

}
