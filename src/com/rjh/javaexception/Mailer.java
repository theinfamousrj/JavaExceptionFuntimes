package com.rjh.javaexception;

import org.apache.commons.mail.*;

public class Mailer {

	//We only need simple email for logging.
	private SimpleEmail email;
	//We will need to store smtp information for outgoing stuff.
	private String smtpUser, smtpPass, smtpServer;
	private int smtpPort;
	
	public Mailer() {
		email = new SimpleEmail();
		//I'm hardcoding this port for now.
		this.smtpPort = 587;
	}
	
	public void setSMTP(String server, String user, String password) {
		this.smtpServer = server;
		this.smtpUser = user;
		this.smtpPass = password;
	}
	
	public void createAndSendSimpleEmailWithAuth(String from, String to, String subject, String message) {
		email.setHostName(this.smtpServer);
		email.setSmtpPort(this.smtpPort);
		email.setAuthenticator(new DefaultAuthenticator(this.smtpUser, this.smtpPass));
		email.setTLS(true);
		this.createAndSendSimpleEmail(from, to, subject, message);
	}
	
	public void createAndSendSimpleEmail(String from, String to, String subject, String message) {
		try {
			email.setDebug(false);
			email.setFrom(from);
			email.addTo(to);
			email.setSubject(subject);
			email.setMsg(message);
			System.out.println("Sending the email...");
	        email.send();
	        System.out.println("Your email has been sent!");
		} catch (Exception e) {
	        System.out.println("Your email has not been sent!");
	        e.printStackTrace();
	    }
	}
	
}
