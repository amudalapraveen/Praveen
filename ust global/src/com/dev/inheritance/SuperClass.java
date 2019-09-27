package com.dev.inheritance;

public class SuperClass {

	public SuperClass() {
		System.out.println("const with no arg of superclass");
	}
	
	public SuperClass(int i) {
		System.out.println("const with int arg of superclass");
	}
	public SuperClass(String str) {
		System.out.println("const with string arg of superclass");
	}
	public SuperClass(String str,int i) {
		System.out.println("const with string and int arg of superclass");
	}
	public SuperClass(int i,String str) {
		System.out.println("const with int and string arg of superclass");
	}
}
