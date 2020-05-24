package com.String.simple;

public class TestSplit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s1 = "java string split method by javatpoint";
		String[] words = s1.split("\\s",3);// splits the string based on
											// whitespace
		// using java foreach loop to print elements of string array
		for (String w : words) {
			System.out.println(w);
		}
		
		
		String str = "Javatpointttm";  
        System.out.println("====Returning words:");  
        String[] arr = str.split("t", 5);  
        
        for (String w : arr) {  
            System.out.println(w);  
        }  
        System.out.println("Split array length: "+arr.length);  
        
        String str1 ="v6";
        System.out.println(""+str1.substring(1, str1.length()));
        
    
	}
}