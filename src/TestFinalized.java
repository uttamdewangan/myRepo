
public class TestFinalized {
	
	
	    public static void main(String[] args) 
	    { 
	        //String s = new String("RR"); 
	    	TestFinalized s=new TestFinalized();
	        s = null; 
	  
	        // Requesting JVM to call Garbage Collector method 
	        System.gc(); 
	        System.out.println("Main Completes"); 
	    } 
	  
	    // Here overriding finalize method 
	    public void finalize() 
	    { 
	        System.out.println("finalize method overriden"); 
	    } 
	 

}