package com.dev.Threads;

public class MainThreadClass {
	
		public static void main(String[] args) {
			System.out.println("main thread started...");
			System.out.println("main Thread class prints the value of i");
			 
			Thread2  t2= new Thread2();
			t2.setName("Thread T2");
			  t2.start();
			new Thread2().start();
			
			Thread3 t3 =new Thread3();
			Thread t= new Thread();
			t2.setPriority(1);
			t.start();
			
			Thread.currentThread().setName("Main thread");
			
			//new Thread(new T3()).start(); //the above stmt is als same//
			
			for( int i=1;i<=10;i++) {
				System.out.println("i="+i);
				
				
			}
				System.out.println("Thread Name2: "+t2.getName());
			System.out.println("Thread Name1: "+Thread.currentThread().getName());
			System.out.println("Thread2 id :"+t2.getId());
			System.out.println("Thread3 id :"+t.getId());
			System.out.println("main thread id :"+Thread.currentThread().getId());
			System.out.println("main thread priority: "+t2.getPriority());
			
			
			
			
			System.out.println("main thread terminated...");
			
		}

	}


