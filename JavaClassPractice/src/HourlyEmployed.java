
public class HourlyEmployed extends Employee{

	private double hourlyRate;
	
	public HourlyEmployed(){
		hourlyRate=0;
	}
	
	public HourlyEmployed(int myHours, double myRate){
		//setHours()
		//Employee e;
		
		//myHours=e.hours;, it needs to be a protected variable
		hourlyRate=myRate;
	}
	public double getWages(){
		return hourlyRate;
	}
	public void setWages(double myWage){
		hourlyRate=myWage;
	}
	
	
}
