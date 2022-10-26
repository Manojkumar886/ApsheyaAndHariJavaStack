package Exception;

import java.io.IOException;

public class CommpileTimeException
{
	public static void main(String[] args) throws IOException, InterruptedException
	{
		//Runtime run=new Runtime()---
		
		Runtime run=Runtime.getRuntime();
		Process pro;
		
		pro=run.exec("notepad");//ioexeception
		
		Thread.sleep(5000);//interruptedException
		
		pro=run.exec("calc");
		
		
	}

}
