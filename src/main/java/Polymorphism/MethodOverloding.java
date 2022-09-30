package Polymorphism;

//Method OverLoading-CompileTime Polymorphism
//Same Class-ONe class
//Same method Name
//Different Arguments or parameters
import java.lang.reflect.Method;

public class MethodOverloding 
{
	public void Operator(int a,float b)
	{
		int c=10;
		System.out.println(c+": c value ");//23 - c value
	}
	public void Operator(String name)
	{
		System.out.println("My name is declared by String Dtatype");
	}
	public void Operator(double age)
	{
		System.out.println("my age is declared by double datatype");
	}
	public void Operator()
	{
		System.out.println("Empty Process");
	}
	public static void main(String[] args) 
	{
		MethodOverloding obj=new MethodOverloding();
		obj.Operator(34, 23.6f);
		obj.Operator("Haripriya");
		obj.Operator(21.11);
		obj.Operator();
	}

}
