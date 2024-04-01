package com.esha;

import java.sql.Connection;
import java.sql.DriverManager;

public class Connect {

	static Connection con;
	public static Connection createCon() {
		// loading driver
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			//creating connection
			String user="root";
			String password="eshank";
			String url="jdbc:mysql://localhost:3306/jdbc";
			con=DriverManager.getConnection(url,user,password);
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		return con;
	}
}
