package com.group1.data;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DbMgr {
	private String userName;
	private String password;
	private String url;
	private String className;
	
	private Connection connection ;
	public DbMgr(String userName, String password, String url, String className) throws ClassNotFoundException, SQLException {
		super();
		this.userName = userName;
		this.password = password;
		this.url = url;
		this.className = className;
		Class.forName(className);
		String dbUrl = System.getenv("JDBC_DATABASE_URL");
		this.connection =
				DriverManager.getConnection(dbUrl);
		
	}
	
	public Connection getConnection(){
		return connection;
	}
	
	
}
