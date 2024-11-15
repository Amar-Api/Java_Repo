package com.qsp.oops;

public class Pattern3 
{
	public static void main(String[] args)
	{
		int n=5,st=1;
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=n-i;j++)
			{
				System.out.printf(" ");
			}
			for(int k=1;k<=st;k++)
			{
				System.out.printf(k+"" );
		
			}
		    st+=2; 
			System.out.println();
		}
	}
}
