package com.tweetapp;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ViewAllUsers {
	static final String DB_url = "jdbc:mysql://localhost:3306/casestudy";
    static final String user = "root";
    static final String pass = "pass@word1";
    static final String Query = "select first_name from registration";
    
    public static void viewAllUser() {
        try (Connection conn = DriverManager.getConnection(DB_url, user, pass);
             PreparedStatement ps = conn.prepareStatement(Query)) {
            ResultSet rs=ps.executeQuery();
            while(rs.next()) {
            	System.out.println("all user name is here="+ rs.getString("first_name"));
            }
            
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }


}
