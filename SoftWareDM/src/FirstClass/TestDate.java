/**Following class TestDate is the main class that prints current zone time and Newyork time
 * with the returned values from Clock and WorldClock classes
 * *@author Pravalika Tirumala
 * @Assignment CSCI 559 Assignment 1
 */
package FirstClass;

public class TestDate {
	
	public  static void main(String[] args) {
		Clock clock = new Clock();
		System.out.println("Current timezone hours is " + clock.getHours() );
		 
		System.out.println(	"Current timezone minutes is " + clock.getMinutes());
		System.out.println(	"The current time in this timezone " + clock.getTime());
System.out.println();
		WorldClock worldClock = new WorldClock(1);
		System.out.println("Time in current timezone is " + worldClock.getCurrentTimezoneTime());
		System.out.println("Time in NewYork is " + worldClock.getOtherTimezoneTime());
		System.out.println();
		
		/*long epoch = System.currentTimeMillis();

		System.out.println("Epoch : "+ epoch);*/
	}
}
