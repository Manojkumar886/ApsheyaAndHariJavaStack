package Collection;

import java.util.ArrayList;
import java.util.Vector;

public class DemoArrayListandVector {

	public static void main(String[] args)
	{
		ArrayList list=new ArrayList();
		list.add("Manojkumar");
		list.add(22);
		list.add(7654567876543l);
		list.add(true);
		list.add("swathy");
		System.out.println("Array values"+list);
		Vector list1=new Vector();
		list1.addAll(list);//
		list1.add("Apsheya");
		list1.add("Haripriya");
		list1.add(1, "Vaishali");
		System.out.println("Vector values"+list1);
//		list1.removeAll(list);//only removed same value
//		System.out.println("vector values"+list1);
		list1.add("Swathy");
		list1.retainAll(list);//only removed duplicates values
		System.out.println("Array values"+list);
	}

}
