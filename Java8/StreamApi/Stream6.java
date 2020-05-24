package StreamApi;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class Stream6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Integer> values=Arrays.asList(12,20,35,46,55,68,75);
		
		Predicate<Integer> p = new Predicate<Integer>(){
				
				

				@Override
				public boolean test(Integer i) {
					// TODO Auto-generated method stub
					return i%5==0;
				}
		};
		
		System.out.println(values.stream()
								 .filter(i->(i%5==0))
								 .map(i->i*2)
								 .findFirst()
								 .orElse(0));
	}

}
