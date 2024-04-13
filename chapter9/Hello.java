
public record Hello<T> (T t)
{
	public Hello(T t)
	{
		this.t = t;
	}

	private <T> void println(T m)
	{
		System.out.print(t + "-" + m);
	}
 
	public static void main(String as[])
	{
		new Hello<String>("hi").println(1);
		new Hello("halo").println(true);
	}
}