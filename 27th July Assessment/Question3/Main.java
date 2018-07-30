package deloitteAssignment;

import java.util.*;

public class Main 
{

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int count=sc.nextInt();
		if(count<3)
		{
			System.out.println("You need to enter min 3 numbers");
		}
		int array[]=new int[count];
		
		for(int j=0;j<count;j++)
		{
		array[j]=sc.nextInt();	
		
		}
		System.out.println(UserMainCode.checkTripplets(array));
		sc.close();
		
	}

}
