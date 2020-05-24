package com.String.simple;

public class TestGetCharactor {

	public static void main(String[] args) {  
	 String str = new String("Welcome to Javatpoint");  
     char[] ch  = new char[21];  
     try {  
         str.getChars(0, 21, ch, 0);  
         System.out.println(ch);  
     } catch (Exception e) {  
         System.out.println(e);  
     }
     }
}
