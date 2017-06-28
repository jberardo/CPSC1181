package test;

import javax.swing.JFrame;

/**
 * 
 * @author Joao Berardo
 * @since June, 27 2017
 * @version 1.0
 *
 */
public class FaceViewer {
	public static void main(String[] args)
	{
		JFrame frame = new JFrame();
		frame.setSize(150, 250);
		frame.setTitle("An Alien Face");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		FaceComponent component = new FaceComponent();
		frame.add(component);
		frame.setVisible(true);
	}
}