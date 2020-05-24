package com.String.simple;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Anagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan=new Scanner(System.in);
		String a=scan.next();
		String b=scan.next();
		boolean ret=checkAnagram(a,b);
		System.out.println(ret ?"anagram":"not anagram");
	}
	
	public static boolean checkAnagram(String a,String b)
	{
		
		a=a.replace(" ","").toLowerCase();
		b=b.replace(" ","").toLowerCase();
		char[] c=a.toCharArray();
		char[] d=b.toCharArray();
	
		Arrays.sort(c);
		Arrays.sort(d);
		
		
		for(char ch:c)
		System.out.println("==="+ch);
		
		for(char ch1:d)
		System.out.println("==="+ch1);
		if(Arrays.equals(c,d))		
			return true;		
		else return false;
		
	}

}

//inpute :  
//ace
//cea
