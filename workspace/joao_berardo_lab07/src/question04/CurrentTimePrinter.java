package question04;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;

/**
 * 
 * 
 * @author Joao Berardo
 * @since 1.0, July, 09 2017
 */
public class CurrentTimePrinter implements ActionListener
{
	/**
	 * 
	 */
	@Override
	public void actionPerformed(ActionEvent e)
	{
		System.out.println(new Date());
	}
}