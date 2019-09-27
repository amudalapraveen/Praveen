//package com.dev.inheritance;
//
//class A
//{
//
//	void display() {
//		System.out.println("this is the parent class ");
//	}
//	A()
//	{
//		System.out.println("class a constructor");
//	}
//}
//class B extends A
//{
//	
//	void display1() {
//		System.out.println("this is the child class of A");
//		System.out.println("value of local variable is  :" +a);
//		System.out.println("value of local variable = " +a);
//	}
//}
//class C extends B
//{
//	
//	void display2() {
//
//		System.out.println("this is the child class of B");
//	System.out.println("value of local variable is  :" +a);
//	System.out.println("value of local variable a= "+a   );
//		
//		
//		
//	}
//}
//public class Multilevel {
//	public static void main(String[] args) {
//		
//		C obj = new C();
//
//       obj.display();
//       obj.display1();
//       obj.display2();
//       
//	}
//
//}