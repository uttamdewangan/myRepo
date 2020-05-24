package StreamApi;
import java.util.ArrayList;
import java.util.List;


public class StreamAPI1 {
//Stream is leasy evaluation  it have 2 method /intermediate and terminate
	
	// once use steam value you can not user another time
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> values=new ArrayList<>();
		for(int i=1;i<=10;i++)
		{
			values.add(i);
		}
		values.stream().filter(i ->{System.out.println("Hi");
		
		return true;
		}).findFirst();
		
	}

}
