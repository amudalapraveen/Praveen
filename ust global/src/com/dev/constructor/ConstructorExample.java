package com.dev.constructor;

public class ConstructorExample {
	public ConstructorExample() {
		System.out.println("this is no argu constructor");

	}
	public ConstructorExample(int i) {
		System.out.println("the constructor with no argumennt");
	}
	
	//public ConstructorExample(String s) {
		//System.out.println("this constructor is  string arg");
	//}
	public ConstructorExample(String s) {
		System.out.println("this constructor is  string arg");
	}
	public static void main(String[] args) {

		ConstructorExample ce = new ConstructorExample();
		ConstructorExample ce1 = new ConstructorExample(1);		
		ConstructorExample ce2 = new ConstructorExample("a");
		
	}

}
