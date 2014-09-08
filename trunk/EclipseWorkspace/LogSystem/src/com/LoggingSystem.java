package com;
import org.apache.log4j.*;
public class LoggingSystem {

	static Category cat = Category.getInstance(LoggingSystem.class.getName());
	
	public static void main(String args[]) {
        // Try a few logging methods
        cat.debug("Start of main()");
        cat.info("Just testing a log message with priority set to INFO");
        cat.warn("Just testing a log message with priority set to WARN");
        cat.error("Just testing a log message with priority set to ERROR");
        cat.fatal("Just testing a log message with priority set to FATAL");

        // Alternate but INCONVENIENT form
        cat.log(Priority.DEBUG, "Calling init()");

        new LoggingSystem().init();
    }

    public void init() {
        java.util.Properties prop = System.getProperties();
        java.util.Enumeration enum2 = prop.propertyNames();

        cat.info("***System Environment As Seen By Java***");
        cat.debug("***Format: PROPERTY = VALUE***");

        while (enum2.hasMoreElements()) {
            String key = (String) enum2.nextElement();
            cat.info(key + " = " + System.getProperty(key));
        }
    }	

}
