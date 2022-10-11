package String;

public class Immutable 
{
	 public static void main(String args[])
	 {  
		   String s="Sachin"; 
		   System.out.println(s.concat("Tendulkar"));
		   System.out.println(s);
//		   s=s.concat("tendulkar");
//		   System.out.println(s);
//		  s=s.concat("Manoj");
		 // System.out.println(s.concat(" Tendulkar"));//concat() method appends the string at the end  
		 //  System.out.println(s);//will print Sachin because strings are immutable objects  
	 }  
}
