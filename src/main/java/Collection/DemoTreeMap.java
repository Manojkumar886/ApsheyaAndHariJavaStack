package Collection;

import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

public class DemoTreeMap {

	public static void main(String[] args) 
	{
//		TreeMap<String, Phones> obj=new TreeMap<String, Phones>();
//		Phones mob=new Phones("OnePlus", 2, 67000.0);
//		Phones mob1=new Phones("Oppo", 1, 34000.0);
//		Phones mob2=new Phones("Realme", 3, 17000.0);
//		Phones mob3=new Phones("Apple", 3, 66000.0);
//		obj.put("Apsheya", mob3);
//		obj.put("Haripriya", mob);
//		obj.put("Manoj", mob2);
//		obj.put("Pavithra", mob1);
//	//System.out.println(obj);
//		for(Map.Entry m: obj.entrySet())
//		{
//			System.out.println(m.getKey()+" "+m.getValue());
//		}
		TreeMap<String, Integer> obj=new TreeMap<String, Integer>();
		
		obj.put("Raseedha", 31);
		obj.put("Apsheya", 22);
		obj.put("Haripriya",21);
		obj.put("Pavithra", 24);
		System.out.println(obj);
		
		System.out.println(obj.get("Apsheya"));
	}

}
