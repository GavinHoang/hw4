//package hw4Myversion;

import java.awt.Color;
import java.awt.Component;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.geom.Rectangle2D;

import javax.swing.Icon;


public class Bar implements Icon, ActionListener{
	
	private double length;
	private Model model;
    
    public Bar() {  	this.length = model.value; }// or model.getValue(); 
   
	@Override
	public void paintIcon(Component c, Graphics g, int x, int y) {
			// TODO Auto-generated method stub	
			Graphics2D g2 = (Graphics2D) g;
	        g2.setColor(Color.red);
	        double barHeight = 10; // just a random number 10 here
	        double barLength = 10 * length;
	        Rectangle2D.Double rectangle = new Rectangle2D.Double(5, barLength / 10, barLength, barHeight);      
	        g2.fill(rectangle);
	       
		}

	@Override
	public int getIconHeight() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int getIconWidth() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		
	}
	
}
