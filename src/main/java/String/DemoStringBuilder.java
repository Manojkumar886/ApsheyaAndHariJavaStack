package String;

public class DemoStringBuilder {

	public static void main(String[] args)
	{
		StringBuilder obj=new StringBuilder();
		obj.append("Apsheya");
		System.out.println(obj);
		obj.delete(1, 4);
		System.out.println("Delted values  - "+obj);
	}

}
