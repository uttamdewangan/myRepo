package com.String;

import java.util.HashMap;
import java.util.Map;

public class CountWord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str="I am learning learning java java java Programing ";
		
		String words[]=str.split(" ");
		for(String word:words)
		{
			//System.out.println(""+word);
			int count=0;
			for(int i=0;i< words.length;i++)
			{
				if(word.equals(words[i]))
				{
					count =count+1;
				}
			}
			System.out.println(""+word+" count = "+count );				
		}
		
		System.out.println("============");
		countWordWithHashMap(str);
		
	}
	
	public static void countWordWithHashMap(String str)
	{
		System.out.println(str);
		Map<String,Integer> map=new HashMap<String,Integer>();
		
		String arr[]=str.split(" ");
		int count=1;
		
		for(int i=0;i< arr.length;i++)
		{			
			if(!map.containsKey(arr[i]))
			{
				map.put(arr[i],count);
			}else{
				map.put(arr[i], map.get(arr[i])+1);
			}
		}
		
		for(String x:map.keySet()){
			System.out.println("The count of the word :"+x+" = "+map.get(x));
		}
		}

}
