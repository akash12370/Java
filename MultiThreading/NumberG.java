package MultiThreading;

public class NumberG extends Thread{
	
	int st;
	int ed;
	
	public NumberG(int st, int ed)
	{
		this.st = st;
		this.ed = ed;
	}
	
	public void run()
	{
		for(int i=st;i<=ed;i++)
		{
			System.out.println(Thread.currentThread().getName() + ": " + i);
			i++;
		}
	}
	
	
}
