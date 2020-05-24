package com.HackerRank;
import java.util.Scanner;


public class Hacker2_5 {

	
	public void fun1()
    {
 	 Scanner scan = new Scanner(System.in);       
     int i = scan.nextInt();
     double d=scan.nextDouble();
     //scan.nextLine();
     String s=scan.next();
     

     // Write your code here.

     System.out.println("String: " + s);
     System.out.println("Double: " + d);
     System.out.println("Int: " + i);
    }
	
	public void fun2()
    {
		
		
            Scanner sc=new Scanner(System.in);
            System.out.println("================================");
            for(int i=0;i<3;i++)
            {
                String s1=sc.next();
                int x=sc.nextInt();
                //Complete this line
                System.out.printf("%-15s%03d\n",s1,x);
                
            }
            System.out.println("================================");

    
    
    }
	
	public void fun3()
    {
	 Scanner scan = new Scanner(System.in);
     int a = scan.nextInt();
     int b = scan.nextInt();
     int c = scan.nextInt();
     
     System.out.println(a);
     System.out.println(b);
     System.out.println(c);
	
    }
	
	
	public void fun4() {
		Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
       // scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        for(int i=1;i<=10;i++)
        {
        	System.out.println(n+" * "+i+" = "+n*i);
        }
        
        scanner.close();
    }
	
	public void fun5() {
	        Scanner in = new Scanner(System.in);
	        int t=in.nextInt();      
	    
           
	        for(int i=0;i<t;i++){
	            int a = in.nextInt();
	            int b = in.nextInt();
	            int n = in.nextInt();
	            
	        	
	        	for(int j=0;j<n;j++)
		        	{
		        		a=a+(int)Math.pow(2,j)*b;	
		        		System.out.println(" "+a);
		        	}  
	        }
	        
	        
	        in.close();
	    }
	
	
	
	public static void main(String[] args) {
       
		Hacker2_5 h2=new Hacker2_5();
		h2.fun5();
    }
}
