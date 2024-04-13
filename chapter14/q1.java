import java.io.*;
import java.nio.file.*;
import java.util.stream.Collectors;

class q1
{
	public static void main(String as[]) throws Exception
	{

		var x = Path.of(".");
		Files.walk(x.toRealPath().getParent())
			.map(p->p.toAbsolutePath().toString())
			.filter(s->s.endsWith(".java"))
			.forEach(System.out::println);




		/*
		
		var f = Path.of("monkeys");
		try(var m = Files.find(f,1,(p,a) -> a.isSymbolicLink()))
		{
			m.map(s->s.toString())
			.collect(Collectors.toList())
			.stream()
			.filter(s-> s.toString().endsWith(".txt")) 
			.forEach(System.out::println);
		}


		
		var p1 = Path.of("/lizard",".").resolve(Path.of("walking.txt"));
		var p2 = new File("/lizard././actions/../walking.txt").toPath();

		System.out.println(Files.isSameFile(p1,p2));// + " "
		//		+ p1.equals(p2) + " "
		//		+ Files.mismatch(p1,p2));





		var p1 = Path.of("/zoo/./bear","../food.txt");
		//p1 = p1.normalize();//
		p1 = p1.relativize(Path.of("/lion"));
		System.out.println(p1);

		*/


	}

	/*public static void copuFile(File f1, File f2) throws Exception
	{
		var reader = new InputStreamReader(new FileInputStream(f1));
		try(var wr = new FileWriter(f2))
		{
			char[] bf = new char[10];
			while(reader.read(bf) != -1)
			{
				wr.write(bf);
			}
		}
	}
	*/
}