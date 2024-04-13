
     
public class Season{
	enum se{
	WINTER, SPRING, SUMMER, FALL
}
	public static void main(String... as){
		//System.out.println(se.WINTER);
		for(var i:se.values()){
			System.out.println(i.name()+" "+i.ordinal());
		}
	}
}