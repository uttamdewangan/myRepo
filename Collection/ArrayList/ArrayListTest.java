package ArrayList;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class ArrayListTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Integer> list=new ArrayList<Integer>();
		//List<Integer> list=new CopyOnWriteArrayList<Integer>();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		
		Iterator<Integer> itr=list.iterator();
		
		while(itr.hasNext())
		{
			Integer  n=itr.next();
			if(n==5)
			{
				itr.remove();     //java.lang.UnsupportedOperationException exception in CopyOnwriteArrayList but it run in arrayList
				//list.remove(n);   //this method will return exception in ArrayList /concurrentModificationException but it work in CopyOnwriteArrayList
				//list.add(100);
			}
		}
		System.out.println(list);
		

	}

}
