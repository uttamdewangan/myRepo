import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class TestSort {

	
	public static <t> void iterateList(ArrayList<t> tempList)
	{
	
		for(t temp:tempList)
		{
			System.out.println(temp+" ");			
		
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		ArrayList<Integer> integerList=new ArrayList<>();
		integerList.add(15);
		integerList.add(3);
		integerList.add(7);
		integerList.add(1);
		integerList.add(9);
		integerList.add(10);
		
		System.out.print("before short  ");
		iterateList(integerList);
		
		Collections.sort(integerList);
		System.out.println("");
		System.out.println("after short :");
		iterateList(integerList);
	}
}
