package com.dev.abstaction;

public class E implements Abs {
	
	
	public static void main(String[] args) {
		
		Abs.print();
		E e= new E () ;
		e.display();
	}	
		@Override
		public void display() {
			System.out.println(" this is an interface method");
		
		
	}
	
	

}
