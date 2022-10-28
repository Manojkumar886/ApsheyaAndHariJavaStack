package Exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class NestedCatch
{
	public static void main(String[] args) 
	{
		Scanner scan=new Scanner(System.in);
		int clock=0,block=0;//initialize an variable  block/clock=2/0-Arithmetic exception
		
		try
		{
			System.out.println("Enter the data to perform a division ");
			System.out.println("enter the your first number");
			clock=scan.nextInt();
			System.out.println("enter the your second number");
			block=scan.nextInt();
			System.out.println(clock/block);
		}
		catch(InputMismatchException input)
		{
			System.out.println(input);
			Scanner scans=new Scanner(System.in);
			System.out.println("only used for numeric values.....");
			try
			{
				System.out.println("Enter the data to perform a division ");
				System.out.println("enter the your first number");
				clock=scans.nextInt();
				System.out.println("enter the your second number");
				block=scans.nextInt();
				System.out.println(clock/block);
			}
			catch(ArithmeticException arr)
			{
				System.out.println(arr);
				System.out.println("please enter the second number is non of zero");
				block=scans.nextInt();
				System.out.println(clock/block);
			}
		}
	}
}
