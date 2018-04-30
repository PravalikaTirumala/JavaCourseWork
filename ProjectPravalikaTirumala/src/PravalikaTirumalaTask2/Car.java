package PravalikaTirumalaTask2;

import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;
import java.awt.geom.Point2D;
import java.awt.geom.Rectangle2D;
 
public class Car {
    private int xLeft, yTop;
     
    /**
     * Constructs a car with a given top left corner 
     * @param x the x coordinate of the top left corner
     * @param y the y coordinate of the top left corner
     */
    public Car(int x, int y) {
        xLeft = x;
        yTop = y;
    }
    public void draw(Graphics2D g2){
    	// building the rectangle part of the car - Rectangle class
    	//we can create object and can pass the same to draw() or can directly instantiate as a parameter
    	g2.draw(new Rectangle2D.Double(xLeft,yTop+10,60,10));
    	
    	//drawing wheels front and back - need Ellipse class
    	g2.draw(new Ellipse2D.Double(xLeft+10, yTop+20,10,10)); 
    	g2.draw(new Ellipse2D.Double(xLeft+42, yTop+20, 10, 10));
    	
    	//for the top part of the car- Point class and Line class 
    	//we need 4 points and 3 lines 
    	//consider pt1 pt2 pt3 and p4 from front side of the car
    	
    	Point2D.Double pt1 = new Point2D.Double(xLeft+45, yTop+10);
    	Point2D.Double pt2 = new Point2D.Double(xLeft+40, yTop+2 );
    	Point2D.Double pt3 = new Point2D.Double(xLeft+20,yTop+2 );
    	Point2D.Double pt4 = new Point2D.Double(xLeft+15, yTop+10);
    	
    	//join the points
    	g2.draw(new Line2D.Double(pt1, pt2));
    	g2.draw(new Line2D.Double(pt2,pt3));
    	g2.draw(new Line2D.Double(pt3, pt4));
    	
    	
    	
    }
}
     
   