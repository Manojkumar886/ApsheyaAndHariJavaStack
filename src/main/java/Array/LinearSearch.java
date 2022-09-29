package Array;

import java.util.Arrays;
import java.util.Scanner;

public class LinearSearch {
	
	public static float linearsearch(float[] arr1,float key)
	{
		for(int pos=0;pos<arr1.length;pos++)
		{
			if(arr1[pos]==key)
			{
				return pos;
			}
		}
		return -2;
	}

	public static void main(String[] args) 
	{
		float [] arr= {82.3f,13.4f,25.6f,67.11f,9.8f};
//		Arrays.sort(arr);
//		
		System.out.println(Arrays.toString(arr));
		
		LinearSearch search=new LinearSearch();
		Scanner scan=new Scanner(System.in);
		System.out.println("What is number is you want");
		float key=scan.nextFloat();
		
		System.out.println(key+" is founded by index of"+linearsearch(arr, key));
		
		

	}

}
