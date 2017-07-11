package question04;

import java.util.Date;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import javax.swing.Timer;

/**
 * Program that print the current date each second
 * 
 * @author Joao Berardo
 * @since 1.0, July, 09 2017
 */
public class TimerDemo
{
	// class variables (timers)
	static ActionListener listener;
	static Timer t;
	//	static ActionListener listener2;
//	static Timer t2;
	
	/**
	 * Main method
	 * @param args not used
	 */
	public static void main(String[] args)
	{
		// create new CurrentTimePrinter object
		listener = new CurrentTimePrinter();

		// create and start timer (1000 = 1 sec)
		t = new Timer(1000, listener);
		t.start();

		//listener2 = new TimerToggler();
		
		// loop until user clicks 'OK' button
		while (true)
		{
			JOptionPane.showMessageDialog(null, "Quit?");
			System.exit(0);
		}
	}
//		/**
//		 * 
//		 * 
//		 * @author Joao Berardo
//		 * @since 1.0, July, 09 2017
//		 */
//		class CurrentTimePrinter implements ActionListener
//		{
//			/**
//			 * 
//			 */
//			@Override
//			public void actionPerformed(ActionEvent e)
//			{
//				Timer t = new Timer(1000, listener);
//				t.start();
//				
//				System.out.println(new Date());
//			}
//		}
//		
//		/**
//		 * 
//		 * 
//		 * @author Joao Berardo
//		 * @since 1.0, July, 09 2017
//		 */
//		class TimerToggler implements ActionListener
//		{
//			/**
//			 * 
//			 */
//			@Override
//			public void actionPerformed(ActionEvent event)
//			{
//				Timer t2 = new Timer(2000, listener2);
//				t2.start();
//				
//				if (t.isRunning())
//				{
//					t.stop();
//					System.out.println(new Date() + ": Listener 2 Stopped");
//				}
//				else
//				{
//					t.restart();
//					System.out.println(new Date() + ": Listener 2 Restarted");
//				}
//			}
//		}
}