package com.String;
import java.util.ArrayList;
import java.util.List;


public class TestArmStrong {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		getArmStrongNo(16);

	}
	
	static int getArmStrongNo(int n)
	{
		
		int temp=1;
		int sum=0;
		List<Integer> armstrongNo=new ArrayList();
		List<Integer> lstDigit = new ArrayList();
		Integer I=new Integer(n);
		String number= I.toString();
		int digit=0;
		int lengthOfNumber = number.length();
		for(int k=1;k<=lengthOfNumber;k++)
		{
			digit=n%10;
			lstDigit.add(digit);
			n=n/10;
			
		}
		lstDigit.add(n);
		
		for(int j:lstDigit)
		{
			for(int k=0;k<lengthOfNumber;k++)
			{
				temp=temp*j;
				
			}
			armstrongNo.add(temp);
			temp=1;
		}
		
		for(int l:armstrongNo)
		{
			sum=sum+l;
			
		}	
		System.out.println("ArmStrongNo: " + sum);
		
		return sum;
	}

}
