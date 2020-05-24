interface intf1
{
	public void m1();
}


public class TestLembdaExp {
	
	int x=10;
	public void m2()
	{
		int y =20;
		intf1 i = ()->
		{
			System.out.println(x);
			System.out.println(y);
		};
		i.m1();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TestLembdaExp t=new TestLembdaExp();
		t.m2();
	}

}
