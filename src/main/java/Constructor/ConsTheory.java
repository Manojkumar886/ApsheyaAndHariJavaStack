package Constructor;


//constructor:
//------------
//special method.initialize an object.more then constructor used in class
//
//three rules:
//------------
//method(constructor) name same as class name.
//cannot be used return type;
//
//
//2 type of constructor used in java.
//-----------------------------------
//1.default constructor.
//public class defcons 
//{
//	String name;
//	int Salary;
//	public defcons()//default constructor
//	{
//		System.out.println("kaleem");
//		System.out.println("employee name is "+name);
//		System.out.println("employee salary is"+Salary);
//	}
//	static int c=10;//static variable
//	public void task()
//	{
//		String name="MAnojkumar";//local variable
//		System.out.println(name);
//	}
//	
//	public static void main(String[] args) 
//	{
//		System.out.println("i am manoj");
//		defcons obj=new defcons();
//		obj.task();
//		int a=10;//global or instance variable
//		System.out.println(a);
//		
//	}
//
//}
//
//
//2.Parameterized constructor(arguments)
//Example:
//public class paracons 
//{
//	long mobileno;
//	double salary;
//	String name;
//	public paracons(long phoneno,double incentive,String nick)
//	{
//		mobileno=phoneno;
//		salary=incentive;
//		name=nick;
//		System.out.println("What is your mobile no:"+ phoneno+" what is your name: "+nick+" wht is your salary: "+incentive);
//		
//	}
//	
//	public static void main(String[] args) 
//	{
//		//paracons obj=new paracons(9789355930l, 9, "manojkumar");
//		new paracons(2367324683345l, 23.3,"Kaleem");
//	}
//
//}
