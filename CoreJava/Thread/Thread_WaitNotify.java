package Thread;

class Test
{
	int num;
	boolean valueSet=false;
	public synchronized void put(int num)
	{
		while(valueSet)
		{
			try{wait();}catch(Exception e){}
		}
		System.out.println("Put....:"+num);
		this.num=num;
		valueSet=true;
		notify();
	}
	
	public synchronized void get()
	{
		while(!valueSet){
			try{wait();}catch(Exception e){}
		}
		System.out.println("Get....:"+num);
		valueSet=false;
		notify();
	}
}

class Producer implements Runnable
{
	Test t;
	public Producer(Test t)
	{
		this.t=t;
		Thread th=new Thread(this,"Producer");
		th.start();
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		int i=0;
		while(true)
		{
			t.put(i++);
			try{
				Thread.sleep(500);
			}catch(Exception e){}
			
		}
	}
}

class Consumer implements Runnable
{
	Test t;
	public Consumer(Test t)
	{
		this.t=t;
		Thread t1=new Thread(this,"Consumer");		
		t1.start();	
		
	}
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		while(true)
		{
			t.get();
			try{
				Thread.sleep(5000);
			}catch(Exception e){}
			
		}
	}
	
}

public class Thread_WaitNotify {
	public static void main(String arg[])
	{
	Test t=new Test();
	new Producer(t);
	new Consumer(t);
	
	}
}
