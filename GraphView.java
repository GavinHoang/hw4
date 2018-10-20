package hw4AnotherVersion;

import java.awt.Color;
import java.awt.Component;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Rectangle2D;

import javax.swing.Icon;


public class GraphView implements Icon {

	//constructor
	public GraphView()
	{
		size = 0;
		color = Color.red; 
	}

	public void setLength(int l)
	{
		size = l;
	}
	
	@Override
	public int getIconHeight() {
		// TODO Auto-generated method stub
		return size; // since it is circle icon, height = width
	}

	@Override
	public int getIconWidth() {
		// TODO Auto-generated method stub
		return size;
	}
	
	public void setColor(Color color)
	{
		this.color = color;
	}

	@Override
	public void paintIcon(Component c, Graphics g, int x, int y) {
		// TODO Auto-generated method stub
	
		x = 10;
		y += 5;
		Graphics2D g2 = (Graphics2D) g;
		Rectangle2D.Double planet = new Rectangle2D.Double(5, 5, size, 30); // first size is the horizontal length, second is the vertical height
		g2.setColor(color); // initial red
		g2.fill(planet);
		
	}

	private int size;
	private Color color;
}

