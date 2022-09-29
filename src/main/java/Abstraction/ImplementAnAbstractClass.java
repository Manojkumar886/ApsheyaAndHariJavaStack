package Abstraction;

public class ImplementAnAbstractClass extends AbstractClass
{
	public static void main(String[] args)
	{
		ImplementAnAbstractClass obj=new ImplementAnAbstractClass();
		obj.access();
		obj.implementation();
		obj.imple();		
	}

	public void implementation() {
		System.out.println("This method is a no implementation of abstract class");
		
	}
	public void access()
	{
		System.out.println("Access the Abstract Method");
	}

}
