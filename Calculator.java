package overloading;

import java.util.Scanner;

public class Calculator 
{
	public int add(int a,int b)
	{
		int sum=a+b;
		return sum;
	}
	public double add(double a,double b)
	{
		double sum=a+b;
		return sum;
	}
	public double add(int a,double b)
	{
		double sum=a+b;
		return sum;
	}
	public double add(double a,int b)
	{
		double sum=a+b;
		return sum;
	}
	
	
	public int diff(int a,int b)
	{
		int diff=a-b;
	return diff;
	}
	public double diff(double a,double b)
	{
		double diff=a-b;
		return diff;
	}
	public double diff(int a,double b)
	{
		double diff=a-b;
		return diff;
	}
	public double diff(double a,int b)
	{
		double diff=a-b;
		return diff;
	}
	
	
	public int mul(int a,int b)
	{
		int mul=a*b;
		return mul;
	}
	public double mul(double a,double b)
	{
		double mul=a*b;
		return mul;
	}
	public double mul(int a,double b)
	{
		double mul=a*b;
		return mul;
	}
	public double mul(double a,int b)
	{
		double mul=a*b;
		return mul;
	}
	
	
	public int div(int a,int b)
	{
		int div=a/b;
		return div;
	}
	public double div(double a,double b)
	{
		double div=a/b;
		return div;
	}
	public double div(int a,double b)
	{
		double div=a/b;
		return div;
	}
	public double div(double a,int b)
	{
		double div=a/b;
		return div;
	}
	public static void main(String[] args) 
	{
		
		Calculator c=new Calculator();
		System.out.println(c.add(4, 5));
		System.out.println(c.add(4.2,4.6));
		System.out.println(c.diff(4.7,3.1));
		System.out.println(c.diff(4, 7.3));
		System.out.println(c.mul(5.6, 4));
		System.out.println(c.mul(3, 4.5));
		System.out.println(c.div(4, 2));
		System.out.println(c.div(3, 6.4));
		

	}

}
