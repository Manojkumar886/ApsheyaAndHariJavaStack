package Array;

import java.util.Arrays;
import java.util.Scanner;

public class UpdatingAnArray {

	public static void main(String[] args) 
	{
		String [] name= {"Manojkumar","Annamalai","Apsheya","Haripriya","Razzak"};
//		System.out.println(name[3]);
		System.out.println("Before updating values");
		System.out.println(Arrays.toString(name));
		
		
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Tell us what is position you have update");
		int pos=scan.nextInt();
		System.out.println("what is updating value");
		String newname=scan.next();
		name[pos]=newname;
		
		System.out.println("After the updating values");
		System.out.println(Arrays.toString(name));

	}

}
