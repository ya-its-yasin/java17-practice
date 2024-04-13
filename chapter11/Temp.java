import java.text.NumberFormat;
import java.text.DecimalFormat;

import java.util.Date;
import java.time.format.DateTimeFormatter;
import java.time.LocalDateTime;
import java.util.Locale;
import java.util.ResourceBundle;
class Temp
{
	public static void main(String as[])
	{
		/*double d = 1234.567;
		NumberFormat f1 = new DecimalFormat("Your balance is $######.0000");
		System.out.println(f1.format(d));

		NumberFormat f2 = new DecimalFormat("Your balance is $00000.###");
		System.out.println(f2.format(d));
		*/

		var dt = LocalDateTime.of(2023, 4, 20,6,15,30);

		var f1 = DateTimeFormatter.ofPattern("M/d/y 'hello' hh:mm:ss");
		System.out.println(dt.format(f1));

		Locale l = Locale.getDefault();
		//System.out.println(l);

		Locale l1 = new Locale.Builder().setRegion("US").setLanguage("tm").build();
		//Locale.setDefault(l1);
		//System.out.println(Locale.getDefault());

		//System.out.println(ResourceBundle.getBundle("Zoo").getString("hello"));
	}
}













