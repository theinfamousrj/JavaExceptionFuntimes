package com.rjh.javaexception;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

public class LoggableClass {
	static Logger logger;// = Logger.getLogger(LoggableClass.class);
	
	public LoggableClass() {
		logger = Logger.getLogger(LoggableClass.class);
		PropertyConfigurator.configure("./configs/log4j.configuration");
	}
	
	public void generateTraceReport() {
		logger.trace("Trace message");
	}
	
	public void generateDebugReport() {
		logger.debug("Debug message");
	}
	
	public void generateInfoReport() {
		logger.info("Info message");
	}
	
	public void generateWarnReport() {
		logger.warn("Warn message");
	}
	
	public void generateErrorReport() {
		logger.error("Error message");
	}
	
	public void generateFatalReport() {
		logger.fatal("Fatal message");
	}
	
	public void generateAllReports() {
		this.generateTraceReport();
		this.generateDebugReport();
		this.generateInfoReport();
		this.generateWarnReport();
		this.generateErrorReport();
		this.generateFatalReport();
	}
}
