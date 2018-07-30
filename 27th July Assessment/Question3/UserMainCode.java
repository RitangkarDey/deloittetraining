package deloitteAssignment;

public class UserMainCode 
{
	public static boolean checkTripplets(int array[])
	{
		int c=0;
		boolean a=false;
		for(int i=0;i<array.length-2;i++)
		{
		if(array[i]==array[i+1] && array[i]==array[i+2])
		c++;	
		}
		if(c>0)
		a=true;
		else
			a=false;
		return a;
		
	}
	
}
