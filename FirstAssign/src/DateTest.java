import java.util.Date;
import java.util.Calendar;
import java.text.SimpleDateFormat;
public class DateTest {

	public static void main(String[] args) {
Date d=new Date();
System.out.println(d.toString());
System.out.println(d);
SimpleDateFormat sdf=new SimpleDateFormat("E, y-MM-dd 'at' hh:mm:ss a z");
System.out.println(sdf.format(d));
	}
}
