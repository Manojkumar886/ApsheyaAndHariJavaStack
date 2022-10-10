package Constructor;

public class ParameterizedConstructor {
	String name;
	float ctc;
	
//	public ParameterizedConstructor(String name,float ctc1)
//	{
//		this.name=name;
//		ctc=ctc1;
//		System.out.println("My name is"+name);
//		System.out.println("My salary is"+ctc);
//	}
	public void Apsheya()
	{
		System.out.println("Apsheya is b.tech student");
	}
	public ParameterizedConstructor()
	{
		System.out.println("Welcome to java class");
	}

	
	public static void main(String[] args) 
	{
		ParameterizedConstructor param=new ParameterizedConstructor();
		param.Apsheya();
		//new ParameterizedConstructor("Kavin", 3.4f);

	}

}
