package Array;

import java.util.Arrays;

public class CreatingAnArray {

	public static void main(String[] args) 
	{
		
		int[] a= {112,23,46,787,78};//one method-creation
		
		String[] name=new String[10];//size fixing format
		
		//System.out.println(a1);
		System.out.println("a value length"+a.length);
//		for(int i=0;i<a.length;i++)//For Loop
//		{
//			System.out.println(a[i]);
//		}
		
//		for(int arr:a)//for-each
//		{
//			System.out.println(arr);
//		}
		
		System.out.println(Arrays.toString(a));
		
	}

}
