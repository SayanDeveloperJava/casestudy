package com.tweetapp;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class GuestUser {
	static final String DB_url = "jdbc:mysql://localhost:3306/casestudy";
    static final String user = "root";
    static final String pass = "pass@word1";
    static final String Query = "insert into registration(first_name,email,password) values(?,?,?)";

	public static void main(String[] args) {
		
		SignUp sup=new SignUp();
		SignIn sin=new SignIn();
		ForgetPassword fp=new ForgetPassword();
		LoggedInUser luser=new LoggedInUser();
		
			while(true) {
				System.out.println("1.Register 2.Login 3.Forgot Password");
				System.out.println("Enter your choice");
				Scanner sc=new Scanner(System.in);
				int ch=sc.nextInt();
				switch (ch) {
			      case 1:
			    	  sup.signUp(); 
			        break;
			      case 2:
			        sin.signIn();
			        if(sin.flag==1) {
			        	luser.menuForLoggedInUser();
			        }
			        break;
			      case 3:
			        fp.forgetPassword();
			        break;
			        
			      default:
			    	    System.out.println("please choose a valid options");  
			      
			   
				}
				
			}
	}

}
