package ControlStatement;

import java.util.Scanner;

public class SwitchStatement {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
//		Scanner scan=new Scanner(System.in);
//		System.out.println("Enter any one digit number");
//		int number=scan.nextInt();
		int number =3;
		switch(number)
		{
		case 1:
		System.out.println("Your rankis one");
			break;
		case 2:
			System.out.println("Your rank is two");
			break;
		case 3:
			System.out.println("Your rank is three");
			break;
			default:System.out.println("Your rank is not eligible");
			
		}
		
	}

}
