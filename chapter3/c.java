public class c
{
	public static void main(String a[])
	{
		enum Ani{BIRD, FISH, MAMMAL}

		Ani ab = Ani.BIRD;
		long t = switch(ab){
			case BIRD -> 1;
			case FISH -> 2;
			case MAMMAL ->3;
			default -> 4;
		};
		System.out.println(t);
	}
}