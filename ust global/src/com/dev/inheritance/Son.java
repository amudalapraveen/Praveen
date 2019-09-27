package com.dev.inheritance;

public class Son extends Father {
	static Son s= new Son();
	
	public void printName() {
		
		String name  = "rock";
				System.out.println(name+" "+s.lastName);
				super.printName();
				
	}
    public static void main(String[] args) {
		s.printName();
	}
}
