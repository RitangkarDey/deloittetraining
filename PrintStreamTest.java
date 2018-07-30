package iodemos;
import java.io.*;

public class PrintStreamTest {

	public static void main(String[] args)throws IOException
	{	
		FileOutputStream fout=new FileOutputStream("mfile.txt");
		PrintStream pout=new PrintStream(fout);//Writes on file
		//PrintStream pout=new PrintStream(System.out);//Print on console
		pout.println(1900);
		pout.println("Hello Java");
		pout.println("Welcome to java");
		pout.close();
	}

}
