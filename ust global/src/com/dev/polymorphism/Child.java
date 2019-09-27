package com.dev.polymorphism;

public class Child extends Parent {
	void display() {
		{
			System.out.println("this is child method");
			
		}
	}
	public static void main(String[] args) {
		Parent p= new Parent ();
		Child a = new Child();
		p.show();
		a.display();
	}

}
