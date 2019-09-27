package com.dev.Threads;

public class Test {
	public static void main(String[] args) {
		System.out.println("min thread is terminated");
		for( int i =1; i <=1000 ; i++) {
			System.out.println("j="+i);
		}
		
		for( int i =0; i<0 ; i++) {
			System.out.println("j="+i);
	}
		System.out.println("main thread is terminated");
	}
}
