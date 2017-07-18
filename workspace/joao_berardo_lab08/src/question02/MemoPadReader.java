package question02;

import java.util.Scanner;

import javax.swing.JFileChooser;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * Read memos stored in a file
 *  
 * @author Joao Berardo
 * @since 1.0, July, 13 2017
 */
public class MemoPadReader
{
	/**
	 * Main method
	 * @param args not used
	 * @throws IOException
	 */
	public static void main(String[] args) throws IOException
	{
		Scanner console = new Scanner(System.in);
		File inFile = selectFile();
		Scanner in = new Scanner(inFile);

		boolean done = false;

		// read all lines
		while (in.hasNextLine() && !done)
		{
			String topic = in.nextLine();
			String dateStamp = in.nextLine();
			String message = in.nextLine();
	
			System.out.println(topic + "\n" + dateStamp + "\n" + message);
			
			// display the next memo (if exists)
			if (in.hasNext()) 
			{
				System.out.println("Do you want to read the next memo (y/n)?");
				String ans = console.nextLine();
				if (ans.equalsIgnoreCase("n"))
				{
					done = true;
				}
			}
		}
		
		in.close();
		console.close();
	}
	
	// create a dialog box so the user can choose a file to read
	private static File selectFile()
	{
		Scanner in = null;
		File selectedFile = null;
		JFileChooser chooser = new JFileChooser();

		if (chooser.showOpenDialog(null) == JFileChooser.APPROVE_OPTION)
		{
			selectedFile = chooser.getSelectedFile();

			try
			{
				in = new Scanner(selectedFile);
			}
			catch (FileNotFoundException e)
			{
				System.out.println("Error reading file.");
			}
			
			if (in != null)
			{
				in.close();
			}
		}
		
		if (selectedFile != null)
		{
			return selectedFile;
		}
		
		return null;
	}
}