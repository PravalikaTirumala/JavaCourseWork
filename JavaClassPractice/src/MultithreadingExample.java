
import java.util.Date;
public class MultithreadingExample implements Runnable{

	private String message;
	private int counter;
	private int delay;
	
	
	/*public MultithreadingExample(){
		
	}*/
	
	public MultithreadingExample(String str, int count, int del){
		message=str;
		counter=count;
		delay=del*1000;
	}
	
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		//construct a date object, if we write this here then both the threads uses the same current time stamp
		//Date date=new Date();
		for(int i=0;i<counter;i++){
			//uss diff time stamps
			Date date=new Date();
			System.out.println("time stamp: "+  date+ " "+message);
			
			try {
				//to wait for the mentioned time
				//sleep generates interrupted exception
				Thread.sleep(delay);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		
		
		
	}

	
}
