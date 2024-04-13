import java.lang.Runnable;
public class ThreadTest
{
	public static void main(String as[])
	{
		Runnable r1 = () -> System.out.println("Helloooooooooo by r1");
		Runnable r2 = () ->{
			for(int i=0;i<10;i++)
			{
				System.out.println("Hello by r2");
			}
		};

		new Thread(r1).start();
		new Thread(r2).start();
		new Thread(r1).start();
	}
}