package com.String.simple;

public class TestCharAt {
	
	
	private static void testIndex(String str)
	{	
		 
		char ch=str.charAt(4);//returns the char value at the 4th index  
		System.out.println(ch);  
		System.out.println("Character at 0 index is: "+ str.charAt(0));      
		System.out.println("Character at last index is: "+ str.charAt(str.length()-1));      
		
	}
	
	private static int getCharCount(String str,char ch)
	{		
		int count=0;
		for(int i=0;i<=str.length()-1;i++)
		{
			if(str.charAt(i)==ch)
				count=count+1;
		}
		return count;     
		
	}

	public static void main(String args[]){ 
		
		String str="Welcome to Javatpoint portal"; 
		testIndex(str);
		int count=getCharCount(str, 'a');
		System.out.println("no of charactor "+count);
		
		}
}
