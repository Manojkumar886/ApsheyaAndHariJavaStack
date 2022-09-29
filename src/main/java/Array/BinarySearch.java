package Array;

public class BinarySearch {
	public static int search(int[] arr1,int low,int high,int user)
	{
		if(high>low)
		{
			int mid=(low+high)/2;
			if(arr1[mid]==user)
			{
				return mid;
			}
			else if(arr1[mid]>user)
			{
				return search(arr1, low, mid, user);
			}
			else if(arr1[mid]<user)
			{
				return search(arr1, mid+1, high, user);
			}
		}
		return -1;
	}

	public static void main(String[] args) 
	{
		
		int [] arr= {10,20,30,40,50,60,70,80,90,100};
		BinarySearch search=new BinarySearch();
		System.out.println("That index are"+search.search(arr, 0, arr.length, 100));
		
	}

}
