package com.PracticeTest;

import java.util.Arrays;
import java.util.List;

public class Sequence {
	
	static int[] list=new int[]{2,3,5,8,9};
	public static int findMinimum(int list[], int n) 
    { 
        int res = list[0]; 
          
        for (int i = 1; i < n; i++) 
            res = Math.min(res, list[i]); 
        return res; 
    } 
	
	public static int findMaximum(int list[], int n) 
    { 
        int res = list[0]; 
          
        for (int i = 1; i < n; i++) 
            res = Math.max(res, list[i]); 
        return res; 
    } 

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		
		for(int i=0;i<=list.length;i++)
		{
			for(int j=i+1;j<list.length-1;j++)
			{
				for(int k=j+1;k<list.length;k++)
				{
					if(list[i]==list[j] || list[i]==list[k] || list[j]==list[k])
					{
						continue;
					}
					System.out.println(""+list[i] + " " + list[j]+ " "+list[k]);
				}
				
			}
		}
		
		System.out.println(""+findMaximum(list, list.length));
		
	}

}
