package com.PracticeTest;

public class Subsequence {

	
		    static int arr[] = new int[]{1, 2, 3, 4}; 
		      
		    // Prints all subarrays in arr[0..n-1] 
		    
		    static int newArray[]=new int[3];
		    static void subArray( int n) 
		    { 		    	
		        // Pick starting point 
		        for (int i=0; i <n; i++) 
		        { 
		            // Pick ending point 
		            for (int j=i; j<n; j++) 
		            { 
		                // Print subarray between current starting 
		                // and ending points 
		                for (int k=i; k<=j; k++) {
		                	//if(j==2){
		                		// newArray[k]=arr[k];
		                		 System.out.print(arr[k]+" ");
		                			//}
		                	 
		                }
		                   
		            } 
		        } 
		        
		    } 
		      
		    // Driver method to test the above function 
		    public static void main(String[] args)  
		    { 
		        System.out.println("All Non-empty Subarrays"); 
		        subArray(arr.length); 
		          
		    } 
		

	}


