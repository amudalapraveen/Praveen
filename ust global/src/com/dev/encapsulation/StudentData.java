package com.dev.encapsulation;

public class StudentData{
	public static void main(String[] args) {
		Student s= new Student();
		s.setRegno(00001);
		s.setName("ram");
		s.setEmail("ram@gmail.com");
		s.setPassword("1234");
		
		
		
		System.out.println("reg.no: "+s.getRegno());
		System.out.println("reg.no: "+s.getName());
		System.out.println("email "+s.getEmail());
		System.out.println("*******");
	}

}
