
public class Car {

	private String make;
	private int speed;

	public Car(){
	make="";
	speed=0;
	}
	public Car(String make1,int speed1){
		make=make1;
		speed=speed1;
		}
	public void move(){
	System.out.println("move");
	}
	
	public void setSpeed(int mSpeed){
		speed=mSpeed;
	}
	//mutator - helps to change the values
	public void getSpeed(){
		System.out.println("speed :"+ speed);
	}
	public void setMake(String make){
		this.make=make;
	}
	/*public String getMake(){
		System.out.println("  ");
	}
	public String toString(){
		return getMake()+" "+getSpeed();
	}*/
	
}
