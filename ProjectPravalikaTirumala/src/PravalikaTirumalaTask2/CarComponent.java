package PravalikaTirumalaTask2;
import java.applet.Applet;
import java.awt.Graphics; 
import java.awt.Graphics2D;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JLabel; 

/** 8
This component draws two car shapes. 9
*/ 
public class CarComponent extends JComponent implements Runnable{
	private JLabel object;
	private JFrame frame;
	private Lock mylock;
	

	public CarComponent(){
		
		mylock=new ReentrantLock();
		
	}
	public void paintComponent(Graphics g){
		 super.paintComponent(g); 
		
		Graphics2D g2 = (Graphics2D)g;
		Car car1 = new Car(0,0);
		int x= getWidth() - 65;
		int y=getHeight() - 35;
		
		Car car2=new Car(x,y);
		car1.draw(g2);
		car2.draw(g2);	
		
		//repaint();
	}
	//add statements and methods

	@Override
	public void run() {
		// TODO Auto-generated method stub
		try{
			while(true){
				mylock.lock();
				move();
				mylock.unlock();
				Thread.sleep(1000);
			}
		}
		catch(InterruptedException e){
			System.out.println(e);
			mylock.unlock();
		}
	}
	private void move() {
		// TODO Auto-generated method stub
		int x=(int)(Math.random()*frame.getContentPane().getWidth());
		int y=(int)(Math.random()*frame.getContentPane().getHeight());
		
		if((x+object.getWidth())>=frame.getContentPane().getWidth())
			x=(int)(frame.getContentPane().getWidth()-object.getWidth());
		
		if((y+object.getHeight())>=frame.getContentPane().getHeight())
			y=(int)(frame.getContentPane().getHeight()-object.getHeight());
		
		object.setLocation(x, y);
		//setLocation(x, y);
		//repaint();
	}
	
}