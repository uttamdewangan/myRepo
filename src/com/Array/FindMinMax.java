package com.Array;

public class FindMinMax {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[] = {-88,24,50,-10,456};
		int largest=arr[0];
		int smallest=arr[0];
		for(int i=1;i<arr.length;i++)
		{
			if(arr[i] > largest)
			{
				largest=arr[i];
			}
			else if(arr[i]<smallest)
			{
				smallest=arr[i];
			}
		}
		
			
		System.out.println("largest value =="+largest);
		
		System.out.println("Smallest value=="+smallest);
		

	}

}
