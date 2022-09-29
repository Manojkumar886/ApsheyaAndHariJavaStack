package Interface;

public class Animal implements Dog,Cat
{

	public static void main(String[] args) 
	{
		Animal obj=new Animal();
		obj.bark();
		obj.eat();
	}

	public void eat() {
		// TODO Auto-generated method stub
		System.out.println("Milk");
	}

	public void bark() {
		// TODO Auto-generated method stub
		System.out.println("one of the habit");
	}

}
