package MultiThreading;

public class SleepMethod extends Thread{

	public void run()
	{
		for(int i=1;i<=6;i++)
		{
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println(i);
		}
	}
	
	public static void main(String[] args) {
		SleepMethod s = new SleepMethod();
		s.start();

	}

}
