package MultiThreading;

public class Synchronized {

	public static void main(String[] args) throws InterruptedException 
	{
		connect obj=new connect();
		Thread th=new Thread()
				{
					public void run()
					{
						try {
							obj.Screenable(5);
						} catch (InterruptedException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
					}
				};
				
		Thread th1=new Thread()
				{
					public void run()
					{
						try {
							obj.Screenable(7);
						} catch (InterruptedException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
					}
				};
				th.start();
				th1.start();
	}

}


class connect 
{
	synchronized void Screenable(int add) throws InterruptedException
	{
		for(int i=1;i<=10;i++)
		{
			System.out.println(add*i);
			Thread.sleep(1000);
		}
	}
}