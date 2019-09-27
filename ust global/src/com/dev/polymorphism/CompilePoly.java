package com.dev.polymorphism;

public class CompilePoly {
	void add (int a,int b)
	{
		System.out.println("addition of a and b is:" +(a+b));
	}
	
	void add(int a,int b,int c) {
		System.out.println("subtraction of three numbers is :" +(a+b+c));
		
	}
	public static void main(String[] args) {
		
		 CompilePoly c=new  CompilePoly ();
		 c.add(10, 20);
		 c.add(10, 20, 30);
	}
	
}
