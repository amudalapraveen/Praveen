package com.dev.string;

public class StringExample {
	public static void main(String[] args) {
		String name ="PRAVEEN ";
		String name1 = "praveen ";
		
		int length=name.length();
		System.out.println("output of length is "+length);
		
		char[] ch= name.toCharArray();
		System.out.println("outputof tochar is  "+ch[0]);
		
		
		char c = name.charAt(1);
		System.out.println("output for charAt "+c);
		

		boolean b =name.equals(name1);
		System.out.println("output of equals is  " +b);
		
		boolean b1 =name.equalsIgnoreCase(name1);
		System.out.println("The output of ignorecase is " +b1);
	}

}
