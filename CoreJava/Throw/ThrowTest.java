package Throw;

public class ThrowTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ThrowTest throwobj=new ThrowTest();
		try{
			throwobj.display();
		}catch(RuntimeException ex)
		{
			System.out.println("Exception caught in catch block of main");
			System.out.println(ex.getMessage());
			ex.printStackTrace();
		}
	}
	
	public void display()
	{
		try{
			throw new RuntimeException("Runtime Exception occured");
		}catch(RuntimeException ex)
		{
			System.out.println("Exception caught in catch block of display");
			throw ex;
		}
	}

}
