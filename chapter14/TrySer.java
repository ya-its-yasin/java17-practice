import java.io.Serializable;
import java.io.File;
import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.util.ArrayList;

record Person(String name, int age) implements Serializable
{}

public class TrySer
{
	public static void main(String as[]) throws Exception
	{
		Person p1 = new Person("yasin",23);
		Person p2 = new Person("sin",22);
		File f1 = new File("temp1.txt");
		f1.createNewFile();

		//writing object to file
		try(var out = new ObjectOutputStream(
			new BufferedOutputStream(
				new FileOutputStream(f1))))
		{
			out.writeObject(p1);
			out.writeObject(p2);
		}

		//reading file to object
		//ArrayList<Person> pa = new ArrayList<Person>[2];
		try(var in = new ObjectInputStream(
			new BufferedInputStream(
				new FileInputStream(f1))))
		{
			while(true)
			{
				var obj = in.readObject();
				//pa.add((Person)obj);
				System.out.println(obj);
			}
			//p2 = (Person)in.readObject();
		}catch(Exception e){}

		//System.out.println(p2);

	}
}











