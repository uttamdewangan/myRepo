package com.HackerRank.sort;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class BigDecimalSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		
		String s[]=new String[n+2];
		for(int i=0;i<n;i++)
		{
			s[i]=sc.next();
		}
		sc.close();
		Comparator<String> myCustomComparator = new Comparator<String>(){
			public int compare(String s1,String s2){
				BigDecimal a=new BigDecimal(s1);
				BigDecimal b=new BigDecimal(s2);
				return b.compareTo(a);
			}
		};
		
		Arrays.sort(s,0,n,myCustomComparator);
		
		for(int i=0;i<n;i++)
	    {
	        System.out.println(s[i]);
	    }
	}
	
	

}

/*input
 
9 
-100 
50 
0 
56.6 
90 
0.12 
.12 
02.34 
000.000



*/