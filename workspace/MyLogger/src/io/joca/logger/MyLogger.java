package io.joca.logger;

import java.io.IOException;
import java.util.logging.FileHandler;
import java.util.logging.Formatter;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

public class MyLogger {
	static private FileHandler fileTxt;
    static private SimpleFormatter formatterTxt;

    static private FileHandler fileHTML;
    static private Formatter formatterHTML;
    
    static public boolean formatHtml;

    static public void setup() throws IOException {
    	// do not format HTML
    	formatHtml = false;
    	    	
        // get the global logger to configure it
        Logger logger = Logger.getLogger(Logger.GLOBAL_LOGGER_NAME);

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

        
        if (formatHtml)
        {
	        // create an HTML formatter
	        formatterHTML = new MyHtmlFormatter();
	        fileHTML.setFormatter(formatterHTML);
	        logger.addHandler(fileHTML);
        }
    }

	public static boolean getFormatHtml() {
		return MyLogger.formatHtml;
	}

	public static void setFormatHtml(boolean newFormatHtml) {
		MyLogger.formatHtml = newFormatHtml;
	}
}