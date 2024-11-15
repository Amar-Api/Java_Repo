package com.qsp.oops;

public class HashCodeEmp
{
		String name;

public HashCodeEmp(String name) 
{
	super();
	this.name = name;
}

@Override
public String toString() 
{
	return "HashCodeEmp [name=" + name + "]";
}

public static void main(String[] args) 
{
	HashCodeEmp e = new HashCodeEmp("Sam");
	HashCodeEmp f = new HashCodeEmp("Sam");
	HashCodeEmp g=e;
	System.out.println(e.hashCode());
	System.out.println(e.hashCode());
	System.out.println(e.hashCode());
	System.out.println(f.hashCode());
	System.out.println(f.hashCode());
     System.out.println(e.equals(f));
     System.out.println(e.equals(e));
     
}
}