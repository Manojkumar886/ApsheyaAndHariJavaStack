package Collection;

import java.util.Stack;

public class DemoStackClass {

	public static void main(String[] args) 
	{
		//Last in First out-LIFO....
		Stack<String> obj=new Stack<String>();//non-generic
		obj.push("Manojkumar");
		obj.push("Apsheya");
		obj.push("Haripriya");
		obj.push("annamalai");
		System.out.println(obj);
		obj.pop();
		System.out.println(obj);//last element only deleted
		System.out.println(obj.empty());//true-false
		System.out.println(obj.peek());
		System.out.println(obj.search("Apsheya"));
	}

}
