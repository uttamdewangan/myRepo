package com.String.simple;

public class TestValueOf {

	public static void main(String args[]) {
		int value = 30;
		boolean bol = true;
		boolean bol2 = false;
		char ch1 = 'A';    
        char ch2 = 'B'; 
        float f  = 10.05f;    
        double d = 10.02; 
		String s1 = String.valueOf(value);
		System.out.println(s1 + 10);// concatenating string with 10
		
		String s2 = String.valueOf(bol);    
        String s3 = String.valueOf(bol2);  
        System.out.println(s2);  
        System.out.println(s3);
        
        String s4 = String.valueOf(ch1);    
        String s5 = String.valueOf(ch2);  
        System.out.println(s4);  
        System.out.println(s5); 
        
        String s6 = String.valueOf(f);    
        String s7 = String.valueOf(d);  
        System.out.println(s6);  
        System.out.println(s7); 
	}

}
