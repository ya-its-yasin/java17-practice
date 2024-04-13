import java.io.File;
import java.nio.file.Path;
import java.nio.file.Files;
import java.util.stream.*;

class f1
{
	public static void main(String as[]) throws Exception
	{
		/*File file1 = new File("C:/Users/Admin/Desktop/java17/chapter14/test.txt");
		try{file1.createNewFile();}
		catch(Exception e){}\
		*/
		nio();
	}

	public static void nio() throws Exception
	{
		var path = Path.of("C:/Users/Admin/Desktop/java17/chapter14");
		if(Files.exists(path))
		{
			System.out.println("abs path -> " + path.toAbsolutePath() + "\n is dir? -> " + Files.isDirectory(path)
								+ "parent path -> " + path.getParent());
			if(Files.isRegularFile(path))
			{
				System.out.println("Size : " + Files.size(path)
							+ "last modified -> " + Files.getLastModifiedTime(path));
			}
			else 
			{
				try(Stream<Path> st = Files.list(path))
				{
					st.forEach(p -> System.out.println(" " + p.getFileName()));
				}
			}
		}
	}
}