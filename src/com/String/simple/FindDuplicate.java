package com.String.simple;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class FindDuplicate {
	
	public static void fun1(String arr[])
	{
		List l = new ArrayList<String>();
		for(String name:arr)
		{
			if(!l.contains(name))
			{
				l.add(name);
			}
			else{System.out.println(""+name);}
		}
	
	}
	
	public static void fun2(String arr1[])
	{
		Set<String> s = new HashSet<String>();
		for(String name:arr1)
		{
			if(s.add(name)==false)
			{
				System.out.println(""+name);
			}
			
		}
	
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String names[]={"Java","JavaScript","Ruby","C","Python","Java","Ruby"};
		
		fun1(names);
		fun2(names);

	}

}
