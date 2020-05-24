package StreamApi;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StreamExample1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		List<Integer> list=Arrays.asList(11,3,5,20,4,30,21);
		
		list.stream().filter(i->i>10).forEach(System.out::print);
		System.out.println("");
		
		list.stream().filter(i->i>10).map(i->i*2).forEach(System.out::print);
		System.out.println("");
		
		list.stream().filter(i->i>10).sorted().map(i->i*2).forEach(System.out::print);
		int sum=list.stream().filter(i->i>10).sorted().map(i->i*2).mapToInt(y->y).sum();
		System.out.println("sum :"+sum);
		
		System.out.println("");
			
		List<String> list1=new ArrayList<>();
		
		list1.add("welcome");
		list1.add("to");
		list1.add("Puneiker");
		list1.add("uttam");
		
		list1.stream().filter(i->(i.length()>=5)).map(i->i.toUpperCase()).forEach(i->System.out.println(i));
		
		
	}

}
