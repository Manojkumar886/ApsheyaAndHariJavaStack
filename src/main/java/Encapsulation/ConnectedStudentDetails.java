package Encapsulation;

public class ConnectedStudentDetails extends StudentDetails
{
	public static void main(String[] args)
	{
		ConnectedStudentDetails connect=new ConnectedStudentDetails();
		connect.setName("Apsheya");
		connect.setAge(22);
		connect.setDepartment("B.Tech");
		System.out.println(connect.getName());
		System.out.println(connect.getAge());
		System.out.println(connect.getDepartment());
	}
}
