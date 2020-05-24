package com.Array;

public class MissingNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[]={-1,0,1,2,4,5,6,7};
		int startNo=a[0];
		int endNo=a[a.length-1];
		int missingNo=0;
		int sum=0;
		int actualSum=0;
		
		for(int j=0;j<a.length;j++)
		{
			sum=sum+a[j];
		}
			
			
		for(int i=startNo;i<=endNo;i++)
		{
			actualSum=actualSum+i;
		}
		System.out.println("missing no = "+(actualSum-sum));
	}

}
