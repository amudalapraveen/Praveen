package com.dev.inheritance;

public class MethodOverloading {
	
	static  MethodOverloading c=new  MethodOverloading();
	public void print() {
		System.out.println("this print method with no argument");
	}
 public  int  print(int i) {
	 System.out.println("this print method with int arg");
	 return 1;
 }
 
 static String print(String str) {
	 System.out.println("this method with string argument");
	 return "A";
 }
 public static void main(String[] args) {
	c.print();
}
}
