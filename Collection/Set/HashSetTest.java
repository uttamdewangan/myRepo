package Set;

// Java code to illustrate add() 
import java.util.HashSet;
  
public class HashSetTest { 
    public static void main(String args[]) 
    { 
        // Creating an empty HashSet 
        HashSet<String> set = new HashSet<String>(); 
  
        // Use add() method to add elements into the Set 
        set.add("Welcome"); 
        set.add("To"); 
        set.add("Geeks"); 
        set.add("4"); 
        set.add("Geeks"); 
  
        // Displaying the HashSet 
        System.out.println("HashSet: " + set); 
    } 
} 