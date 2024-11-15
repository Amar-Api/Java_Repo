package com.qsp.oops;

import java.util.Iterator;

public class patternCombination 
{
public static void main(String[] args) 
{

	String s="COMBINATION";
	System.out.println(s);
    for (int i = 0; i <11; i++)
    {
		if (i%2==0)
		{
			s= s.substring(0,s.length()-1);
			System.out.println(s);
			System.out.println(s.length());
		}
		else 
		{
			s= s.substring(1,s.length());
			System.out.println(s);
			System.out.println(s.length());
		}
	}
					
			
	

}
}
