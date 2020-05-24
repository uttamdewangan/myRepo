
public class TestPower {
	
	
	
	
	public static int getPower(int num,int power)
	{
		if(power==0)
			return 1;
		else
			num=num*getPower(num,power-1);
			return num;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(""+getPower(1,5));
		
	}

}
