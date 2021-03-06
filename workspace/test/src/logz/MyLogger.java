package logz;

import java.io.IOException;
import java.util.logging.FileHandler;
import java.util.logging.Formatter;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

/**
 * Utility class to log events <br/><br/>
 * Default log files are: <br/>
 * &nbsp;&nbsp; - MyLogger.txt <br/>
 * &nbsp;&nbsp; - Mylogger.html <br/>
 * 
 * @author Joao Berardo
 * @since June 29, 2017
 * @version 1.0
 *
 */
public class MyLogger {
	static private FileHandler fileTxt;
    static private SimpleFormatter formatterTxt;

    static private FileHandler fileHTML;
    static private Formatter formatterHTML;

    // get the global logger to configure it
    static Logger logger = Logger.getLogger(Logger.GLOBAL_LOGGER_NAME);
    
    public MyLogger() throws IOException
    {
        // true - show messages on console
        // false - suppress message on console
        logger.setUseParentHandlers(false);

        logger.setLevel(Level.INFO);
        
        fileTxt = new FileHandler("Logging.txt", true);
        fileHTML = new FileHandler("Logging.html", true);

        // create a TXT formatter
        formatterTxt = new SimpleFormatter();
        fileTxt.setFormatter(formatterTxt);
        logger.addHandler(fileTxt);

        // create an HTML formatter
        formatterHTML = new MyHtmlFormatter();
        fileHTML.setFormatter(formatterHTML);
        logger.addHandler(fileHTML);
    }
    
    public static void log(String msg)
    {
    	logger.info(msg);
    }
}