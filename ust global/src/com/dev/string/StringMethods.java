package com.dev.string;

public class StringMethods {
	public static void main(String[] args) {
		
		String str ="SOME STRING";
		String str1 = "some String";
		
		int length=str.length();
		System.out.println("harish is" +length);
		
		char[] ch= str.toCharArray();
		System.out.println("outputof tochar is  "+ch[10]);//10 is the index of array
		
		
		char c = str.charAt(6);
		System.out.println("output for charAt "+c);
		

		boolean b =str.equals(str1);
		System.out.println("output of equals is  " +b);
		
		boolean b1 =str.equalsIgnoreCase(str1);
		System.out.println(b1);
		
		boolean v = str.contains("l");
		System.out.println("output of contains is " +v);
		
		String s = str.replace('S','A');
		System.out.println("the output of replace is ('S','A') :" +s);
		
		int h = str.indexOf('S'); // index means the position of the character
		System.out.println("the output of the indexOf(S) is :"+h);
		
		String s1 = str.toUpperCase();
		System.out.println(s1);
		
		String s2 =s.toLowerCase();
		System.out.println(s2);
		
		String  a = str.substring(3);
		System.out.println("the output of the substring is :"+a);
		
		String q = str.substring(3, 9);
		System.out.println("the output of thesubstring(int,int) :"+q);
		
		
		
		
		
	}
	
	

}
// when we write the print statement in above the size it may error overcome that errorwe write decrease by 1 of its size "size-1= index"
