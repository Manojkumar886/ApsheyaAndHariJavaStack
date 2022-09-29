package Constructor;

public class DefConstructor 
{
	int age;
	String name;
	public void DefConstructor()//Def-Constructor
	{
		System.out.println("My age is"+age);
		System.out.println("My name is"+name);
		System.out.println("Welcome to Def-Constructor");
	}
	
	public void door()
	{
		System.out.println("Door");
	}

	public static void main(String[] args) 
	{
	
		DefConstructor def=new DefConstructor();//Object Creation
		def.door();
		
	
	}

}
