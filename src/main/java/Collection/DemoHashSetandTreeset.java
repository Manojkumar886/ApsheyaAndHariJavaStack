package Collection;

import java.util.HashSet;
import java.util.TreeSet;

public class DemoHashSetandTreeset 
{
	public static void main(String[] args) {
		HashSet< Double> obj=new HashSet<Double>();
		obj.add(67.8);
		obj.add(99.9);
		obj.add(14.3);
		obj.add(15.5);
		obj.add(678.8);
		obj.add(99.9);//duplicate values is allowed in compile time but executed a runtime time
		System.out.println(obj);
		TreeSet<Double> obj1=new TreeSet<Double>();
		obj1.addAll(obj);
		obj1.add(55.5);
		System.out.println(obj1);
	}

}
