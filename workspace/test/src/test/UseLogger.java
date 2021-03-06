package test;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

import logz.MyLogger;

public class UseLogger {
	// use the classname for the logger, this way you can refactor
    private final static Logger LOGGER = Logger.getLogger(Logger.GLOBAL_LOGGER_NAME);


    public static void log(String msg) {
        // ... more code

        // now we demo the logging

        // set the LogLevel to Severe, only severe Messages will be written
//        LOGGER.setLevel(Level.SEVERE);
//        LOGGER.severe("Severe Log");
//        LOGGER.warning("Warning Log");
//        LOGGER.info("Info Log");
//        LOGGER.finest("Really not important");

        // set the LogLevel to Info, severe, warning and info will be written
        // finest is still not written
        LOGGER.setLevel(Level.INFO);
//        LOGGER.severe("Severe Log");
//        LOGGER.warning("Warning Log");
        LOGGER.info(msg);
//        LOGGER.finest("Really not important");
    }

    public static void main(String[] args)
    {

       	MyLogger.log("teste1");
       	
       	OtherTest t = new OtherTest();
       	
        t.setMsg("yooo");
        String a = t.getMsg();
        t.setMsg("wuhooo");
        t.getMsg();
    }
}