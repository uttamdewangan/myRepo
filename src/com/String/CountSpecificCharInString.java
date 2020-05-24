package com.String;

public class CountSpecificCharInString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str="Programming";
		int count=0;
		char charr[]=str.toCharArray();
		for(char ch: charr)
		{
			count=0;
			for(int i=0;i<charr.length;i++)
			{
				
				if(ch==charr[i])
				{
					count=count+1;
				}
			}
			System.out.println("count of character "+ch+" = : "+count);
		}
		
		
		
	}

}
