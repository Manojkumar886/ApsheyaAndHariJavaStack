package Inheritance;

public class Birds extends Peacock
{
	public void sound()
	{
		System.out.println("birds sound is different");
	}
	public static void main(String[] args)
	{
		Birds obj=new Birds();
		obj.sound();
		obj.eat();
		obj.peek();
		
	}
}
