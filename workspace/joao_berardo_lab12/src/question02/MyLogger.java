package question02;

import java.io.IOException;
import java.util.logging.FileHandler;
import java.util.logging.Formatter;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

/**
 * 
 * @author Joao Berardo
 *
 */
public class MyLogger
{
	static private FileHandler accessLog;
    static private SimpleFormatter accessFormatter;
    
	static private FileHandler errorLog;
    static private SimpleFormatter errorFormatter;

    static private FileHandler fileHTML;
    static private Formatter formatterHTML;
    
    static public boolean formatHtml;
    
    Logger logger;

    //static public void setup() throws IOException {
    public MyLogger() throws IOException
    {
    	// do not format HTML
    	formatHtml = false;
    	    	
        // get the global logger to configure it
        logger = Logger.getLogger(Logger.GLOBAL_LOGGER_NAME);

        // true - show messages on console
        // false - suppress message on console
        logger.setUseParentHandlers(false);

        logger.setLevel(Level.INFO);
        accessLog = new FileHandler("access.log", true);
        errorLog = new FileHandler("error.log", true);
        fileHTML = new FileHandler("Logging.html", true);

        // create access formatter
        accessFormatter = new SimpleFormatter();
        accessLog.setFormatter(accessFormatter);
        logger.addHandler(accessLog);
        
        // create error formatter
        errorFormatter = new SimpleFormatter();
        errorLog.setFormatter(errorFormatter);
        logger.addHandler(errorLog);

        
        if (formatHtml)
        {
	        // create an HTML formatter
	        formatterHTML = new MyHtmlFormatter();
	        fileHTML.setFormatter(formatterHTML);
	        logger.addHandler(fileHTML);
        }
    }

    public void test()
    {
//		Logger logger = Logger.getLogger("io.joca.mytodo");
//		
//		FileHandler handler = null;
//		
//		try
//		{
//			handler = new FileHandler("mylog.xml");
//			logger.addHandler(handler);
//		} catch (Exception e) {
//			logger.log(Level.WARNING, "Error creating log file", e);
//		}
		logger.log(Level.INFO, "Info test");
		logger.log(Level.WARNING, "error test");
    }
    
	public static boolean getFormatHtml() {
		return MyLogger.formatHtml;
	}

	public static void setFormatHtml(boolean newFormatHtml) {
		MyLogger.formatHtml = newFormatHtml;
	}
}