package iodemos;
import java.util.*;
import java.io.*;
public class Demo {

	public static void main(String[] args) throws IOException
	{
		InputStream stream=new FileInputStream("c:\\Assign\\config.properties");
		Properties properties=new Properties();
		properties.load(stream);
		String username=properties.getProperty("username");
		String password=properties.getProperty("password");
		System.out.println("Username :"+username);
		System.out.println("Password :"+password);
		stream.close();

	}

}
