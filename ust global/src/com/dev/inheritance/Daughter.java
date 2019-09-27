package com.dev.inheritance;

public class Daughter extends Father  {
	
	static Daughter d = new Daughter();
	
	public void printName()  {
		String name = "sansa";
		System.out.println(name+" "+d.lastName);
		
	}
	
	public static void main(String[] args) {
		d.printName();
	}

}
