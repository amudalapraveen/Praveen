package com.dev.abstaction;

public class Abstraction  extends Abstract {
	
	public Abstraction() {
		System.out.println("const of abstraction class");
	}
	@Override
void display () {
	System.out.println("this is implemented by abstract method");
}
	public static void main(String[] args) {
		Abstraction a= new Abstraction ();
		a.display();
		a.show();  
		
	}
	

}
