package ControlStatement;

import java.util.Scanner;

public class SampleProgram {

	public static void main(String[] args) 
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Welcome to enterprises");
		System.out.println("Tell us what do you want-IT/Account/Games/Banking/Generaluse");
		String usage=scan.nextLine();
		switch (usage) 
		{
		case "IT":
			System.out.println("You are choose to IT professional laptop,that time available");
			System.out.println("Currently available IT professional laptops are acer,lenovo,dell,hp");
			String type=scan.nextLine();
			switch(type)
			{
			 case "acer":
				 System.out.println("what price you want");
				 int price=scan.nextInt();
				 if(price>15000&price<50000)
				 {
					 System.out.println("Currently available laptops are acer v5/acer v3");
				 }
				 else if(price>50000)
				 {
					 System.out.println("Apple laptop price is 50000++");
				 }
				 else
				 {
					 System.out.println("not available");
				 }
				 
				 break;
			}
			break;
		case "Accounts":
			System.out.println("You are select accounts type laptop,that time not available");
			break;
		case "Games":
			System.out.println("You are select accounts type laptop,that time  available");
			break;
		case "Generaluse":
			System.out.println("You are select accounts type laptop,that time not available");
			break;
		default:
			System.out.println(usage+"That time not available for your laptop");
			break;
		}

	}

}
