/**
 * (a) Write a GUI program that produces the house shown in Figure 1. Save the le
as Task1aFirstnameLastname.java.
 */


import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JFrame;

import java.applet.*;

public class Task1cPravalikaTirumala extends Applet implements ActionListener  {
	
	
	int xout_bound[]={30,90,220,220,240,204,60,30};
	int yout_bound[]={320,330,260,136,125,64,140,190};
	
	int xdoor[]={20,50,50,70,70,45};
	int ydoor[]={360,320,250,260,325,360};
	
	int xwin[]={140,180,180,140};
	int ywin[]={220,200,240,260};
	
	int xtop_rect[]={140,140,156,156};
	int ytop_rect[]={120,97,77,110};
	
	Frame frame=new JFrame();
	MenuBar menubar;
	Menu bck_color;
	
	
	public void init(){
		/*
		 * applet is always contained with in some frame on the browsers window but it is not the subclass of frame. 
		 * Hence,  cannot contain a menu bar. To get the menubar, starting with the applet repeatedly ask for its 
		 * container object until you get the one that is a subclass of Frame ( Component.getParent() method) */
		
		
		 Component c = this;
         while (c != null && !(c instanceof Frame)) {
                 c = c.getParent();
         }
           
		menubar =new MenuBar(); 			  //menu bar creation
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
		    // type cast is required	
		    ((Frame)c).setMenuBar(menubar);
	}
	public void paint(Graphics g){
		
		//boundary
		g.drawPolygon(xout_bound, yout_bound,8 );
		
		//door
		g.drawPolyline(xdoor, ydoor, 6);
		
		//window
		g.drawPolygon(xwin, ywin, 4);
		g.drawLine(140, 240, 180, 220);
		g.drawLine(160, 210, 160, 250);
		
		//joining lines
		g.drawLine(60,140,100,200);
		g.drawLine(90,330,90,187);
		g.drawLine(100,200,220,136);
		g.drawLine(30, 190, 25, 202);
		
		//circle
		g.drawOval(57, 180, 15, 15);
		
		//top poly
		g.drawPolyline(xtop_rect, ytop_rect, 4);
		
		//top oval
		g.drawOval(175, 55, 30, 30);
		
		//oval lines
		g.drawLine(190,69,206,51);
		g.drawLine(190,69,190,95);
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
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
}
