import java.util.concurrent.CyclicBarrier;
import java.util.concurrent.Executors;
class CycBar
{
	static void perf(CyclicBarrier c1)
	{
		try{
		System.out.println("removing lions");
		System.out.println("cleaning pens");
		c1.await();
		System.out.println("adding lions");
		}catch(Exception e){}
	}
	public static void main(String as[])
	{
		var s =Executors.newFixedThreadPool(4);
		try{
			var c1 = new CyclicBarrier(3); 
			for(int i=0;i<4;i++)
			{
				s.submit(()->perf(c1));
			}
		}
		catch(Exception e){}
		finally{
			s.shutdown();
		}
	}
}