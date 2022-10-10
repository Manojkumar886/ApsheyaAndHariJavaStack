package Encapsulation;

public class StudentDetails 
{ 
	private String name;
	private int age;
	private String department;
	
	@Override
	public String toString() {
		return "StudentDetails [name=" + name + ", age=" + age + ", department=" + department + "]";
	}
	public StudentDetails() {//Def-COnstructor
		super();
		// TODO Auto-generated constructor stub
	}
	public StudentDetails(String name1, int age, String department) {//Para-COnstructor
		super();
		name = name1;
		this.age = age;
		this.department = department;
	}
	public String getName()
	{
		return name;
	}
	public void setName(String name)
	{
		this.name=name;
	}
	public int getAge()
	{
		return age;
		
	}
	public void setAge(int age)
	{
		this.age=age;
	}
	public String getDepartment()
	{
		return department;
	}
	public void setDepartment(String department)
	{
		this.department=department;
	}

}
