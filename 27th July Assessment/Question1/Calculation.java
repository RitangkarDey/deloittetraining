package deloitteAssignment;

import java.util.Scanner;

public class Calculation {

	public static void main(String[] args)
	{
		Arithmetic ref1 = new Addition();
		Arithmetic ref2 = new Subtraction();
		Arithmetic ref3 = new Multiplication();
		Arithmetic ref4 = new Division();

		Arithmetic[] ref = {ref1, ref2, ref3, ref4};
		int ch;	
		System.out.println("1.Addition \n2.Subtraction \n3.Multiplication \n4.Division \nEnter your choice: ");
		Scanner scanner = new Scanner(System.in);
		try {
			ch = scanner.nextInt();
			System.out.println("Enter two numers: ");//takes user input
			int num1=scanner.nextInt();
			int num2=scanner.nextInt();
			System.out.println("Result is: " + ref[ch-1].calculate(num1, num2));//calls the calculate function
			scanner.close();
		} catch (Exception e) {
			System.out.println("WARNING: Enter integers only!");
			e.printStackTrace();
		}
	}
}


