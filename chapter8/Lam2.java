import java.util.function.*;
import java.time.*;
class Lam2
{
	public static void main(String as[])
	{
		Supplier<LocalDate> s1 = LocalDate::now;
		Supplier<LocalDate> s2 = () -> LocalDate.now();

		System.out.println(s1.get());
		System.out.println(s2.get());
		System.out.println(s2);

		Consumer<String> c1 = System.out::println;
		BiConsumer<String, Integer> c2 = (x,y) -> System.out.println(x +"" + y);

		c1.accept("Hello");
		c2.accept("World", 5);

		Predicate<String> p1 = String::isEmpty;
		BiPredicate<Integer, Integer> p2 = (a,b) -> {return (a>b)?true:false;};

		System.out.println(p1.test("") + " " + p2.test(4,5));

		Function<String, Integer> f1 = String::length;
		BiFunction<Integer, Integer, Integer> f2 = (a,b) -> {return (a>b)?a:b;};

		System.out.println(f1.apply("yasin") + " " + f2.apply(5,4));

		UnaryOperator<String> u1 = String::toUpperCase;
		BinaryOperator<String> b1 = (a,b) -> a.concat(b);

		System.out.println(u1.apply("sin") + " " +b1.apply("ya","sin"));

	}
}