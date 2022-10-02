package com.quiz;

import java.sql.Connection;
import java.sql.DriverManager;

public class JdbcConnection {
	
	public Connection getConnection() {
		Connection connection =null;
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			connection =DriverManager.getConnection("jdbc:mysql://localhost:3306/mini_project", "root", "root");
			
		}catch(Exception e){
			e.printStackTrace();
		}
		return connection;
	}

}
