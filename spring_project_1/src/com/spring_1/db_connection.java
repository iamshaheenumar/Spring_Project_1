package com.spring_1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class db_connection {
	Connection conn;
	db_connection(){
		try{
			Class.forName("com.mysql.jdbc.Driver");
		}
		catch(ClassNotFoundException e ){
			e.printStackTrace();
		}
		String connectionURL="jdbc:mysql://localhost/db_test";
		try{
		conn = DriverManager.getConnection(connectionURL,"root","root");
		if(conn!=null){
			System.out.println("connected");
		}
		}catch(SQLException e){
			e.printStackTrace();
		}
	}	

}
