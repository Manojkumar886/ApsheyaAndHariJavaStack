package String;

import java.util.Arrays;

public class DemoStringClass {

	public static void main(String[] args) 
	{
//		String a="Ashok";
//		System.out.println(a);
//		String obj=new String("Ashok");//create an object of string
//		char a1[]= {'A','S','H','O','K'};
//		System.out.println(Arrays.toString(a1));
//		String name=new String(a1);
		String name="Java";//54
		String name1="java is object oriended programming languages";
		String name2="java";//54
		System.out.println(name);
		System.out.println(name.charAt(2));
		System.out.println(name.concat(name1));
		System.out.println(name.equals(name2));
		System.out.println(name.equalsIgnoreCase(name2));
		System.out.println(name.compareTo(name2));
		System.out.println(name.compareToIgnoreCase(name2));
		System.out.println(name.compareTo(name2)==0);
		System.out.println(name1.startsWith("orien"));
		System.out.println(name1.endsWith("g"));
		//System.out.println(name1.replaceFirst("java", "c"));
		String replace=name1.replace("java", "c++");
		System.out.println(replace);
		System.out.println(name1.substring(15));
		System.out.println(name1.substring(0, 14));
		System.out.println(name1.contains("programming"));
		System.out.println(name1);
		System.out.println(name1.trim());
		String [] result=name1.split(" ");
		for(String str:result)
		{
			System.out.print(str+",");
		}

		
		
		
	}

}
