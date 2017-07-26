import java.io.File;

import org.apache.pdfbox.ExtractText;
import org.apache.pdfbox.pdfparser.PDFParser;


public class PDFReaderApplication
{

	public static void main(String[] args)
	{
		String fileName  = "";
		File f = new File(fileName);
		String textFile = "";
		String pdfFile = f.getAbsolutePath();
		textFile = textFile + "txt";

		try
		{
		    ExtractText.main(new String[]{pdfFile, textFile});
		}
		catch(Exception e)
		{
		    //System.out.println( "Error processing " + pdfFile + e.getMessage() );
			System.out.println( "Error");
		}
	}
}