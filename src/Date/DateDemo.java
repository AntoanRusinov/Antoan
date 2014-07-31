package Date;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateDemo {
	public static void main(String[] args) {

		Date date = new Date();
		System.out.println(date.toString());
		date.getTime();

		SimpleDateFormat sdf = new SimpleDateFormat(
				"E dd.MM.yyyy 'at' kk:mm:ss ");
		System.out.println(sdf.format(date));

	}
}
