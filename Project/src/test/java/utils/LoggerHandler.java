package utils;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.log4j.FileAppender;
import org.apache.log4j.Logger;
import org.apache.log4j.PatternLayout;

public class LoggerHandler {

    public static Logger logger = Logger.getLogger(LoggerHandler.class);

    static {
        initializeLogger();
    }
    /*
     * a.Method Name: initializeLogger
     * b.Author Name: Pruthviraj Batti
     * c.Description: To Initialize The Logger.
     * d.Return Type: void
     * e.Paramenter List:String message
     */
    private static void initializeLogger() {
        try {
            String timestamp = new SimpleDateFormat("yyyy.MM.dd.HH.mm.ss").format(new Date());
            String logFileName = "logs/logfile_" + timestamp + ".log";
            FileAppender fileAppender = new FileAppender(new PatternLayout("%d{yyyy.MM.dd.HH.mm.ss} %-5p %c - %m%n"), logFileName, true);
            logger.addAppender(fileAppender);
        } catch (Exception e) {
            logger.error(e);
        }
    }

    /*
     * a.Method Name: trace
     * b.Author Name: Pruthviraj Batti
     * c.Description: Logs a trace message.
     * d.Return Type: void
     * e.Paramenter List:String message
     */
    public static void trace(String message) {
        logger.trace(message);
    }
    /*
     * a.Method Name: debug
     * b.Author Name: Pruthviraj Batti
     * c.Description: Logs a debug message.
     * d.Return Type: void
     * e.Paramenter List:String message
     */
    public static void debug(String message) {
        logger.debug(message);
    }
    /*
     * a.Method Name: info
     * b.Author Name: Pruthviraj Batti
     * c.Description: Logs a info message.
     * d.Return Type: void
     * e.Paramenter List:String message
     */
    public static void info(String message) {
        logger.info(message);
    }
    /*
     * a.Method Name: warn
     * b.Author Name: Pruthviraj Batti
     * c.Description: Logs a warn message.
     * d.Return Type: void
     * e.Paramenter List:String message
     */
    public static void warn(String message) {
        logger.warn(message);
    }
     /*
     * a.Method Name: error
     * b.Author Name: Pruthviraj Batti
     * c.Description: Logs a error message.
     * d.Return Type: void
     * e.Paramenter List:String message
     */
    public static void error(String message) {
        logger.error(message);
    }
    /*
     * a.Method Name: fatal
     * b.Author Name: Pruthviraj Batti
     * c.Description: Logs a fatal message.
     * d.Return Type: void
     * e.Paramenter List:String message
     */
    public static void fatal(String message) {
        logger.fatal(message);
    }
 
}