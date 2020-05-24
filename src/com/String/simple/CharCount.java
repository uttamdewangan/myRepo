package com.String.simple;

import java.util.HashMap;
import java.util.Map;

public class CharCount {

	

		static final int NO_OF_CHARS = 256; 
	       
	    /* Print duplicates present in the passed string */
	    static void printDistinct(String str) 
	    { 
	        // Create an array of size 256 and count of 
	        // every character in it 
	        int[] count = new int[NO_OF_CHARS]; 
	       
	        /* Count array with frequency of characters */
	        int i; 
	        for (i = 0; i < str.length(); i++) 
	            if(str.charAt(i)!=' ') 
	                count[(int)str.charAt(i)]++; 
	        int n = i; 
	       
	        // Print characters having count more than 0 
	        for (i = 0; i < n; i++) 
	            if (count[(int)str.charAt(i)] == 1) 
	                System.out.print(str.charAt(i)); 
	    }
	    /*static void fun1(String strString)
	    {
	    	char[] arr=new char[strString.length()];
	    	arr=strString.toCharArray();
	    	Map<char,Integer> map=new HashMap<String,Integer>();
	    	
	    	for(int i=0;i<strString.length();i++)
	    	{
	    		//char check=arr[i];
	    		if(map.containKey(arr[i]))
	    		{
	    			
	    		}
	    		map.put(arr[i],count);
	    	}
	    	
	    }*/
	       
	    /* Driver program*/
	    public static void main(String args[]) 
	    { 
	        String str = "GeeksforGeeksk"; 
	        printDistinct(str); 
	        //fun1(str);
	    } 
	

}
