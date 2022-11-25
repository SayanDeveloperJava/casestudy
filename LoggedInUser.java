package com.tweetapp;

import java.util.Scanner;

public class LoggedInUser {

	public void menuForLoggedInUser() {
		
		while(true) {
			System.out.println("1.Post a tweet 2.View all your tweets 3.View all tweets"
					+ " 4.View all users 5.Reset password 6.Logout");
			System.out.println("Enter your choice");
			Scanner sc=new Scanner(System.in);
			int ch1=sc.nextInt();
			switch (ch1) { 
		      case 1:
		    	  PostTweet.postATweet();
		        break;
		      case 2:
		    	  ViewAllYourTweets.viewAllYourTweets();
		        break;
		      case 3:
		    	  ViewAllUserTweets.viewAllUserTweets();
		        break;
		      case 4:
		    	  ViewAllUsers.viewAllUser();
			        break; 
		      case 5:
			        ResetPassword.resetPassword();
			        break;  
		      case 6:
			        System.out.println("logout successfully");
			        break;
		        
		      default:
		    	    System.out.println("please choose a valid options");  
		      
		   
			}
			
		}
		

	}

}
