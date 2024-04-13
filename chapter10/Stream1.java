import java.util.stream.*;
import java.util.*;
import java.util.function.*;

public class Stream1
{
	public static void main(String as[])
	{
		Stream<String> empty = Stream.empty();
		Stream<Integer> ele = Stream.of(1,2,3);

		List<Integer> al = List.of(1,2,3,4);
		Stream<Integer> s3 = al.stream();

		Stream<Integer> odd = Stream.iterate(1,
											n -> n<100,
											n -> n+2);
		odd.limit(3).forEach(System.out::println);


		System.out.println("count - " + ele.count());

		//Optional<Integer> min1 = ele.min((a,b) -> a-b);
		//min1.ifPresent(System.out::println);		// stream has already been operated upon or closed

		Stream<Integer> s4 = Stream.of(2,4,6,1);
		Optional<Integer> min1 = s4.max((a,b) -> a-b);
		min1.ifPresent(System.out::println);

		Stream<String> s5 = Stream.of("tony", "steave", "romanoff", "wanda");
		s5.findAny().ifPresent(System.out::println);


		Stream<String> s6 = Stream.of("tony", "1", "carter");
		Predicate<String> p1 = x -> Character.isLetter(x.charAt(0));
		System.out.println(s6.noneMatch(p1));   //any, all, none

		var sl = List.of("tony", "steave", "romanoff", "wanda");
		String val = sl.stream().reduce("", (s,c) -> s+"-"+c);
		System.out.println(val);

		sl.stream().reduce((s,c)->s+c).ifPresent(System.out::println);

		var il = List.of(1,9,2,8,3,7,4,6,5);
		System.out.println(il.stream().reduce(0, (a,b)->a+b, (a,b)->a+b));

		Stream<Integer> s7 = il.stream();
		TreeSet<Integer> ts = s7.collect(TreeSet::new,
										TreeSet::add,
										TreeSet::addAll);
		System.out.println(ts);

		Stream<Integer> s8 = il.stream();
		Set<Integer> ht = s8.collect(Collectors.toCollection(HashSet::new));
		System.out.println(ht);

		IntStream is = IntStream.of(1,2,3,4);
		IntSummaryStatistics stats = is.summaryStatistics();
		System.out.println(stats.getMax() + " " + stats.getMin() + " " + stats.getSum() + " " + stats.getAverage());
	}
}









