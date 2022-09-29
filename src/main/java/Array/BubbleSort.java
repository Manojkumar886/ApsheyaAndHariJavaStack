package Array;

import java.util.Arrays;

public class BubbleSort {
	public void bubble(int[] arr1)
	{
		int lvalue=arr1.length;
		for(int i=0;i<lvalue;i++)
		{
			for(int j=0;j<lvalue-i-1;j++)
			{
				if(arr1[j]>arr1[j+1])
				{
					int  swap=arr1[j];
					arr1[j]=arr1[j+1];
					arr1[j+1]=swap;
				}
			}
		}
	}

	public static void main(String[] args) 
	{
	int [] arr= {6,5,3,1,4,58,6};
	System.out.println(Arrays.toString(arr));
	BubbleSort sort=new BubbleSort();
	sort.bubble(arr);
	System.out.println("After Sorting"+Arrays.toString(arr));
	}
}
