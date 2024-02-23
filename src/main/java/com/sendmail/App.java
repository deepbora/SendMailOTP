package com.sendmail;

import java.util.Scanner;

//import javax.security.auth.Subject;





public class App {
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	GmailSender gEmailSender =	new GmailSender();
	
	
	//This is from Genarate Random number
	int random=(int)(Math.random() *9000)+1000;

    String OTP= String.valueOf(random);
    
    //user Input(for dynamic mail address)
    System.out.println("Enter your Email address: ");
    Scanner scanner=new Scanner(System.in);
    String to= scanner.nextLine();

		//for static mail(optional)
//	String to="Enter the Reciver mail address ";
	String from="Enter Sender mail address(means your mail address)";
	String subject="Sending Email using Gmail";
	String text="This is from deep  ,Your OTP is:"+ OTP;
	
	boolean b=gEmailSender.sendEmail(to, from, subject, text);
	
	if(b) {
		
		System.out.println("Email is send successfully..");
		
		//Check OTP(validation)
		System.out.println("Enter the OTP: ");
		 String CheckOtp= scanner.nextLine();
		 
		if(CheckOtp.equals(OTP)) {
			
			System.out.println("You successfully log in");
			
		}else{
			System.out.println("Wrong OTP");
			
		}
		
		
		
	}else {
		System.out.println("Somethig problem"); 
	}
	

	}

}
