package Files;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class DemoReading {

	public static void main(String[] args) throws IOException 
	{
		File obj=new File("E:\\EveBatch-ApsheyaHari\\FileEve.txt");
		FileInputStream fis=new FileInputStream(obj);
		
		int size=fis.available();//
		
		byte[] tmp=new byte[size];
		fis.read(tmp);
		
		String data=new String(tmp);
		
		System.out.println(data+" \n in this content available in my file"+obj.getAbsolutePath());
		fis.close();
		
		
	}

}
