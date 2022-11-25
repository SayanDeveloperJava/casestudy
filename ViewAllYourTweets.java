package com.tweetapp;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class ViewAllYourTweets {
	static final String DB_url = "jdbc:mysql://localhost:3306/casestudy";
    static final String user = "root";
    static final String pass = "pass@word1";
    static final String Query = "select tweets from tweet where email=?;";
    
    public static void viewAllYourTweets() {
        try (Connection conn = DriverManager.getConnection(DB_url, user, pass);
             PreparedStatement ps = conn.prepareStatement(Query)) {
            Scanner sc = new Scanner(System.in);
        
            ps.setString(1,SignIn.email1);
            ResultSet rs=ps.executeQuery();
            while(rs.next()) {
            	System.out.println("user tweets is here="+ rs.getString("tweets"));
            }
            
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

}
