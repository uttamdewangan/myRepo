package com.String;

import java.util.Scanner;

public class StringTocken {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 Scanner scan = new Scanner(System.in);
	        String s = scan.nextLine();
	        // Write your code here.
	        s=s.trim();
	        if(s.length()==0)
            {
                System.out.println(0);
                return;
            }
	        String[] words=s.split("[^a-zA-Z]+");
	        System.out.println(words.length);
	        for(String word:words)
	        {
	        	System.out.println(word);
	        }
	     
	        scan.close();

	}

}
