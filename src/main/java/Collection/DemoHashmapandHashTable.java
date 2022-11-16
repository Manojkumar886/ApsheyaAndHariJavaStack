package Collection;

import java.util.HashMap;
import java.util.Hashtable;

public class DemoHashmapandHashTable {
//hashtable-desending and duplicates cannot accessed...
//hashMap-its worked is ordered and duplicates values cannot be used
	public static void main(String[] args) 
	{
		Hashtable<Integer, String> hashtable=new Hashtable<Integer, String>();
		hashtable.put(4, "Manojkumar");
		hashtable.put(2, "Apsheya");
		hashtable.put(3, "Haripriya");
		hashtable.put(2, "Swathy");
		System.out.println(hashtable);
		HashMap<Integer, String> hashmap=new HashMap<Integer, String>();
		hashmap.put(100, "Manoj");
		hashmap.put(102, "Pavi");
		hashmap.put(103, "Pavi");
		hashmap.put(101, "Hari");
		System.out.println(hashmap);
	}

}
