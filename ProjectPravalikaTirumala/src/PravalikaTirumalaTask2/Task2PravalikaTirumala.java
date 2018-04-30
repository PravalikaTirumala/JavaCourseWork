package PravalikaTirumalaTask2;
import java.awt.EventQueue;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

import javax.swing.JFrame; 


public class Task2PravalikaTirumala {
	private JFrame frame;
	public Lock mylock;
	public static void main(String[] args){
	
		
	//	frame.setVisible(true);

		// add statements below 
		EventQueue.invokeLater(new Runnable(){
			public void run(){
				try{
					Task2PravalikaTirumala window = new Task2PravalikaTirumala();
					window.frame.setVisible(true);
					window.startAnimation();
					}catch(Exception e){
						e.printStackTrace();
					}
			}
		});
		
		}
	
	protected void startAnimation() {
		// TODO Auto-generated method stub
		CarComponent c1=new CarComponent();
		CarComponent c2=new CarComponent();
		
		Thread t1=new Thread(c1);
		Thread t2=new Thread(c2);
		
		t1.start();
		t2.start();
	}

	public Task2PravalikaTirumala(){
		initialize();
		mylock =new ReentrantLock();
	}

	private void initialize() {
		// TODO Auto-generated method stub
		frame = new JFrame(); 
		final int FRAME_WIDTH = 600; 
		final int FRAME_HEIGHT = 400;
		frame.setSize(FRAME_WIDTH, FRAME_HEIGHT);
		frame.setTitle("Two cars"); 
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
		CarComponent component = new CarComponent(); 
		frame.add(component);
	}
			
}
