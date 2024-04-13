import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
class Temp2
{
	public static void main(String as[])
	{
		LocalDate date = LocalDate.parse("2022-04-30",
		 DateTimeFormatter.ISO_LOCAL_DATE_TIME);
		System.out.println(date.getYear());
	}
}