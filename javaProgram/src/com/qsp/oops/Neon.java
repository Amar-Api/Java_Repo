package com.qsp.oops; 
import java.util.Scanner;

public class Neon 
{
public static void main(String[] args) 
	{
		Scanner s= new Scanner (System.in); 	
    System.out.println("Enter the number:");
    int n=s.nextInt();
    Neon.isNeon(n);
	}
	
	public static void isNeon(int n)
	{
	int sum=0;
    int sq=n*n;
	while(sq>0)
	{
	int rem=sq%10;
	sum=sum+rem;
	sq= sq/10;
	}
	if(n==sum)
	System.out.println(" neon");
	else 
	System.out.println("not neon");

	}
	}
	

