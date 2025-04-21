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

    public static void trace(String message) {
        logger.trace(message);
    }

    public static void debug(String message) {
        logger.debug(message);
    }

    public static void info(String message) {
        logger.info(message);
    }

    public static void warn(String message) {
        logger.warn(message);
    }

    public static void error(String message) {
        logger.error(message);
    }

    public static void fatal(String message) {
        logger.fatal(message);
    }
}