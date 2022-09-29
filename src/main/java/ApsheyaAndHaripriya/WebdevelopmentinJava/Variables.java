package ApsheyaAndHaripriya.WebdevelopmentinJava;

public class Variables 
{
	static String name="Manojkumar";//Static variable
	
	int a=10;
	int b=100;
	public void task()
	{
		System.out.println(a+b);//Global Variables
		char class1='A';///local variable
		System.out.println(class1);
	}
	
	public static void main(String[] args) 
	{
		int a=10;//global or instance avriable
		System.out.println("a value is "+a);
		Variables obj=new Variables();//Object creation
	
		System.out.println("my static name is "+name);
		obj.task();
	}

}
