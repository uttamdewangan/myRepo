package com.String;

import java.util.Scanner;

public class testArray {

	
	// you can also use imports, for example:



	// you can write to stdout for debugging purposes, e.g.
	// System.out.println("this is a debug message");

	
	    public static int solution(int[] A) {
	        // write your code in Java SE 8
	      
	      java.util.Arrays.sort(A); 
	      for(int j=0;j<9;j++)
	        {
	             System.out.println("==="+A[j]);
	        }
	      
	        return 1;
	    }
	    
	    public static void main(String arg[])
	    {
	        Scanner scan=new Scanner(System.in);
	        int n=scan.nextInt();
	        int num[]=new int[n];
	        for(int i=0;i<n;i++)
	        {
	            num[i]=scan.nextInt();
	        }
	        
	        
	       /* for(int j=1;j<=n;j++)
	        {
	             System.out.println("==="+num[j]);
	        }*/
	        
	       int max= solution(num);
	        
	        /*int num[]=new int[-6, -91, 1011, -100, 84, -22, 0, 1, 473];
	         for(int j=1;j<=9;j++)
	        {
	             System.out.println("==="+num[j]);
	        }*/
	        
	    }
	    
	}

