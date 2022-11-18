package Files;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class DemoWriting {

	public static void main(String[] args) throws IOException 
	{
		File obj=new File("E:\\EveBatch-ApsheyaHari\\FileEve.txt");
//		obj.createNewFile();
//		System.out.println(obj.getName());
		
		FileOutputStream fos=new FileOutputStream(obj);
		Scanner scan=new Scanner(System.in);
		System.out.println("please tell as your content added in inside the file");
		String content=scan.nextLine();
		
		fos.write(content.getBytes());
		System.out.println(obj.getName()+" content is added successfully");
		
		fos.close();
		scan.close();
		
	}

}
