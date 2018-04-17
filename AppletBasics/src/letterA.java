import java.awt.*;
import java.applet.*;

public class letterA extends Applet{
	/*int []x = {20,20,30,40,40};
	int []y = {40,20,30,20,40};
	
	public void init(){
		
	}
	public void paint(Graphics g){
		g.drawPolygon(x, y, 5);
		g.fillPolygon(x, y, 5);
	}*/
	
	int [] x={20,40,44,56,60,80,60,40};
	int [] y={60,60,40,40,60,60,20,20};
	
	public void init(){
		
	}
	public void paint(Graphics g){
	g.drawPolygon(x,y,8);	
	}
		
}
