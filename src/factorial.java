import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;


public class factorial {
	
	
	
	
	static int getFectorial(int n) throws Exception
	{
		if (n==0)
			return 1;
		else if(n>0){
			n=n*getFectorial(n-1);
			return n;
		} else{
			throw new Exception("Number should be greater than or equal to zero");
		}
		
	}

	static int getPower(int num, int power)
	{
		if (power>0)
		return num*getPower(num, power-1);
		return 1;
		
	}
	
	static int getPower1(int num, int power)
	{
		if (power>1)
		return num*num;
		else
			return num;
	}
	static void getPerfectNo(int n)
	{
		List <Integer> tempList=new ArrayList<Integer>();
	
		for(int i=2;i<=n/2;i++)
		{
			
			if(n%i==0)
			{
				tempList.add(i);
			}
				
		}
		int sum=1;
		for(int j:tempList)
		{
			sum=sum+j;
		}
		if(sum==n)
		{
			System.out.println("true");
		}else{
			System.out.println("false");
		}
		
		//return null;
		
	}
	public static void main(String[] args) {
		
		
		System.out.println("Power:" + getPower(5,3));
		int i =0;
		Integer I=new Integer(i);
		String s= I.toString();
		System.out.println("Number of digits : "+s.length());
		// TODO Auto-generated method stub
		int arr[][] = new int[4][4];
		arr[0][0]=4;
		arr[0][1]=7;
		arr[0][2]=6;
		arr[0][3]=5;
		arr[1][0]=11;
		arr[1][1]=11;
		arr[1][2]=12;
		arr[1][3]=13;
		arr[2][0]=10;
		arr[2][1]=21;
		arr[2][2]=22;
		arr[2][3]=23;
		arr[3][0]=20;
		arr[3][1]=31;
		arr[3][2]=32;
		arr[3][3]=33;
		
		List<Integer> firstRow = new ArrayList<Integer> ();
		List<Integer> firstCol = new ArrayList<Integer> ();
		
		for(int col = 0 ; col<=3; col++)
			firstRow.add(arr[0][col]);
			
		Collections.sort(firstRow, Comparator.reverseOrder());
		
		for (int row = 0; row<=3; row++)
			firstCol.add(arr[row][0]);
		
		System.out.println("First Column before sort: " + firstCol);
		
		Collections.sort(firstCol);
		System.out.println("After sort Row: " + firstRow);
		System.out.println("After sort Col: " + firstCol);
			
		
		for (int row = 0; row<=3; row++)
			arr[row][0]=firstCol.get(row);
		
		
		for(int row =0 ; row<=3; row++)
		{
			for (int col =0; col<=3; col++)
				System.out.println("[" + row + "][" + col + "]--->" + arr[row][col]);
		}
		
		//getPerfectNo(28);
		/*
		int fact;
		try {
			fact = getFectorial(-2);
			System.out.println("factorial: " + fact);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/
	
		

	}

}
