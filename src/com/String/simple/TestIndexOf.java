package com.String.simple;

public class TestIndexOf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s1="this is index of example";  
		//passing substring  
		int index1=s1.indexOf("is");//returns the index of is substring  
		int index2=s1.indexOf("index");//returns the index of index substring  
		System.out.println(index1+"  "+index2);//2 8  
		  
		//passing substring with from index  
		int index3=s1.indexOf("is",4);//returns the index of is substring after 4th index  
		System.out.println(index3);//5 i.e. the index of another is  
		  
		//passing char value  
		int index4=s1.indexOf('s');//returns the index of s char value  
		System.out.println(index4);//3  
		
		  int index5 = s1.indexOf("method", 20); // It returns -1 if substring does not found  
	      System.out.println("index of substring "+index5);  
	      
	      String str = "This is last index of example";
	      int index6 = str.lastIndexOf("of", 25);  
	        System.out.println(index6);  
	        int index7 = str.lastIndexOf("of", 10);  
	        System.out.println(index7); // -1, if not found    
	      
	      
	      
	}

}
