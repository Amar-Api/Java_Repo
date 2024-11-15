package com.qsp.oops;
import java.util.Scanner;
public class CheckValue
{
		int a;
		int b;
		public static void main(String[] args)
		{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter first value");
		int a=s.nextInt();
		System.out.println("Enter second value");
		int b=s.nextInt();
		if(a==b)
		{
		System.out.println("Both the number are same");
		}
		else if(a<b)
		{
		System.out.println("Number between a and b is:");
		for(int i=a+1;i<=b-1;i++)
		System.out.println(i);
		}
		else 
		System.out.println("First value is greater than second");
		}
		}

	


