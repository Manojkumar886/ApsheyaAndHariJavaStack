package MultiThreading;

public class PurposeOfThread 
{
	public static void main(String[] args) //Main one of the thread
	{
		Book book=new Book();////note class is converted by thread
		Note note=new Note();
		book.start();//it will check by run method
		
		Thread obj=new Thread(note);
		obj.start();
		
		System.out.println("Thank you");
		
	}
	

}

class Book extends Thread
{
	public void run()
	{
	for(int i=0;i<=5;i++)
	{
		System.out.println("Welocme to Thread Concept");
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	}
	
}
class Note implements Runnable
{
	public void run()
	{
		for(int i=0;i<=5;i++)
		{
			System.out.println("my numbers is"+i);
			try {
				Thread.sleep(4000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

	public void start() {
		// TODO Auto-generated method stub
		
	}
	
}