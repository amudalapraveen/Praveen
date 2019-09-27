package com.dev.encapsulation;

public class DogData {
	public static void main(String[] args) {
		Dog d=new Dog();
		Dog d1= new Dog();
		Dog d2 =new Dog();
		
		d.setAge(2);
		d.setBreed("hutch");
		d.setColor("white");
		d.setName("chocho");
		
		d1.setAge(1);
		d1.setBreed("german");
		d1.setColor("black");
		d1.setName("rocky");
		
		d2.setAge(1);
		d2.setBreed("dober man");
		d2.setColor("brown");
		d2.setName("abby");
		
		Dog [] dogs = {d,d1,d2};
		
		for (int i=0;i<dogs.length;i++) {
			System.out.println("age : " +dogs[i].getAge());
			System.out.println("breed: "+dogs[i].getBreed());
			System.out.println("color: "+dogs[i].getColor());
			System.out.println("Name : "+dogs[i].getName());
			System.out.println("***********************");
			
	}
		
		
		
	}

}
