import java.awt.*;
import java.applet.*;

public class SimpleShapesRectSquare extends Applet{
	//for initializing the components that we use in the program
	public void init(){
		
	}
	//for drawing
	public void paint(Graphics g){
	
	g.setColor(Color.red);
	//g.drawRect(20, 20, 100, 50);
	g.fillRect(20, 20, 100, 50);
	
	g.setColor(Color.MAGENTA);
	g.fillOval(50, 30, 50, 50);
	
	}
}
