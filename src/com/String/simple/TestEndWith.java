package com.String.simple;

public class TestEndWith {

	
	public static void main(String arg[]){
		String str = "Welcome to Javatpoint.com";  
        
		System.out.println(str.endsWith("point"));  
        if(str.endsWith(".com")) {  
            System.out.println("String ends with .com");  
        }else System.out.println("It does not end with .com"); 		
		
		  
	}
}
