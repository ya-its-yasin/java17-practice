interface FuncInt
{
	public String lamAdd(String str);
}

public class Lambdatest
{
	public static void main(String args[])
	{
		FuncInt ex = (s) -> s + "!";
		FuncInt qs = (s) -> s + "?"; 
		printForm("Hello", ex);
		printForm("World", qs);
	}
	public static void printForm(String str, FuncInt fi)
	{
		System.out.println(fi.lamAdd(str));
	}

}