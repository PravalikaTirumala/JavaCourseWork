/**
 * Pravalika Tirumala
 * CSCI 531 - final project Task 1a
 * (a) Write a GUI program that produces the house shown in Figure 1. Save the file as 
 * Task1aGUIFirstnameLastname.java.
 */

import java.awt.*;
import javax.swing.*;

public class Task1aGUIPravalikaTirumala  extends JPanel{
	
	public static void main(String [] args){
	
	JFrame jframe=new JFrame();
	jframe.getContentPane().add(new Task1aGUIPravalikaTirumala());
	jframe.setSize(400,450);
	jframe.setVisible(true);
	//jframe.setBackground(Color.pink);
	jframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	
	}
	
	public void paint(Graphics g){	
		setBackground(Color.pink);
		//g.drawLine(100, 120, 147, 106);
		//calling super class - JFrame paint method
		super.paint(g);
		
		//boundary
		int xout_bound[]={30,90,220,220,240,204,60,30};
		int yout_bound[]={320,330,260,136,125,64,140,190};
		g.drawPolygon(xout_bound, yout_bound,8 );
		
		//door
		int xdoor[]={20,50,50,70,70,45};
		int ydoor[]={360,320,250,260,325,360};
		g.drawPolyline(xdoor, ydoor, 6);
		
		//window
		int xwin[]={140,180,180,140};
		int ywin[]={220,200,240,260};
		g.drawPolygon(xwin, ywin, 4);
		g.drawLine(140, 240, 180, 220);
		g.drawLine(160, 210, 160, 250);
		
		//top poly
		int xtop_rect[]={140,140,156,156};
		int ytop_rect[]={120,97,77,110};
		g.drawPolyline(xtop_rect, ytop_rect, 4);
				
		
		//joining lines
		g.drawLine(60,140,100,200);
		g.drawLine(90,330,90,187);
		g.drawLine(100,200,220,136);
		g.drawLine(30, 190, 25, 202);
				
		//circle
		g.drawOval(57, 180, 15, 15);		
				
		//top oval
		g.drawOval(175, 55, 30, 30);
			
		//oval lines
		g.drawLine(190,69,206,51);
		g.drawLine(190,69,190,95);
	}
	
}

