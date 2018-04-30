/**
 * Pravalika Tirumala
 * CSCI 531 - final project Task 1b : (b) Modify the applet created in Task1(a) by adding a color menu to change the
	color of the background color of the application  Save the file as Task1bmenuFirstnameLastname.java.
 * 
 */
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.*;

public class Task1bmenuPravalikaTirumala extends Frame implements ActionListener {
		/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
		
		Menu bck_color;
		MenuBar menubar;
		
		//constructor
	  	public Task1bmenuPravalikaTirumala()
		{			
		menubar=new MenuBar(); 			  //menu bar creation
		setMenuBar(menubar);				  //adding menu bar to the frame
		bck_color=new Menu("color");  //creating menus
		menubar.add(bck_color);			  //adding menu to menu bar
		
			bck_color.addActionListener(this);
			bck_color.add(new MenuItem("Red"));
		    bck_color.add(new MenuItem("Blue"));
		    bck_color.add(new MenuItem("Green"));
		    bck_color.add(new MenuItem("Yellow"));
		    bck_color.add(new MenuItem("Black"));
		    bck_color.add(new MenuItem("Pink"));
		    bck_color.add(new MenuItem("Cyan"));
		    bck_color.add(new MenuItem("Magenta"));
		    bck_color.add(new MenuItem("Random"));
	   	// adding ActionListener for event handling
	        
	  }
	  	@Override
	  	public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			String str = e.getActionCommand();
			if(str=="Red"){
				setBackground(Color.red);
			}
			if(str=="Blue"){
				setBackground(Color.blue);
			}
			if(str=="Green"){
				setBackground(Color.green);
			}
			if(str=="Yellow"){
				setBackground(Color.yellow);
			}
			if(str=="Black"){
				setBackground(Color.black);
			}
			if(str=="Pink"){
				setBackground(Color.pink);
			}
			if(str=="Cyan"){
				setBackground(Color.cyan);
			}
			if(str=="Magenta"){
				setBackground(Color.magenta);
			}
			if(str=="Random"){
				Random r=new Random();
				int red_c = r.nextInt(255);
				int green_c =r.nextInt(255);
				int blue_c=r.nextInt(255);
				Color c=new Color(red_c,green_c,blue_c);
				setBackground(c);
			}
		}
		public static void main(String [] args){
		
			Task1bmenuPravalikaTirumala p=new Task1bmenuPravalikaTirumala();
			p.setSize(400, 450);
			p.setVisible(true);
			p.setTitle("House");
		
		}
			
		
		public void paint(Graphics g){	
			
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
