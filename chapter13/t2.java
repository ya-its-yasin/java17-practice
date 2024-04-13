import java.lang.Runnable;

public class t2
{
	private static int cnt=0;
	public static void main(String as[])
	{
		var mainThread = Thread.currentThread();
		new Thread(() -> {
			for(int i=0;i<1000000000;i++)
			{
				cnt++;
			}
			mainThread.interrupt();
		}).start();

		while(cnt<1000000000)
		{
			System.out.println("in progress" + cnt);
			try{
				Thread.sleep(1);
			}
			catch(InterruptedException e){
				System.out.println("Interrupted");
			}
		}

	}
}
