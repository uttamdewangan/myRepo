package StreamApi;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class StreamMapExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Map<String,String>> list=new ArrayList();
		Map<String,String> mapValue=new HashMap();
		mapValue.put("key1","value1");
		mapValue.put("key2","welcome");
		mapValue.put("key3","value3");
		list.add(mapValue);
		
		mapValue=new HashMap();
		mapValue.put("key1","valuea1");
		mapValue.put("key2","uttam");
		mapValue.put("key3","valuea3");
		list.add(mapValue);
		
		mapValue=new HashMap();
		mapValue.put("key1","value1");	
		mapValue.put("key3","value3");
		list.add(mapValue);
		
		list.stream().filter(x->x.containsKey("key2")).forEach(x->System.out.println(x));
		
		list.stream().filter(x->x.containsKey("key2")).map(x->x.get("key2")).forEach(x->System.out.println(x));
		
		
		
		

	}

}
