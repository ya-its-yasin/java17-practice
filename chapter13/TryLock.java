import java.lang.Runnable;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import java.util.concurrent.TimeUnit;

class TryLock
{
	static void printH(Lock lock)
	{
		try{
			lock.lock();
			for(int i=0;i<10000;i++)
				System.out.print(i+" ");
		}finally{
			lock.unlock();
		}
	}
	public static void main(String as[])
	{
		Lock lock = new ReentrantLock();
		new Thread(()->printH(lock)).start();
		try{Thread.currentThread().sleep(10);
		if(!lock.tryLock(1,TimeUnit.SECONDS))
		{
			System.out.println("Sorry, it is locked by someone else");
		}
		else{System.out.println("got it"); lock.unlock();}
		}
		catch(Exception e){}
	}
}