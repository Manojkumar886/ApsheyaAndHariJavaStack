package Encapsulation;

public class ConnectedStudentDetails 
{
	public static void main(String[] args)
	{
		StudentDetails connect=new StudentDetails("name",45,"Content");
		System.out.println(connect);
		
		connect.setName("Apsheya");
		connect.setAge(22);
		connect.setDepartment("B.Tech");
		System.out.println(connect.getName());
		System.out.println(connect.getAge());
		System.out.println(connect.getDepartment());
	}
}
