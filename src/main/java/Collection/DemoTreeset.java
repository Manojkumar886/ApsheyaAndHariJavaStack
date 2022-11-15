package Collection;

import java.util.Iterator;
import java.util.TreeSet;

public class DemoTreeset {

	public static void main(String[] args) 
	{
		TreeSet<Phones> Poorvika=new TreeSet<Phones>();
		Poorvika.add(new Phones("Realme1", 4, 18000.0));
		Poorvika.add(new Phones("Oppo", 2, 54000.0));
		Poorvika.add(new Phones("Samsung", 1, 48000.0));
		Poorvika.add(new Phones("Vivo", 8, 28000.0));
		Phones obj=new Phones("OnePlus", 2, 67000.0);
		Poorvika.add(obj);
//		System.out.println(Poorvika);
		Iterator it=Poorvika.iterator();
	//	classname obj=myobj.methods();
		
		while(it.hasNext())//boolean-true/false
		{
			System.out.println(it.next());
		}
	}
}
class Phones implements Comparable<Phones>
{
	String mobilename;
	Integer ram;
	Double price;
	public Phones(String mobilename, Integer ram, Double price) {
		super();
		this.mobilename = mobilename;
		this.ram = ram;
		this.price = price;
	}
	public Phones() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Phones [mobilename=" + mobilename + ", ram=" + ram + ", price=" + price + "]";
	}
	@Override
	public int compareTo(Phones o) {
		// TODO Auto-generated method stub
		//return this.price.compareTo(o.price);
		return o.ram.compareTo(this.ram);
	}
	
}