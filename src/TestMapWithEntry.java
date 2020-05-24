import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;


public class TestMapWithEntry {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Map<Integer,String> map=new HashMap<>();
		
		map.put(110,"Test1");
		map.put(105,"Test2");
		map.put(104,"Test3");
		map.put(103,"Test4");
		
		for(Map.Entry m: map.entrySet())
		{
			System.out.println("*******"+m.getKey() + "--" + m.getValue()+"*********");
		}
		
		Set set=map.entrySet();
		Iterator itr=set.iterator();
		while(itr.hasNext())
		{
			Entry m1=(Entry) itr.next();
			System.out.println(m1.getKey()+"*****"+m1.getValue());
			
		}

	}

}
