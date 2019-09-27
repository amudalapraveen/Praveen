package com.dev.encapsulation;

public class BirdsData {
	public static void main(String[] args) {
		Birds b= new Birds();
		Birds b1= new Birds();
		Birds b2= new Birds();
		
		b.setBirdName("Parrot");
	    b.setColor("green");
		b.setAge(5);
		
		b1.setBirdName("crow");
	    b1.setColor("black");
		b1.setAge(4);
		
		b2.setBirdName("sparrow");
	    b2.setColor("white");
		b2.setAge(3);
		
		Birds [] birds= {b,b1,b2};
		
		for(int i=0;i<birds.length;i++) {
			
			System.out.println("birdname :"+birds[i].getBirdName());
			System.out.println("color :"+birds[i].getColor());
			System.out.println("age :"+birds[i].getAge());
			System.out.println("==================");
		}
		
		
		
	}

}
