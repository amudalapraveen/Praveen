package com.dev.methods;

public class MethodExample {
	static int j=0;
	
	 static MethodExample me = new MethodExample() ;

	public static void main(String[] args) {
		
		//MethodExample me = new MethodExample(); //because it was non static create new object40

		j  =  calcArea(6);
		System.out.println( "the area of square is "+j);
       double area1= circle(7);
       System.out.println(area1);
       
       int area12 =me.areaRect(3,4);
       System.out.println("area of circle : "+area12);

	}

	public static int calcArea (int side) {
	j =side*side;
		return j;

	}
	 
	public static double circle (float r) {
		 double area1=3.14*r*r;
		 return  area1;
	}
	
	public int areaRect(int len,int width) {  // it is non static
		int area = len*width;
		return area;
	}

}
