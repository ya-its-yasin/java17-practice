import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class t3
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

		ExecutorService es = Executors.newSingleThreadExecutor();
		try{
			System.out.println("begin");
			es.execute(r1);
			es.execute(r2);
			es.execute(r1);
		}finally{
			es.shutdown();
		}
	}
}