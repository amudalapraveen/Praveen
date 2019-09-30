package com.dev.contacts;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;





public class DataSet {

	public static void main(String[] args) {
		ArrayList<Contact> hm = new ArrayList<Contact>();
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);

		ContactList b = new ContactList();
		Contact a = new Contact();
		Contact a1 = new Contact();

		System.out.println("WELCOME TO CONTACT APPLICATION");
		int op;
		do {
			System.out.println("enter 1 to Addcontact and show all contacts // enter 2 to search // enter 3 operate on contact");
			int i = sc.nextInt();
			switch(i)
			{
			case 1 :
				System.out.println("enter name");
				String d = sc.next();
				a.setName(d);
				System.out.println("enter phone no");
				long j = sc.nextLong();
				a.setPhoneNo(j);
				System.out.println("enter group type");
				String l = sc.next();
				a.setGroup(l);
				hm.add(a);
				System.out.println("*************************************************");
				System.out.println("account is created and contact is added");
				System.out.println("if u wish to create another account then press 1 ");
				int w = sc.nextInt();
				if(w==1)
				{
					
					System.out.println("enter name");
					String d1 = sc.next();
					a1.setName(d1);
					if(a.getName().equals(a1.getName()))
					{
						System.out.println("name is already in contact");

					}
					else {
						System.out.println("enter phone no");
						long j1 = sc.nextLong();
						a1.setPhoneNo(j1);
						System.out.println("enter group type");
						String l1 = sc.next();
						a1.setGroup(l1);
						hm.add(a1);
					}

				}
				System.out.println("*********************************************");


				HashSet<Contact> arr = new HashSet<>(hm);

				System.out.println(arr);
				System.out.println("contact name is displayed");
				System.out.println(a.getName());
				System.out.println(a1.getName());

				break;
			case 2 :
				System.out.println("enter the name");
				String n = sc.next();
				if(n.equals(a.getName()))
				{
					System.out.println(a);
					b.contact(a);



				}
				else if(n.equals(a1.getName()))
				{
					System.out.println(a1);
					b.contact(a1);
				}
				else
					System.out.println("name not in contact");
				break;
			case 3 :
				System.out.println("wellcome to CURD Operations");
				System.out.println("1 to delete 2 to edit");
				int s2=sc.nextInt();
				if(s2==1)
				{
					System.out.println(a1);
					System.out.println(hm.remove(a1));	
					System.out.println(a1);

				}
				else if(s2==2)
				{
					System.out.println(a);
					b.editContact(a);
					
				}
				else
					System.out.println("invalid");
				break;



			default :
				System.out.println("invalid input");


			}
			System.out.println("to continue press 1 // press 0 to exit");
			op = sc.nextInt();

		}while(op==1);
		System.out.println("thanks");
	}


}