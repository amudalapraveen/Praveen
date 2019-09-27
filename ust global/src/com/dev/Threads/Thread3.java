package com.dev.Threads;

public class Thread3 implements  Runnable{
	@Override
	public void run() {
		System.out.println("t3 is started");
		
		for (int k=1;k<=1000;k++) {
			System.out.println(k);
		}
		System.out.println("t3 is terminated");
	}
	
}
