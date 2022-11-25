package com.tweetapp;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class SignIn {
	static final String DB_url = "jdbc:mysql://localhost:3306/casestudy";
    static final String user = "root";
    static final String pass = "pass@word1";
    static final String Query = "select * from registration where email=? AND password=?;";
    int flag=0;
    static String email1="";
    static String password1="";

    public void signIn() {
        try (Connection conn = DriverManager.getConnection(DB_url, user, pass);
             PreparedStatement ps = conn.prepareStatement(Query)) {
            Scanner sc = new Scanner(System.in);
        
            System.out.println("enter email");
            String email = sc.next();
            System.out.println("password");
            String password = sc.next();

            
            ps.setString(1, email);
            ps.setString(2, password);
            ResultSet rs=ps.executeQuery();
            if(rs.next()) {
            	System.out.println("login successful");
            	flag=1;
            	email1=email;
            	password1=password;
            	
            }
            else {
            	System.out.println("login fail");
            }
            
            
            
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}

