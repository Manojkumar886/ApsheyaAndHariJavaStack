package Polymorphism;

public class MethodOverRidingAccess extends MethodOverRiding 
{
	public void connection()
	{
		System.out.println("Different class to access the method overriding");
	}
	public static void main(String[] args) 
	{
		MethodOverRidingAccess obj=new MethodOverRidingAccess();
		obj.connection();
		MethodOverRiding obj1=new MethodOverRiding();
		obj1.Connection();
		//Upcasting-Obj is created by child class but connect with the parent class constructor
		MethodOverRiding obj2=new MethodOverRidingAccess();
		obj2.Connection();
	}

}
