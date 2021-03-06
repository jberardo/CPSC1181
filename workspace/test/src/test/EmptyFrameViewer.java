package test;

import javax.swing.JFrame;
public class EmptyFrameViewer
{
	public static void main(String[] args)
	{
		JFrame frame1 = new JFrame();
		JFrame frame2 = new JFrame();
		frame1.setSize(300, 400);
		frame1.setTitle("An Empty Frame");
		frame1.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		frame1.setVisible(true);
		
		frame2.setSize(800, 800);
		frame2.setTitle("An Bigger Empty Frame");
		frame2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame2.setVisible(true);
	}
}