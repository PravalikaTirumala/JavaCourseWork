/**Following Clock class returns current time using calender class
 * *@author Pravalika Tirumala
 * @Assignment CSCI 559 Assignment 1
 */
package FirstClass;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class Clock {
	public int getHours(){
		Calendar calendar = calculateCurrentTime(); 
		return calendar.get(Calendar.HOUR_OF_DAY);
	}
public int getMinutes(){
	Calendar calendar = calculateCurrentTime(); 
	return calendar.get(Calendar.MINUTE);
	}
public String getTime(){
	return "" + getHours() + ":" + getMinutes();
	}

private Calendar calculateCurrentTime() 
{
Date date = new Date();
	
//Calendar calendar1 = GregorianCalendar.getInstance(); 
Calendar calendar1=new GregorianCalendar();
calendar1.setTime(date);
return calendar1;	
}
}
