package com.qsp.oops;
import java.util.Scanner;
public class DigitSum 	
		{
		public static void main(String[] args) 
		{
			Scanner s=new Scanner(System.in);
		    System.out.println("enter the value of n :");
		int n=s.nextInt();
			isSum(n);
		}
		 public static void isSum(int n)
		 {
			 int rem,sum=0;
			 while(n>0)
			 {
				 n=sum;
				int cd=DigitSum.countDigit(n);		
				 for(int i=cd;i>=2;i--)
						 {
							 rem=n%10;
							 sum=sum+rem;
							 n=n/10;
						 }
			 System.out.println(sum);
			 }
		 }
		 public static int countDigit(int n)
		 {
			 int count=0;
			 while(n>0)
			 {
				 int rem=n%10;
				 count++;
				 n=n/10;
				 
			 }
		 return count;
		 }
		 }
