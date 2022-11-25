package com.tweetapp;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class ViewAllUserTweets {
	static final String DB_url = "jdbc:mysql://localhost:3306/casestudy";
    static final String user = "root";
    static final String pass = "pass@word1";
    static final String Query = "select tweets from tweet";
    
    public static void viewAllUserTweets() {
        try (Connection conn = DriverManager.getConnection(DB_url, user, pass);
             PreparedStatement ps = conn.prepareStatement(Query)) {
            ResultSet rs=ps.executeQuery();
            while(rs.next()) {
            	System.out.println("all user tweets is here="+ rs.getString("tweets"));
            }
            
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }


}
