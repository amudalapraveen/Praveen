package com.dev.inheritance;

public class GrandFather {
	 static GrandFather g=new GrandFather();
	String lastName = "Strak";
	public static void main(String[] args) {
		
		g.printName();
		
	}
	public void printName() {
		String name = "torrehen";
		System.out.println(name+ " " +g.lastName);
	}
	

}
