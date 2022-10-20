package Exception;

import java.util.Scanner;

public class PurposeofException
{

	public static void main(String[] args) 
	{
		
		String collect="i have complted bachelor of computer applications";
		Scanner scan=new Scanner(System.in);
		
			try
			{
				System.out.println("please tell us which index you want");
				System.out.println(collect.charAt(scan.nextInt()));	
			}
			catch(StringIndexOutOfBoundsException exe)
			{
				System.out.println("index number should be less then"+collect.length());
				System.out.println("please tell us which index you want");
				System.out.println(collect.charAt(scan.nextInt()));
			}
			finally 
			{
				System.out.println("Thankyou");	
			}
		
//		int a=10;
//		int b=0;
//		try
//		{
//			System.out.println(a/b);//10/0
//		}
//		catch(ArithmeticException ar)
//		{
//			
//		}
	}
}
