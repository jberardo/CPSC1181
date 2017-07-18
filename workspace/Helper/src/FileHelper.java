import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;

/**
 * 
 * @author joca
 *
 */
public class FileHelper
{
	   // System.getProperty("line.separator"); 
       // make sure we get the right newline (for any OS)
	  public static final String NEW_LINE = System.getProperty("line.separator");
	  // home directory
	  public static final String HOME = System.getProperty("user.home");
	  // OS name
	  public static final String OS = System.getProperty("os.name");
	  
	  /**
	   * Takes the file and returns it in a string. Uses UTF-8 encoding
	   *
	   * @param fileLocation
	   * @return the file in String form
	   * @throws IOException when trying to read from the file
	   */
	  public static String fileToString(String fileLocation) throws IOException
	  {
	    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream(fileLocation), "UTF-8"));
	    return readerToString(bufferedReader);
	  }
	  
	/**
	* Returns all the lines in the Reader's stream as a String
	*
	* @param reader
	* @return
	* @throws IOException when trying to read from the file
	*/
	public static String readerToString(BufferedReader reader) throws IOException
	{
		StringBuilder stringBuilder = new StringBuilder();
		String readLine;
	  
		while ((readLine = reader.readLine()) != null)
		{
			stringBuilder.append(readLine).append(NEW_LINE);
		}
	    
		reader.close();
		return stringBuilder.toString();
	}
	  
	  /**
	   * Copies the given source to the given destination. Does not check whether the destination exists.
	   *
	   * @param sourceFilepath
	   * @param outputFile
	   * @throws FileNotFoundException
	   * @throws IOException
	   */
	  public static void copyFile(File sourceFile, File outputFile) throws FileNotFoundException, IOException
	  {
	    InputStream inputStream = new FileInputStream(sourceFile);
	    saveInputStream(inputStream, outputFile);
	  }
	  
	  /**
	   * Saves the given InputStream to a file at the destination. Does not check whether the destination exists.
	   *
	   * @param inputStream
	   * @param destination
	   * @throws FileNotFoundException
	   * @throws IOException
	   */
	  public static void saveInputStream(InputStream inputStream, File outputFile) throws FileNotFoundException, IOException
	  {
	    int size = 4096;
	    OutputStream out = new FileOutputStream(outputFile);
	    byte[] buffer = new byte[size];
	    int length;

	    while ((length = inputStream.read(buffer)) > 0)
	    {
	      out.write(buffer, 0, length);
	    }
	    
	    out.close();
	    inputStream.close();
	  }
}