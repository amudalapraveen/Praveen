package com.dev.constructor;

public class ConstructorPrac {
	int a;
	String b;
	

	public ConstructorPrac() {
		System.out.println("this is no argu constructor");

	}
	public ConstructorPrac(int i) {
		a=i;
		System.out.println("the value of i is :" +a);
	}
	
	public ConstructorPrac(String s) {
		b=s;
		System.out.println("the name of the string is :" +b);
	}
	public ConstructorPrac(String s,int i) {
		a=i;
		b=s;
		System.out.println("the name  and value is "+a );
		System.out.println(b);
	}
	public static void main(String[] args) {

		ConstructorPrac ce = new ConstructorPrac();
		ConstructorPrac ce1 = new ConstructorPrac(10);		
		ConstructorPrac ce2 = new ConstructorPrac("ram");
		
	}

}

