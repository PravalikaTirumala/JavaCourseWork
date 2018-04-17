/**Following WorldClock class returns current time and Newyork time by using Clock class
 * *@author Pravalika Tirumala
 * @Assignment CSCI 559 Assignment 1
 */
package FirstClass;
public class WorldClock {

	private String currentTimezoneTime;
	private String otherTimezoneTime;
	
	public WorldClock(int offsetHours){
		Clock clock = new Clock();
		
		currentTimezoneTime = clock.getTime();
		//int otherTimezoneHours = clock.getHours() + offsetHours;
	//	otherTimezoneTime = otherTimezoneHours + ":" + clock.getMinutes();
		otherTimezoneTime=(clock.getHours() + offsetHours)+":"+clock.getMinutes();
	}

	public String getCurrentTimezoneTime() {
		return currentTimezoneTime;
	}

	public void setCurrentTimezoneTime(String currentTimezoneTime) {
		this.currentTimezoneTime = currentTimezoneTime;
	}

	public String getOtherTimezoneTime() {
		return otherTimezoneTime;
	}

	public void setOtherTimezoneTime(String otherTimezoneTime) {
		this.otherTimezoneTime = otherTimezoneTime;
	}

}
