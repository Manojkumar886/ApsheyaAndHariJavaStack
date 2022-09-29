package Array;

import java.util.Arrays;

public class SelectionSort {
	public void selectionsort(int[] hari)
	{
		for(int i=0;i<hari.length;i++)
		{
			for(int j=0;j<hari.length;j++)
			{
				if(hari[i]<hari[j])
				{
					hari[i]^=hari[j];
					hari[j]^=hari[i];
					hari[i]^=hari[j];
				}
			}
		}
	}

	public static void main(String[] args) 
	{
			int [] arr= {70,38,58,45,33,52,60};
			
			System.out.println(Arrays.toString(arr));
			SelectionSort sort=new SelectionSort();
			sort.selectionsort(arr);
			
			System.out.println(Arrays.toString(arr));
			
	}

}
