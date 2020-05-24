package com.HackerRank.String;

import java.util.Scanner;
import java.util.regex.*;
import java.util.regex.PatternSyntaxException;
public class PatternChecker
{
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		int testCases = Integer.parseInt(in.nextLine());
		while(testCases >0){
			String pattern = in.nextLine();
          	//Write your code      
			
			try{
				Pattern.compile(pattern);
				System.out.println("Valid");
			}catch(PatternSyntaxException ex)
			{
				System.out.println("Invalid");
			}
		}testCases -- ;
	}
}

//input
//3
//([A-Z])(.+)
//batcatpat(net