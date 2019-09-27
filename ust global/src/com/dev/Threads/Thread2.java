package com.dev.Threads;

public class Thread2 extends Thread {
	
	@Override
	public void run() {
		System.out.println("T2 thread  is started ");
		
		for( int j =1; j <=10 ; j++) {
			System.out.println("j="+j);
		
		
		}
		
		
		System.out.println("T2 thread is terminated..");
	}

}
