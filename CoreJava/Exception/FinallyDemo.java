package Exception;

public class FinallyDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int i=getValue();
		System.out.println("Value of i "+i);

	}
	
	public static int getValue()
	{
		try{
			System.out.println("In try block ");
			return 10;
		}
		finally
		{
			System.out.println("In finally block ");
			return 20;
		}
		
	}

}
