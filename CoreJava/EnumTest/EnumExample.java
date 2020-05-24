package EnumTest;

enum Mobile
{
	APPLE,SAMSUNG(10),HTC(20);
	int price;
	
	Mobile()
	{
		 price =10;
	}
	Mobile(int m)
	{
		 m =10;
	}
		public int getPrice()
		{
			System.out.println(price);
			return price;
		}
	
	
}





/*class Mobile
{
	static final Mobile APPLE=new Mobile();
	static final Mobile SAMSUNG =new Mobile();
	static final Mobile HTC =new Mobile();
}*/
public class EnumExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(Mobile.APPLE.getPrice());
		
	}

}
