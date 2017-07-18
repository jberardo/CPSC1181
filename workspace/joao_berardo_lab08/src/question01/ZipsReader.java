package question01;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * Reads a file with State name, abbreviation and zip codes<br/>
 * Each line has a State and we parse each line to create a State object to print<br/>
 * 
 * @author Joao Berardo
 * @since 1.0, July, 11 2017
 */
public class ZipsReader
{
	// reg ex (digits)
	// 000-000
	final static String REG_EXP1 = "\\d{3}-\\d{3}";
	// 000
	final static String REG_EXP2 = "\\d{3}";
	
	/**
	 * Main method
	 * @param args not used
	 */
	public static void main(String[] args)
	{
		File inFile = new File("ziptable.txt");
		Scanner in = null;
		
		// list of State objects
		ArrayList<State> stateList = new ArrayList<State>();
		
		// try to read file and show message error if not found 
		try
		{
			in = new Scanner(inFile);
		}
		catch (FileNotFoundException e)
		{
			System.out.println("Error reading file ziptable.txt");
			System.exit(1);
		}
		
		// output beginning
		System.out.println("----- Contents of ziptable.txt -----");
				
		//read file line by line
		while (in.hasNextLine())
		{
			// create a State per line
			State state = new State();
			state = readLine(in.nextLine());
			// add state to list
			stateList.add(state);
		}
		
		// output
		// print all states in console
		for (State s : stateList)
		{
			System.out.println(s.toString());
		}
		
		// save formatted data in file
		exportData(stateList);
		
		// close scanner
		in.close();
	}
	
	// read a single line of the file and adjust the zip code
	// returns a State object with a formatted list of zip codes
	private static State readLine(String line)
	{
		// create a scanner object
		Scanner inputWord = new Scanner(line);
		// state name
		String name = "";
		// state abbv
		String abbreviation = "";
		// list of zip codes
		ArrayList<String> zipcodes = new ArrayList<String>();
		// create a new empty State object
		State state = new State();
		
		// read lines of input file
		while (inputWord.hasNext())
		{
			// check each word in line
			String temp = inputWord.next();
			
			// if word is length 2, it is a state abbv
			if (temp.length() == 2)
			{
				abbreviation = temp;
			}
			
			// length > 2 -> not abbv, can be state name or zi codes
			// check reg_ex to discard zip codes and get State name only
			if (temp.length() > 2 && !temp.matches(REG_EXP1) && !temp.matches(REG_EXP2))
			{
				name+= temp.trim() + " ";
			}
			
			// match only reg_ex1 (zip code already formated)
			if (temp.matches(REG_EXP1) && !temp.matches(REG_EXP2))
			{
				zipcodes.add(temp);
			}
			
			// zip code to format (match only reg_ex2)
			// add hyphen and repeat zip code
			if (temp.matches(REG_EXP2) && !temp.matches(REG_EXP1))
			{
				zipcodes.add(temp + "-" + temp);
			}
		}
		
		// add everything to State object and return
		state.setAbbreviation(abbreviation);
		state.setName(name.trim());
		state.addZipCode(zipcodes);
		inputWord.close();
		
		return state;
	}
	
	// Export the zip code list to a output file
	private static void exportData(ArrayList<State> list)
	{
		PrintWriter out = null;
		
		try
		{
			out = new PrintWriter("output.txt");
		}
		catch (FileNotFoundException e)
		{
			System.out.println("Error writing to file output.txt");
		}
		
		// save States in output file
		// format: NAME:ABBV:[ZIP_CODES_1, ZIP_CODES_N]
		for (State s : list)
		{
			out.println(s.getName() + ":" + s.getAbbreviation() + ":" + s.getZipCode());
		}
		
		// close stream
		out.close();
	}
}