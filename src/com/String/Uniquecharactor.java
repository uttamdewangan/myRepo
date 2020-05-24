package com.String;

public class Uniquecharactor {
	
	
	public static void uniqueCharacters(String test){
	    String temp = "";
	    for (int i = 0; i < test.length(); i++){
	        char current = test.charAt(i);
	        if (temp.indexOf(current) < 0){
	            temp = temp + current;
	        } else {
	            temp = temp.replace(String.valueOf(current), "");
	        }
	    }

	    System.out.println(temp + " "); 
	    

	}
	
	
	
	public static void tetsUniquechar(String test){
	    String temp = "";
	    for (int i = 0; i < test.length(); i++){
	        char current = test.charAt(i);
	        
	        System.out.println("**"+temp.indexOf(current));
	        if (temp.indexOf(current) < 0){
	            temp = temp + current;
	        } else {
	            temp = temp.replace(String.valueOf(current), "");
	        }
	    }

	    System.out.println(temp + " "); 
	    

	}
	
	public static void testString(String str)
	{
		String temp="";
		for(int i=0;i<str.length();i++){
			char temp1=str.charAt(i);
			
			
			if(temp.indexOf(temp1)<0)
			{
				temp=temp+temp1;
			}else
			{
				temp=temp.replace(String.valueOf(temp1),"");
			}
			
		}
		System.out.println("=="+temp);
	}
	
	public static void main(String str[])
	{
		uniqueCharacters("yalalmam");
		//tetsUniquechar("nreena");
		//testString("malayalam");
	}

}
