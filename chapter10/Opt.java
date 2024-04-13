import java.util.*;

public class Opt
{
	public static void main(String as[])
	{
		Optional<Double> opt = Optional.empty();
		//System.out.println(opt.get());

		opt = avg();
		opt.ifPresent(System.out::print);
		System.out.println(opt.orElse(0.0));
		System.out.println(opt.orElseGet(()->Math.random()));
		System.out.println(opt.orElseThrow(() -> new IllegalStateException()));

	}

	static Optional<Double> avg(int ... marks)
	{
		if(marks.length==0)
			return Optional.empty();
		int sum=0;
		for(int i:marks)
		{
			sum+=i;
		}
		return Optional.of((double)(sum/marks.length));
	}
}