package com.dev.Threads;

public class SyncMainThread {
	public static void main(String[] args) {
		System.out.println(" SyncMain Thread started...");
		Printer p = new Printer();
		
		Thread4 t4 = new Thread4(p);
		
		new Thread4(p).start();
		
		t4.start();
		//t4.join();
		new Thread5(p).start();
		
		
		
		System.out.println(" SyncMain Thread is terminated...");
		
	}

}
