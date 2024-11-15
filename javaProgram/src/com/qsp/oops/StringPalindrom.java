package com.qsp.oops;

public class StringPalindrom 
{

	public static void main(String[] args) 
	{
String sc="malayala";
String rs="";
for(int i=sc.length()-1;i>=0;i--)
{
	rs=rs+sc.charAt(i);
}
	if(sc.equals(rs))
		System.out.println("p");
	else 
			System.out.println("np");
		
	}
}
	


