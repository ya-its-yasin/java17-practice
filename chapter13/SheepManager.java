import java.util.concurrent.Executors;
import java.util.concurrent.ExecutorService;

class SheepManager
{
	volatile int cnt=0;
	private synchronized void shInc()
	{
		{
			System.out.print(++cnt + " ");
		}
		
	}
	public static void main(String as[])
	{
		
		ExecutorService s = Executors.newFixedThreadPool(20);
		try
		{
			SheepManager man = new SheepManager();
			for(int i=0;i<10;i++)
			{
				s.submit(()-> man.shInc());
			}
		}finally{
			s.shutdown();
		}

	}
}