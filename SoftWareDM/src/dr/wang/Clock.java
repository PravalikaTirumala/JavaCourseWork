
import java.util.Date;

public class Clock {
	
	private int hours;
	private int minutes;

	public static void main(String[] args)
	{
		Clock myclock= new Clock();
		
		myclock.getCurrentTime();
	}
	
	public Clock()
	{
		hours=0;
		minutes=0;
		
		
	}
	public void getCurrentTime()
	{
		Date date = new Date();

	      // display time and date using toString()
	      System.out.println(date.toString());
	}
	public String getTime()
	{
		return "";
	}
	
	public int getHours()
	{
		return hours;
	}
	
	public int getMinutes(){
		return minutes;
	}
	
}
