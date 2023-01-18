package com.supplier;

import java.sql.Connection;
import java.sql.DriverManager;

	public class dbconnect {

		private static String url="jdbc:mysql://localhost:3306/hospital_management_system";
		private static String user="root";
		private static String pass="123456oshi";
		private static Connection con;

		public static Connection getConnection() {
			try {// create connection 
				
				Class.forName("com.mysql.jdbc.Driver");
				
				con=DriverManager.getConnection(url, user, pass);
				
				//con.close();
				}
			catch(Exception e) {
				System.out.println("Database connection is not success!");//if connection fails
			}
			return con;
			
		}

	
}
