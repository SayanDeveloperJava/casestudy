package com.tweetapp;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class PostTweet {
	static final String DB_url = "jdbc:mysql://localhost:3306/casestudy";
    static final String user = "root";
    static final String pass = "pass@word1";
    static final String Query = "update tweet set tweets=? where email=?";
	
	public static void postATweet(){

	    try (Connection conn = DriverManager.getConnection(DB_url, user, pass);
	         PreparedStatement ps = conn.prepareStatement(Query)) {
	        Scanner sc = new Scanner(System.in);
	        System.out.println("post a tweet here");
	        String twt = sc.next();
	        
	        ps.setString(1, twt);
	        ps.setString(2, SignIn.email1);
	        ps.executeUpdate();
	    } catch (SQLException e) {
	        e.printStackTrace();
	    }


}
}
