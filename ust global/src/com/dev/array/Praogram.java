package com.dev.array;

public class Praogram {
	public static void main(String[] args) {
		
		int[] a = {12,13,14,15,16};
		int index =3 ;
		
		if( index>=0 && index< a.length) {
			System.out.println("index is valid");
			for(int i=0;i<=index;i++)
			{
				System.out.println(a[i]);
				
			}
		}
		else
		{
			System.out.println("index invalid");
		}
		int k=a.length;
		int m=(k)/(2);
		System.out.println("the middle element is " +a[m]);
		
		
	}
}
