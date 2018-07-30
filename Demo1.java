package iodemos;

import java.io.*;

public class Demo1 
{
	public static void main(String[] args)throws IOException 
	{
		File f=new File("a.txt");
		RandomAccessFile ra=new RandomAccessFile(f, "rw");
		ra.seek(ra.length());//To start a new line and not overwrite
		ra.writeUTF("hello how are you");
		ra.seek(0);
		System.out.println("The content is :");
		try 
		{
			do {
				String n=ra.readUTF();
				System.out.println(n);				
				} 
			while(true);
		}
		catch(Exception e)
		{
			
		}
		ra.close();
	}
}
