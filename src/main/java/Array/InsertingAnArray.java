package Array;
import java.util.*;

public class InsertingAnArray {

	public static void main(String[] args) 
	{
	
		String [] name=new String[10];
//		name[1]="Apsheya";
//		name[5]="Hari";
//		
//		System.out.println(Arrays.toString(name));
		
		Scanner scan=new Scanner(System.in);
		for(int i=0;i<name.length;i+=2)
		{
			System.out.println("What is your name");
			name[i]=scan.nextLine();
		}
		
		for(String name1:name)
		{
			System.out.println(name1);
		}
		
	}

}
