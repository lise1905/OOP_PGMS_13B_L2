public class pc
{
	public static void main(String args[])
	{
		Shared s=new Shared();
		Producer p=new Producer(s);
		Consumer c=new Consumer(s);
	}
}
class Shared 
{
	int num;
	boolean val=false;
	synchronized int get()
	{
		try
		{
			while(!val)
			{
				wait();
			}
		}
		catch(InterruptedException e){}
		val = false;
		System.out.println("Consumer: " + num);
		notify();
		return num;
	}
	synchronized void put(int num)
	{
		try
		{
			while(val)
			{
				wait();
			}
		}
		catch(InterruptedException e){}
		this.num = num;
		System.out.println("Producer: " + num);
		val = true;
		notify();
	
	}
}
class Producer extends Thread
{
	Shared s;
	Producer(Shared s)
	{
		this.s=s;
		this.start();
	}
	public void run()
	{
		int i=0;
		while(true)
		{
			s.put(++i);
		}
	}
}
class Consumer extends Thread
{
	Shared s;
	Consumer(Shared s)
	{
		this.s=s;
		this.start();
	}
	public void run()
	{
		while(true)
		{
			s.get();
		}
	}
}