package test;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;

import javax.swing.JComponent;

/**
 * A component that draws two rectangles
 * 
 * @author Joao Berardo
 * @version 1.0
 * @since June 27, 2017
 *
 */
public class RectangleComponent extends JComponent {
	private int x;
	private int y;
	private int width;
	private int length;
	
	public RectangleComponent(int newX, int newY, int newWidth, int newLength)
	{
		this.x = newX;
		this.y = newY;
		this.width = newWidth;
		this.length = newLength;
	}
	
	public void paintComponent(Graphics g)
	{
		//Drawing instructions go here
		
		// Recover Graphics2D
		Graphics2D g2 = (Graphics2D) g;
		// Construct a rectangle and draw it
		Rectangle box = new Rectangle(this.x, this.y, this.width, this.length);
		g2.draw(box);
		
		// Move rectangle 15 units to the right and 25 units down
		box.translate(15, 25);
		// Draw moved rectangle
		g2.draw(box);
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public int getLength() {
		return length;
	}

	public void setLength(int length) {
		this.length = length;
	}
	
	public String toString()
	{
		String output = "";
		output += "RectangleComponent [X:" + this.x;
		output += ",Y:" + this.y;
		output += ",Width:" + this.width;
		output += "Length:" + this.length;
		return output;
	}
}