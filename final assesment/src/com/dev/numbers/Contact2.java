package com.dev.numbers;


import java.util.HashMap;
import java.util.Scanner;



public class Contact2 {
	static HashMap<String,Contact> hm=new HashMap<String,Contact>();
	 static Scanner sc= new Scanner(System.in);
	
	public static void contacts() {
		Contact c1 = new Contact();
		c1.setName("praveen");
		c1.setPhoneno(8686861562l);
		c1.setGroup("union");
		
		Contact c2 = new Contact();
		c2.setName("chandu");
		c2.setPhoneno(8686861566l);
		c2.setGroup("icici");
		
		Contact c3 = new Contact();
		c3.setName("ram");
		c3.setPhoneno(8686861562l);
		c3.setGroup("sbi");
		
		Contact c4 = new Contact();
		c4.setName("charan");
		c4.setPhoneno(8686861562l);
		c4.setGroup("kvb");
		
		hm.put("1",c1);
		hm.put("2",c2);
		hm.put("2",c3);
		hm.put("2",c4);
		
		
		System.out.println(hm);
		
		
	}
	
	
		
	
	public static void search() {
		System.out.println("search name");
		String search= sc.next();
		System.out.println("press 1 to call");
		System.out.println("press to message");
		System.out.println(" press 3 go to main menu");
		
		
	}
	public static void operate() {
		
		System.out.println( "press 1 add to contact");
		System.out.println(" press 2 delete contact");
		System.out.println(" press 3 delete conatct ");
		
		int val = sc.nextInt();
		
		if (val == 1) {
			System.out.println("enter name phoneno and group");
			String name= sc.next();
			int phoneno = sc.nextInt();
			String group = sc.next();
			
			
			
		}
		else if(val == 2 ) {
			
			System.out.println(" en");
		}
		else {
			System.out.println("edit contact " +put());
			
			
		}
	}
	private static String put() {
		System.out.println("enter the contact");
		System.out.println("enter the key");
		System.out.println("enter the value");
		String key = sc.next();
		String value = sc.next();
		hm.(key,value) ;
		return  null;
		
	}
	
}
