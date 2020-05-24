package StreamApi;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;


public class StremAPI {

	
	public static void main(String[] args) {
		
		
		List<Integer> values= Arrays.asList(1,2,3,4,5,6);
		
		/*for(int i:values)
		{
			System.out.println(i);
		}*/
		
		values.forEach(i -> System.out.println(i));
		
		//Consumer<Integer> consumer=(Integer i) -> System.out.println(i);
			
		//values.forEach(i -> System.out.println(i));
		//values.forEach(System.out::println);
		values.forEach(System.out::print);
	}
	
	
}
