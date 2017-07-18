package io.joca.java.helpers;

import java.io.BufferedReader;
import java.io.IOException;

/**
 * Helper class for I/O operations
 * 
 * @author Joao Berardo
 * @since 1.0, July, 17 2017
 */
public class IOHelper
{
	  public static final String homeDir = System.getProperty("user.home");
	  public static final String osName = System.getProperty("os.name");
	  public static final String[] badFileNameCharacters = new String[]{"\\", "/", ":", "*", "?", "\"", "<", ">", "|"};
	  
	  public static String makeFilenameSafe(String string, String replace)
	  {
		  if (replace == null)
		  {
			  replace = "";
		  }
		  else
		  {
			  replace = StringHelper.replaceInString(replace, "", badFileNameCharacters);
		  }
		  
		  return StringHelper.replaceInString(string, replace, badFileNameCharacters);
	  }
	  
	public static boolean hasBadFileNameCharacters(String string)
	{
		for (String badChar : badFileNameCharacters)
		{
			if (string.contains(badChar))
			{
				return true;
			}
		}
		
		return false;
	}
	
	public static String fileToString(String fileLocation) throws IOException
	{
		// BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream(fileLocation), "UTF-8"));
		// return readerToString(bufferedReader);
		return "";
	}
}