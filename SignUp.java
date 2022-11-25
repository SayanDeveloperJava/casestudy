package com.tweetapp;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class SignUp {
	static final String DB_url = "jdbc:mysql://localhost:3306/casestudy";
    static final String user = "root";
    static final String pass = "pass@word1";
    static final String Query = "insert into registration(first_name,email,password) values(?,?,?)";
	
	public void signUp(){

	    try (Connection conn = DriverManager.getConnection(DB_url, user, pass);
	         PreparedStatement ps = conn.prepareStatement(Query)) {
	        Scanner sc = new Scanner(System.in);
	        System.out.println("enter  first name");
	        String fname = sc.next();
	        System.out.println("enter email");
	        String email = sc.next();
	        System.out.println("password");
	        String passw = sc.next();

	        ps.setString(1, fname);
	        ps.setString(2, email);
	        ps.setString(3, passw);
	        ps.executeUpdate();
	    } catch (SQLException e) {
	        e.printStackTrace();
	    }

	}
	
}
