package Thread;


public class ThreadTest {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
			
		Thread th1=new Thread(() ->
		{ 
			for (int i = 1; i <= 5; i++) {
				System.out.println("Hi");
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		
		});			
				
				
		Thread th2=new Thread(() ->
		{			
				
			for (int i = 1; i <= 5; i++) {
				System.out.println("Hello");
				try {Thread.sleep(1000);} catch (InterruptedException e) {e.printStackTrace();}
			}
		
		});
			
		
		th1.start();
		//th1.join();
		th2.start();
		//th2.join();
		//System.out.println("Bye");
	}

}
