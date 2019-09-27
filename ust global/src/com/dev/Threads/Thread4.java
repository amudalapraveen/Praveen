package com.dev.Threads;

public class Thread4 extends Thread{
	
	Printer p;
	
	public Thread4(Printer pref) {
		p = pref;
	}
	
	
	
	
	@Override
	public void run() {
		try {
			Thread.currentThread().sleep(500);
		} catch
		
		 p.printVal(10,"Thread4");
		
		 
		 
//		for( int j=0;j<=10;j++) {
//			System.out.println("j="+j);
			
		}
	}


