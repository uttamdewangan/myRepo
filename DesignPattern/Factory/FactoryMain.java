package Factory;

import com.phone.OS;

public class FactoryMain {

	public static void main(String[] args) {
		
		OperatingSystemFactory osf=new OperatingSystemFactory();
		OS os=osf.getInstance("Closedsd");
		os.spec();
	}
}
