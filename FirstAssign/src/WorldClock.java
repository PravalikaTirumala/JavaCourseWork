/**
*The following WorldClock class prints local time and Newyork time by using predefined
*date class methods
*@ author : TirumalaPravalika
*@assignment CSCI 559 Assignment 1
*@Date: 06/08/2017*/

import java.util.Date;
public class WorldClock {
	
	private int hours;
	private int minutes;
	private int ofs;
	Date d=new Date();
	public WorldClock(){ //default constructor
		hours=0;
		minutes=0;
		}
	public WorldClock(int offset){//constructor taking offset as an argument
		hours=0;
		ofs=offset;
		minutes=0;
		}
	public int getHours(){
	return 	hours;
	}
	public int getMinutes(){
	return 	minutes;
	}
	public void getTimeCurr(){
		int min=d.getMinutes();
			if (min % 10 == 0) {
				min = 0 + min;
            	}
		System.out.println("Time in Texas is" + " : " +d.getHours()+":"+min);
		}
	public void getTimeNewY(){
		int min=d.getMinutes();
		if (min % 10 == 0) {
			min = 0 + min;
        	}
		System.out.println("Time in NewYork is"+" : "+ (d.getHours()+ofs)+":"+min);
		}
	public static void main(String[] args) {
		
		WorldClock wc=new WorldClock();
		WorldClock wc1=new WorldClock(1);
		
		wc.getTimeCurr();
		wc1.getTimeNewY();}		
	
}
