package DefaultTest;


public class DefaultMethodTest implements A,B{
	
	public void defaultMethod(){ 
        System.out.println("My Class default method"); 
        B.super.defaultMethod();
    }  

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		DefaultMethodTest dm=new DefaultMethodTest();
		dm.defaultMethod();
		

	}

}
