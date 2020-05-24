package Factory;

import com.phone.Android;
import com.phone.IOS;
import com.phone.OS;
import com.phone.Windows;

public class OperatingSystemFactory {

	
	
	public OS getInstance(String str)
	{
		if(str.equals("Open"))
		{
			return new Android();
		}
		else if(str.equals("Closed"))
		{
			return new IOS();
		}else
		{
			return new Windows();
		}
		
		 
	}
	
}
