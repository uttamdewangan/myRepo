package Exception;

public class Finallydemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int i=getValue();
		System.out.println("Value of i "+i);

	}
	
	public static int getValue()
	{
		try{
			System.out.println("In try block ");
			throw new RuntimeException();
		}
		catch(RuntimeException exce){
			System.out.println("Exception caught in catch block of getValue	 ");
			return 20;
		}
		finally
		{
			System.out.println("In finally block ");
			//return 20;
		}
		
	}

}
