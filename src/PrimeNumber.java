public class PrimeNumber {

	public static void checkPrimeNumber(int num) {
		int prime = 0;
		if (num == 0 || num == 1) {
			System.out.println("Given Number is not a prime number");
		} else {
			for (int i = 2; i <= num / 2; i++) {
				if (num % i == 0) {
					System.out.println("Given Number is not a prime number");
					prime = 1;
					break;
				}
			}

			if (prime == 0)
				System.out.println("Given Number is prime number");
		}

	}
	
	public static void checkPrimeGivenRange(int startNo,int endNo)
	{
		
		boolean primeNo=true;
		if(startNo<0)
		{
			System.out.println("range should not start with nagetive value");
			
		}
		else if(startNo==0 && startNo==1)
		{
			primeNo=true;
			System.out.println("%d"+startNo);
		}
		else
			for(int j=startNo;j<=endNo;j++)
			{
				primeNo=true;
				for(int k=2;k<=j/2;k++)
				{
					if(j%k==0)
					{
						primeNo=false;
						//System.out.println("%t"+j);
						break;
					}
					
					
				}
				if(primeNo)
				{
					System.out.print("   "+j);
					
				}
				
			}
			
		{
			
			
		}
	}
	
	public static int getReverseNo(int num)
	{
		//i reverseNo="";
		
		
		int revNo=0;
		//int rest=0;
		while(num>0)
		{
			
			revNo=revNo*10+num%10;
			num=num/10;
		//}
		//reverseNo=reminder;
		System.out.println(""+revNo);
		System.out.println(""+num);
		}
		
		return revNo;
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//checkPrimeNumber(11);
		
		//checkPrimeGivenRange(1,50);
		
		int reverseNo=getReverseNo(23456);

	}

}
