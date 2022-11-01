package Exception;

import java.util.Arrays;
import java.util.Scanner;

public class BinaryserachUsingThrowKeyword 
{
	int[] arr1= {12,32,23,242,23,3,46,34};
	Scanner scans=new Scanner(System.in);
	public int search(int low,int high,int user)
	{
		try
		{
			if(high>low)
			{
				int mid=(low+high)/2;
				if(arr1[mid]==user)

					return mid;
				
				else if(arr1[mid]>user)
				
					return search( low, mid, user);
				
				else if(arr1[mid]<user)
				
					return search( mid+1, high, user);
			}
				else
				{	
					throw new DefaultExceptionCreated();
				}
			}
			catch (DefaultExceptionCreated e) 
			{
				System.out.println(e);
				System.out.println("enter the another data you want");
				return search(0, arr1.length-1, scans.nextInt());
			}
		return user;
			
		}
	

	public static void main(String[] args) 
	{
		 Scanner scan=new Scanner(System.in);
		BinaryserachUsingThrowKeyword key=new BinaryserachUsingThrowKeyword();
		Arrays.sort(key.arr1);
		System.out.println(Arrays.toString(key.arr1));
		System.out.println("which data you want");
		int tmp=scan.nextInt();
		System.out.println(key.search(0,key.arr1.length-1, tmp));
		
	
	}

}
