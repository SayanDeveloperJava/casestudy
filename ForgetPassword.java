package com.tweetapp;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class ForgetPassword {
	static final String DB_url = "jdbc:mysql://localhost:3306/casestudy";
    static final String user = "root";
    static final String pass = "pass@word1";
    static final String sql = "update registration set password=? where email=?";
    
    public void forgetPassword(){
    	try (Connection conn = DriverManager.getConnection(DB_url, user, pass);
                PreparedStatement ps = conn.prepareStatement(sql);
                ) {
    		Scanner sc=new Scanner(System.in);
    		System.out.println("enter email to change password");
	        String email = sc.next();
	        System.out.println("enter new password");
	        String passw = sc.next();
	      
	        
	        ps.setString(1, passw);
	        ps.setString(2, email);
            ps.executeUpdate();

           } catch (SQLException e) {
               e.printStackTrace();
           }

    }
	
}
