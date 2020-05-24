package StreamApi;

import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.stream.Stream;

public class Stream3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Integer>values=Arrays.asList(1,2,3,4,5,6,7);
		
		
		/*int result=0;
		for(int i:values)
		{
			result=result+i;
			System.out.println("=="+result);
		}*/
		
		Function<Integer,Integer> f = new Function<Integer,Integer>()
		{
			public Integer apply(Integer i)
			{
				return i*2;
			}
			
		};
		
		BinaryOperator<Integer> b=new BinaryOperator<Integer>() {

			
			public Integer apply(Integer i, Integer j) {
				// TODO Auto-generated method stub
				return i+j;
			}
			
			
		};
		//System.out.println(values.stream().map(i->i*2).reduce(0,(c,e) ->c+e));   //convert the collection in stream   //stream method define in collection
		Stream s=values.stream();
		Stream s1=s.map(f);
		
		Integer result=(Integer)s1.reduce(0,b);
		
		//s.forEach(System.out::println);
		System.out.println(result);
		
		
	}

}
