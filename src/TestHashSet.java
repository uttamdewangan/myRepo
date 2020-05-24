import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;


public class TestHashSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<String> h_set = new HashSet<String>();
		HashSet<Integer> h_setInteger = new HashSet<Integer>();
		
		h_set.add("Red");
        h_set.add("Green");
        h_set.add("Black");
        h_set.add("White");
        h_set.add("Pink");
        h_set.add("Yellow");
        
        
        h_setInteger.add(1);
        h_setInteger.add(6);
        h_setInteger.add(5);
        h_setInteger.add(8);
        h_setInteger.add(10);
        h_setInteger.add(3);
        
        System.out.println("Original Hash Set: " + h_set);
        HashSet <String> new_h_set = new HashSet <String> ();
        new_h_set = (HashSet)h_set.clone();
        System.out.println("Cloned Hash Set: " + new_h_set); 
        
        System.out.println("integer Hash set : "+ h_setInteger);
        
        Iterator<String> p=h_set.iterator();
        while(p.hasNext())
        {
        	System.out.println(""+p.next());       	
 

        }
        List<String> list=new ArrayList<String>(h_set);
        Collections.sort(list);
        System.out.println(""+list);

	}
}
