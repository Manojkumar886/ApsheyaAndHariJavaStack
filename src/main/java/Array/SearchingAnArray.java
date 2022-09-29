package Array;

import java.util.Scanner;

public class SearchingAnArray {

	public static void main(String[] args) 
	{
		String [] HeroNames= {"Vijay","Ajith","Suriya"};
		
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Tell us your favoriate actor");
		String favor=scan.next();
		
		
		for(int i=0;i<HeroNames.length;i++)
		{
			if(favor.equalsIgnoreCase(HeroNames[i]))
			{
				System.out.println(favor+"Has founded at"+i);
				return;
			}
		}
		System.out.println(favor +"Has not founted ");

	}

}
