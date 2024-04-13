import java.io.File;
import java.io.FileWriter;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.BufferedWriter;

class CopyFile
{
	public static void main(String as[]) throws Exception
	{
		File f1 = new File("test.txt");
		File f2 = new File("target.txt");

		try(var reader = new BufferedReader(new FileReader(f1));
			var writer = new BufferedWriter(new FileWriter(f2)))
		{
			String line;
			while( (line = reader.readLine()) != null)
			{
				writer.write(line);
				writer.newLine();
			}
		}
		System.out.println(System.lineSeparator());
	}

}