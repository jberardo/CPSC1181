package question04;

import java.util.Date;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import javax.swing.Timer;

/**
 * 
 * 
 * @author Joao Berardo
 * @since 1.0, July, 09 2017
 */
public class TimerDemo
{
	//
	static ActionListener listener;
	static ActionListener listener2;
	static Timer t;
	Timer t2;
	
	/**
	 * Main method
	 * @param args not used
	 */
	public static void main(String[] args)
	{
		/**
		 * 
		 * 
		 * @author Joao Berardo
		 * @since 1.0, July, 09 2017
		 */
		class CurrentTimePrinter implements ActionListener
		{
			/**
			 * 
			 */
			@Override
			public void actionPerformed(ActionEvent e)
			{
				Timer t = new Timer(1000, listener);
				t.start();
				
				System.out.println(new Date());
			}
		}
		
		/**
		 * 
		 * 
		 * @author Joao Berardo
		 * @since 1.0, July, 09 2017
		 */
		class TimerToggler implements ActionListener
		{
			/**
			 * 
			 */
			@Override
			public void actionPerformed(ActionEvent event)
			{
				Timer t2 = new Timer(15000, listener2);
				t2.start();
				
				if (t.isRunning())
				{
					t.stop();
					System.out.println(new Date() + ": Listener 2 Stopped");
				}
				else
				{
					t.restart();
					System.out.println(new Date() + ": Listener 2 Restarted");
				}
			}
		}

		//
		listener = new CurrentTimePrinter();
		listener2 = new TimerToggler();

		//
		while (true)
		{
			JOptionPane.showMessageDialog(null, "Quit?");
			System.exit(0);
		}
	}
}