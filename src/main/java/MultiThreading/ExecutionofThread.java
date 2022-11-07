package MultiThreading;

import java.util.Arrays;

public class ExecutionofThread {

	public static void main(String[] args) throws InterruptedException 
	{
		Binary by=new Binary();
		//thread th1=new Thread(obj,resourcename);
		Thread th1=new Thread(by,"Apsheya");
		Thread th2=new Thread(by,"Haripriya");
		Thread th3=new Thread(by,"Manojkumar");
		th2.setPriority(10);
		
		th2.start();
		Thread.sleep(5000);
		th1.start();
		th3.start();
		
	}

}

class Binary implements Runnable 
{
	
	public void run() 
	{
		System.out.println(Thread.currentThread().getName());
		System.out.println(Thread.currentThread().getPriority());//deafult-5
		System.out.println(Thread.currentThread().getId());
		Listing();
		linearsearch(arr, 53);
	}
	private int[] arr= {12,45,65,78,53,413,23,234,56,23};
	
	
	public void Listing()
	{
		System.out.println(Arrays.toString(arr));
	}
	
	public int linearsearch(int[] arr1,int key)
	{
		for(int pos=0;pos<arr1.length;pos++)
		{
			if(arr1[pos]==key)
			{
				return pos;
			}
		}
		return -1;
	}
}