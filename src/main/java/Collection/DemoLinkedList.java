package Collection;

import java.util.LinkedList;

public class DemoLinkedList {

	public static void main(String[] args) 
	{
		LinkedList list1=new LinkedList();//generic
		list1.add("Apsheya");
		list1.add(98765434563l);
		list1.add(6.7f);
		list1.add(true);
		 
		list1.addFirst("Manojkumar");
		list1.add(5, "Haripriya");
		System.out.println(list1);
		//list.remove(4)//index to remove
		//list1.remove(98765434563l);
		System.out.println(list1);
		System.out.println(list1.get(4));//get a index number-using index number
		list1.set(0, "Manoj");//set is update a value
		System.out.println(list1);
		System.out.println(list1.indexOf(6.7f));//index pf get a index value
		
//		list1.clear();
//		System.out.println(list1);
		
//		LinkedList<Integer> list=new LinkedList<Integer>();//non generic
//		list.add(87654);
		
		
	}

}
