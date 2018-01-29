package com.group1.data;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DbMgr {
	public static Connection getConnection() throws ClassNotFoundException, SQLException {
    String dbUrl = System.getenv("JDBC_DATABASE_URL");
 this.connection = DriverManager.getConnection(dbUrl);
		return connection;
	}
	
	
}
