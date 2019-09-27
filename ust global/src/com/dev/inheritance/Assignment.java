package com.dev.inheritance;

public class Assignment {
	void basic() {
		System.out.println("basic math operation");
	}
	
	void add (int a,int b) {
		System.out.println(" sum of two numbers is "+(a+b));
		
	}
	void add(int a, int b,int c) {
		System.out.println("the addition of three numbers is " +(a+b+c));
	}
	void add (int a,int b,int c,int d) {
		System.out.println("the addition of four numbers is " +(a+b+c+d));
	}
	void sub (int a,int b) {
		System.out.println("the subtraction of two numbers is "+(a-b));
	}
	 static void sub (int a,int b, int c) {
		System.out.println("the substraction of three numbers is :" +(a-b-c));
	}
	 private void mul( int a,int b) {
		 System.out.println(" multiple of two numbers is "+(a*b));
	 }
	public void mul (float a,float b,float c) {
		System.out.println("the multiplication of three numbers is " +(a*b*c));
	}
	   void div (int a,int b) {
		   
		   System.out.println("division of two numbers is "+(a/b));
	   }
	   void div (float a,float b,float c) {
		   System.out.println("division of three numbers is " +((a/b)/(c)));
	   }
	   public static void main(String[] args) {
		
		   Assignment a = new Assignment();
		   
		   a.basic();
		   a.add(20, 30);
		   a.add(10, 20, 30);
		   a.add(10, 20, 30, 40);
		   a.sub(10, 8);
		   a.sub(10, 8, 1);
		   a.mul(1, 10);
		   a.mul(2.5f, 3.5f, 9.5f);
		   a.div(10, 20);
		   a.div(10.5f, 6.5f, 9.5f);
		   
		   
		   
	}
	 
	 
	

}
