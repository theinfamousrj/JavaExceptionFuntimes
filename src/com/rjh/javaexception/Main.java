package com.rjh.javaexception;

import java.util.Scanner;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
//		Scanner in = new Scanner(System.in);
//		
//		//testing the mailer
//		Mailer mailer = new Mailer();
//		
//		System.out.print("Server: ");
//		String server = in.nextLine();
//		
//		System.out.print("Username: ");
//		String username = in.nextLine();
//		
//		System.out.print("Password: ");
//		String password = in.nextLine();
//		
//		mailer.setSMTP(server, username, password);
//		
//		System.out.print("From: ");
//		String from = in.nextLine();
//		
//		System.out.print("To: ");
//		String to = in.nextLine();
//		
//		System.out.print("Subject: ");
//		String subject = in.nextLine();
//		
//		System.out.print("Message: ");
//		String message = in.nextLine();
//		
//		mailer.createAndSendSimpleEmailWithAuth(from, to, subject, message);
		
		LoggableClass lc = new LoggableClass();
		lc.generateAllReports();
		
	}

}
