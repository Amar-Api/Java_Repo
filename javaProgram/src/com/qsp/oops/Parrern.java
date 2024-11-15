package com.qsp.oops;

public class Parrern
{
public static void main(String[] args)
{
	int n=5;
	for(int i=1;i<=n;i++)
	{
		for(int j=2*(n-i);j>i;j--)
		{
			System.out.println("");
		}
		for(int j=1;j<=i;j++)
		{
			System.out.print(j);
		}
	System.out.println();
	}
}
}
