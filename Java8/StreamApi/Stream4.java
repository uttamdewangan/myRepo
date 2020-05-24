package StreamApi;

import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.stream.Stream;

public class Stream4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Integer>values=Arrays.asList(1,2,3,4,5,6,7);
		
		
		/*int result=0;
		for(int i:values)
		{
			result=result+i;
			System.out.println("=="+result);
		}*/
		
		//Function<Integer,Integer> f = };
		
		//BinaryOperator<Integer> b=;
		//System.out.println(values.stream().map(i->i*2).reduce(0,(c,e) ->c+e));   //convert the collection in stream   //stream method define in collection
		//Stream<Integer> s=values.stream();
		
		//Stream<Integer> s1=s.map(i->i*2);
		
		Integer result=values.stream().map(i->i*2).reduce(0,Integer::sum);
			
			
		
		//s.forEach(System.out::println);
		System.out.println(result);
		
		
	}

}
