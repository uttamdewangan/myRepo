package com.String.simple;

public class ReverseNumber {
	
	private static void fun1()
	{
		Integer number=3456;		
		System.out.println("------"+number);
		for(int i=1;i<=number.SIZE;i++)
		{
			int reminderNo=number%10;			
			number=number/10;			
			System.out.print(""+reminderNo);
		}
	}
	
	
	
	private static void fun2()
	{
		
		int number=3456;
		int rem=0;
		while(number!=0)
		{
			rem=rem*10+number%10;
			number=number/10;	
		
		}
		System.out.print(""+rem);
		
	}	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		fun1();
		fun2();	

	}

}
