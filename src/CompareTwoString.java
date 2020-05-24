import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class CompareTwoString {

	public static void main(String args[]) {

	    List <String>test = new ArrayList();
	    List<String> list = new ArrayList();
	    list.add("U1,U2");
	    list.add("U3,U4");
	    list.add("U2,U1");
	    list.add("U1,U5");
	    list.add("U1,U2");
	    Collections.sort(list);

	    /*for (String str : list) {
	        String i1 = str.substring(0, 2);
	        String i2 = str.substring(3, 5);
	         System.out.println(i2);
	         if (!i1.equals(i2)) {
	         test.add(str);
	         }
	        if (!(str.contains(i1) && str.contains(i2)) || !(str.contains(i2) && str.contains(i1))) {
	            System.out.println(str);
	        }


	    }*/
	    for(String str:list)
	    {
	    	String i1=str.substring(0,2);
	    	String i2=str.substring(3,5);
	    	String tempString=""+i2+","+i1;
	    	System.out.println(""+str);
	    	System.out.println("-reverse--"+tempString);
	    	System.out.println("1--"+test.contains(str)+"    2--"+test.contains(tempString));
	    	if(!i1.equals(i2) && (!(test.contains(str)) && !(test.contains(tempString))))
	    	{
	    		test.add(str);
	    	}
	    	
	    }
	    for(String str1:test)
    	{
    		System.out.println(""+str1);
    	}

	}

}
