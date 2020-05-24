package com.String;

import java.util.Scanner;
import java.util.SortedSet;
import java.util.TreeSet;

public class SubStringHacker16 {
	
	public static String getSmallestAndLargest(String s, int k) {
        String smallest = "";
        String largest = "";
        
       // String min = null, max = null;
        //SortedSet<String> s1=new TreeSet<String>();
        for(int i=0;i<=s.length()-k;i++)
        {
        	//s1.add((s.substring(i,i+k)));
        
        	 String sub = s.substring(i, i+k);
        		System.out.println("**"+sub);
             if (smallest == "" || smallest.compareTo(sub) > 0){
            	 smallest = sub;
             }
             if (largest == "" || largest.compareTo(sub) < 0){
            	 largest = sub;

        	        	
        }
       
        
    }
        return smallest + "\n" + largest;
	}


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        int k = scan.nextInt();
        scan.close();
      
        System.out.println(getSmallestAndLargest(s, k));
    }

}

//welcometojava
//3
