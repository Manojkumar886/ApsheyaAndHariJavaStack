package Constructor;

public class ParameterizedConstructor {
	String name;
	float ctc;
	
	public ParameterizedConstructor(String name1,float ctc1)
	{
		name=name1;
		ctc=ctc1;
		System.out.println("My name is"+name);
		System.out.println("My salary is"+ctc);
	}

	
	public static void main(String[] args) 
	{
		ParameterizedConstructor para=new ParameterizedConstructor("Manoj",3.2f);
		//new ParameterizedConstructor("Kavin", 3.4f);

	}

}
