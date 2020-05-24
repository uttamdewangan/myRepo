package com.String.simple;

import java.util.Scanner;

public class ReverseString {
	
	 public static void fun1(String str)
     {
     	String B=new StringBuilder(str).reverse().toString();
	        if(str.equals(B))
	        {
	        	System.out.println("Yes");
	        }
	        else{
	        	System.out.println("No");
	        }
     }
	 
	 public static void fun2(String str1)
     {
		int strlenght=str1.length();
		String reverseString="";
     	for(int i=strlenght-1; i>=0;i--)
     	{
     		reverseString=reverseString+str1.charAt(i);
     	}
     	System.out.println("reverse String : "+reverseString);
     }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		    Scanner sc=new Scanner(System.in);
	        String A=sc.next();
	        
	        fun1(A);
	        fun2(A);
	        /* Enter your code here. Print output to STDOUT. */
	       
	       
	        
	        
	        
	      
	       
	        
	        
	    }
	}


