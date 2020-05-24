		  
public class Print100withoutLoop {

	
		    static int printNos(int n) 
		    { 
		        if(n > 0) 
		        { 
		        	printNos(n - 1); 
		            System.out.println("method before printing no." + n);
		            if (n>0)
		            {
		            	System.out.println("In if: " + n);;
		            	//return 1;
		            }
		            
		           
		        } 
		        //System.out.println("All calls in stack");
		        //return; 
				return n;
		    } 
		  
		    // Driver Code 
		    public static void main(String[] args)  
		    { 
		        printNos(3); 
		    } 
		} 

	


