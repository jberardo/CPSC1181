package test;

import javax.swing.JFrame;

/**
 * 
 * @author Joao Berardo
 * @since June 27, 2017
 * @version 1.0
 *
 */
public class CarViewer {
	public static void main(String[] args)
	{
		JFrame frame = new JFrame();
		CarComponent component = new CarComponent();
		
		frame.setSize(300, 400);
		frame.setTitle("Two cars");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		

		frame.add(component);
		frame.setVisible(true);
	}
}
