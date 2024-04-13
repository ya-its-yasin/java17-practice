import java.util.*;
public class b{
	public static void main(String as[]){
		List<Integer> l = new ArrayList<>();
		l.add(10);
		l.add(14);

		for(var a:l){
			System.out.println(a+", ");
			break;
		}

		for(int a:l){
		//	continue;
			System.out.println(a+", ");
		}

		for(Object a:l){
			System.out.println(a+", ");
		}

	}
}