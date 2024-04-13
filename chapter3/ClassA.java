public class ClassA{
	public static void main(String[] as){
		int a = 6;
		var type = switch(a){
		case 1,2 -> "a";
		case 3,4 -> "b";
		case 5,6 -> "Turtle";
		case 7,8 -> "Alligator";
		};
		System.out.println(type);
	}
}