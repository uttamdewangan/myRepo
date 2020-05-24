package StreamApi;

import java.util.Arrays;
import java.util.List;

public class StreamMatchExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		List<Integer> list=Arrays.asList(5,4,7,10,24,10);
		
		boolean isAnyMatch=list.stream().anyMatch(i->i>20);
		System.out.println(isAnyMatch);
		
		boolean isNoMatch=list.stream().noneMatch(i->i>50);
		System.out.println(isNoMatch);
	}
	

}
