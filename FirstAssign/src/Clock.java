/**
*The following Clock class returns the current time by using predefined Date Class methods
*@ author : TirumalaPravalika
*@assignment CSCI 559 Assignment 1
*@Date: 06/08/2017*/
import java.util.Date;
public class Clock {

	private int hours;
	private int minutes;
	public Clock(){
		hours=0;
		minutes=0;
	}
	public String getTime(){
		Date d=new Date();
		return " "+d.getHours()+":"+d.getMinutes();
	}
	public int getHours(){
	return 	hours; 
	}
	public int getMinutes(){
	return 	minutes;
	}
	
	public static void main(String[] args) {
		Clock c=new Clock();
		System.out.println("Current time is"+c.getTime());
		}
		
		
	}

