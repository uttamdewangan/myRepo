package Singletion;

public class Singleton {
	
	//private static Singleton initializeSingultioSingleton =new Singleton();
	
	private static Singleton lazyInitialization=null;
	
	private Singleton()
	{
		 
	}
	
	public static Singleton getSingleton()
	{
		if(lazyInitialization==null){
			synchronized (Singleton.class) {
				if(lazyInitialization==null)
				{
					lazyInitialization=new Singleton();
				}
				
			}
			
		}
		return lazyInitialization;
	}
	

}


