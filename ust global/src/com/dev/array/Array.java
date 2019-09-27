package com.dev.array;

public class Array {

	public static void main(String[] args) {
		int []intArr;   //declaration
		char[] charr;
		byte byteArr[];

		intArr = new  int[6]; // creation
		charr = new char[6];
		byteArr = new byte[6];

		intArr[0] = 1;   //initialization
		intArr[1] = 2;
		intArr[2] = 3;
		intArr[3] = 4;
		intArr[4] = 5;
		intArr[5] = 6;

		charr[0] = 'a';
		charr[1] = 'b';
		charr[2] = 'c';
		charr[3] = 'd';
		charr[4] = 'e';
		charr[5] = 'f';

		byteArr[0]=1;
		byteArr[1]=2;
		byteArr[2]=3;
		byteArr[3]=4;
		byteArr[4]=5;
		byteArr[5]=6;


		int a = intArr[0] * 3;
		System.out.println(a);
		
		int res2 = intArr[2] * 3;
		System.out.println(res2);
		  
		int [] intArr2 = {11,22,33,44,55,66};
		System.out.println("thyaga is " +intArr2[4]);
		
		System.out.println("length of 2nd array is "+intArr2.length);
		
		
		


		//int res1 = byteArr[5]*2;
		//System.out.println(res1);

	}

}
