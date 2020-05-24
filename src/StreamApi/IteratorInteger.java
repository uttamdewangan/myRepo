package StreamApi;

import java.util.Iterator;
import java.util.List;

public class IteratorInteger {
	
	
	public static int sumIterator(List<Integer> list)
	{
		Iterator<Integer> it=list.iterator();
		int sum=0;
		while(it.hasNext())
		{
			int num=it.next();
			if(num>10)
			{
				sum=sum+num;
			}
		}
		
		return sum;
	}
	
	public static void main(String[] args) {
		
		
		
	}

}
