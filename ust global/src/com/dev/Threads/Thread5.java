package com.dev.Threads;

public class Thread5 extends Thread {
	Printer p;
	
	public Thread5(Printer pref) {
		p = pref;
	}
     @Override
	public void run() {
    	 p.printVal(10);
			
		}
	}




