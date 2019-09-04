
package shria;
//Threads
class one extends Thread
{
        @Override
	public void run()
	{
		for(int i=1;i<4;i++)
		{
			try
			{
				Thread.sleep(1000);
				System.out.println("Thread 1");
			}
			catch(InterruptedException e)
			{
				System.out.println("Error");
			}
			System.out.println(i);
		}

		
	}
}

class two implements Runnable
{
        @Override
	public void run()
	{
		for(int i=1;i<3;i++)
		{
			try
			{
				
				Thread.sleep(800);
				System.out.println("Thread 2");
			}
			catch(InterruptedException e)
			{
				System.out.println("Error");
			}
			System.out.println(i);
		}
	}
		
}

class Lab8
{
	public static void main(String[] args)
	{
		one a = new one();
		a.start();
		two b = new two();
		Thread t = new Thread(b);
		t.start();
	}
}