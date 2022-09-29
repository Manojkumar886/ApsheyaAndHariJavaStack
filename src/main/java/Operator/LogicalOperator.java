package Operator;

public class LogicalOperator {

	public static void main(String[] args) 
	{
		float age=21.9f;
		float CGPA=88.6f;
		System.out.println(age<CGPA&&CGPA!=age);
		System.out.println(age!=CGPA||CGPA==age);
		System.out.println(!(age>CGPA));
	}
}
