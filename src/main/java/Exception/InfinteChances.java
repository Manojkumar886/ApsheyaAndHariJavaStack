package Exception;

import java.util.Scanner;

public class InfinteChances {
	private String words="Exception is handle by try/catch/throw&throws";
	 Scanner scan=new Scanner(System.in);
	public void extractformat(int attempt)
	{
		try
		{
			System.out.println("enter the strating postion to end position  you need");
			System.out.println("enter the starting point");
			int start=scan.nextInt();
			System.out.println("enter the end value");
			int end=scan.nextInt();
			System.out.println(words.substring(start, end));
		}
		catch(StringIndexOutOfBoundsException siobe)
		{
			System.out.println(siobe);
			System.out.println("your starting value is 0 and end value is "+words.length());
			//extractformat();infinite
			if(attempt<=3)//finite
			{
				attempt++;
				extractformat(attempt);
			}
			else
			{
				System.out.println("maximum attempts is reached");
			}
		}
		finally 
		{
			System.out.println("thank you");
			
		}
		
	}

	public static void main(String[] args) 
	{
		InfinteChances obj=new InfinteChances();
		obj.extractformat(0);
	
	}

}
