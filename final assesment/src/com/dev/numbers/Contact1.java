package com.dev.numbers;

 import java.util.Scanner;
 
public class Contact1 {
	
	
	public static void main(String[] args) {
		
		Scanner sc =new Scanner(System.in);
		System.out.println("press 1 to show contacts");
		System.out.println("press 2 to search contacts");
		System.out.println("press 3 to operate on contact");
		
		int enterValue= sc.nextInt();
		enterValueProcess(enterValue);
	}
	static public void enterValueProcess(int value) {
		
		if(value==1) {
			Contact2.contacts();
			
		}
		else if( value==2) {
			Contact2.search();
			 
		}
	
	
	else {
		Contact2.operate();
		
	}
	
}
}
	
	
		
		



