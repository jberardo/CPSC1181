package question04;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;
import java.util.Timer;

/**
 * Pprints the current time
 * 
 * @author Joao Berardo
 * @since 1.0, July, 09 2017
 */
public class CurrentTimePrinter implements ActionListener
{
	public void actionPerformed(ActionEvent e)
	{
		System.out.println(new Date());
	}
}