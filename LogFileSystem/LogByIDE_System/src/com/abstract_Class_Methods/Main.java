package com.abstract_Class_Methods;

import java.io.IOException;
import java.util.logging.FileHandler;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

class LogToFile {

    public static void main(String[] args) {

        Logger logger = Logger.getLogger("MyLog");
        FileHandler logFile;

        try {

            // This block configure the logger with handler and formatter
            logFile = new FileHandler("C:/temp/test/MyLogFile.log");
            logger.addHandler(logFile);
            SimpleFormatter formatter = new SimpleFormatter();
            logFile.setFormatter(formatter);

            // the following statement is used to log any messages
            logger.info("This is Our Another log");

        } catch (SecurityException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        logger.info("Am Fine My Dear");

    }
}
