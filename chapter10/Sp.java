import java.util.*;
import java.util.stream.*;

record sp1(String cm, String space){}


public class Sp
{
	public static void main(String as[])
	{
		var sl = Stream.of("a-", "b-", "c-", "d-", "e-", "f-");
		Spliterator<String> one = sl.spliterator();
		Spliterator<String> two = one.trySplit();
		one.forEachRemaining(System.out::println);
		two.forEachRemaining(System.out::println);

		var ani = Stream.of("lion", "tiger", "rhino", "dog");
		Map<String, Integer> mp = ani.collect(Collectors.toMap(s->s, String::length));
		System.out.println(mp);

		var s2 = Stream.of("lion", "tiger", "rhino", "dog");
		Map<Integer, List<String>> mp2 = s2.collect(Collectors.groupingBy(String::length));
		System.out.println(mp2);

		var list = List.of("x","y","z");
		sp1 result = list.stream()
								.collect(Collectors.teeing(
									Collectors.joining(" "),
									Collectors.joining(","),
									//Collectors.joining("-"),
									(s,c) -> new sp1(s,c)));
		System.out.println(result);

	}
}