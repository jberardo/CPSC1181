package test;

import javax.swing.JFrame;

public class RectangleViewer {
	public static void main(String[] args)
	{
		JFrame frame = new JFrame();
		RectangleComponent rec = new RectangleComponent(100, 100, 400, 400);
		//RectangleComponent rec2 = new RectangleComponent(50, 50, 100, 100);
		
		frame.setSize(800, 800);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setTitle("Rectangles");
		frame.add(rec);
		//frame.add(rec2);
		frame.setVisible(true);
		
		System.out.println(rec.toString());
		//System.out.println(rec2.toString());
	}
}