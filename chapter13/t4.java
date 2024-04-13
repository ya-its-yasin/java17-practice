import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.lang.Runnable;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;

class t4
{
	public static void main(String as[])
	{
		ScheduledExecutorService s = Executors.newSingleThreadScheduledExecutor();
		Runnable r1 = () -> System.out.println("Hello Zoo");
		Callable<String> c1 = () -> "Monkey";

		ScheduledFuture<?> res1 = s.schedule(r1,5,TimeUnit.SECONDS);
		ScheduledFuture<?> res2 = s.scheduleWithFixedDelay(r1,3,2,TimeUnit.SECONDS);
		try{
			System.out.println(res2.get());
		}catch(Exception e){

		}
		
	}
}