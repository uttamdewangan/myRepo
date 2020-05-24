package InterfaceAbstract;

public interface Inter1 {

	
	public static  void fun1()
	{
		System.out.println("static method interface 1");
	}
	/*{
		System.out.println("==Static method==");
	}*/
	void fun2();
	public default void fun3()
	{
		System.out.print("interface1 fun3");
	}	
	
	
}
